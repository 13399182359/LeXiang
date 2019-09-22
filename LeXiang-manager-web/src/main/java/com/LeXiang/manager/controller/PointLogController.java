package com.LeXiang.manager.controller;


import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.PointLogService;
import com.LeXiang.pojo.Member;
import com.LeXiang.pojo.PointMember;
import com.LeXiang.pojo.Pointlog;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.remoting.exchange.Response;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jboss.netty.handler.codec.http.HttpResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import util.ExportExcel;
import util.FastDFSClient;
import util.UpLoadFileUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("pointlog")
public class PointLogController {
    private static final String FILE_SERVER_URL ="http://192.168.11.128/" ;
    @Reference
    private PointLogService pointLogService;


    @RequestMapping("queryPoint")
    public PageResult queryPoint(Integer page, Integer rows, Pointlog pointlog, Member member){

        return  pointLogService.queryPoint(page,rows,pointlog,member);
    }
    @RequestMapping("deletePointLog")
    public Result deletePointLog(Pointlog pointlog){
        return  pointLogService.deletePointLog(pointlog);
    }
    @RequestMapping("queryMemberUserName")
    public Map<String,Object>  queryMemberUserName(Member member){
        return pointLogService.queryMemberUserName(member);
    }

    @RequestMapping("updatePoint")
    public  Result updatePoint(Pointlog pointlog,Member member){

        return  pointLogService.updatePoint(pointlog,member);
    }


   /* @RequestMapping("upFile")
    public  String upFile(@RequestParam("upFile") MultipartFile comm, HttpServletRequest request){

        return UpLoadFileUtil.uploadFile(comm,request,"/img");
    }*/

    @RequestMapping("queryEcharts")
    public  Map<String,Object> queryEcharts(){
        return pointLogService.queryEcharts();
    }


    @RequestMapping("exportContentList")
    public  void exportContentList(HttpServletResponse res){
    List<Pointlog> pointlogs=pointLogService.findAll();
    String title="内容信息";
    String rowsName[]=new String[]{"序号","新增日期","修改日期","版本号","当前积分","增加值","扣除值","描述","类型","会员id"};
    List<Object[]> objects=new ArrayList<Object[]>();
        for (int i = 0; i <pointlogs.size() ; i++) {
            Object[] obj=new Object[rowsName.length];
            obj[0]=pointlogs.get(i).getId();
            obj[1]=pointlogs.get(i).getCreateddate();
            obj[2]=pointlogs.get(i).getLastmodifieddate();
            obj[3]=pointlogs.get(i).getVersion();
            obj[4]=pointlogs.get(i).getBalance();
            obj[5]=pointlogs.get(i).getCredit();
            obj[6]=pointlogs.get(i).getDebit();
            obj[7]=pointlogs.get(i).getMemo();
            obj[8]=pointlogs.get(i).getType();
            obj[9]=pointlogs.get(i).getMemberId();
            objects.add(obj);
            }
        ExportExcel exportExcel=new ExportExcel(title,rowsName,objects,res);
        try {
            exportExcel.export();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @RequestMapping("fileupload")
    public Result fileupload(@RequestParam("upImg") CommonsMultipartFile file, HttpServletRequest request,HttpServletResponse response) {
        String oldFileName = file.getOriginalFilename();
        String path = request.getSession().getServletContext().getRealPath("")+"/img";
        File file1 = new File(path);
        List<Pointlog> pointlogs=new ArrayList<>();
        if (!file1.exists()) {
            file1.mkdir();
        }
       String newFileName = UUID.randomUUID().toString() + "-" + oldFileName;
        try {
            file.transferTo(new File(path + "/" + newFileName));
        } catch (IllegalStateException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       String url=path + "/" + newFileName;
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String  orignalFilename=file.getOriginalFilename();

        String exName=orignalFilename.substring(orignalFilename.indexOf(".")+1);
        try {
        if(exName.equals("xls")){
            File file2= new File(url);
            System.out.println(file1);
            HSSFWorkbook hssfWorkbook=new HSSFWorkbook(new FileInputStream(file2));
            System.out.println(hssfWorkbook);
            System.out.println(1);
            for (int i = 0; i <hssfWorkbook.getNumberOfSheets() ; i++) {
                HSSFSheet  sheet=hssfWorkbook.getSheetAt(i);
                for (int j = 3; j < sheet.getPhysicalNumberOfRows(); j++) {
                    HSSFRow row=sheet.getRow(j);
                    Pointlog pointlog=new Pointlog();
                    if(PointLogController.getCellValue(row.getCell(0))!=null && !PointLogController.getCellValue(row.getCell(0)).equals("")){
                        pointlog.setId(Long.valueOf(PointLogController.getCellValue(row.getCell(0))));
                    }
                    if(PointLogController.getCellValue(row.getCell(1))!=null && !PointLogController.getCellValue(row.getCell(1)).equals("")){
                        pointlog.setCreateddate(simpleDateFormat.parse(PointLogController.getCellValue(row.getCell(2))));
                    }
                    if(PointLogController.getCellValue(row.getCell(2))!=null && !PointLogController.getCellValue(row.getCell(2)).equals("")){
                        pointlog.setLastmodifieddate(simpleDateFormat.parse(PointLogController.getCellValue(row.getCell(2))));
                    }
                    if(PointLogController.getCellValue(row.getCell(3))!=null && !PointLogController.getCellValue(row.getCell(3)).equals("")){
                        pointlog.setVersion(Long.valueOf(PointLogController.getCellValue(row.getCell(3))));
                    } if(PointLogController.getCellValue(row.getCell(4))!=null && !PointLogController.getCellValue(row.getCell(4)).equals("")){
                        pointlog.setBalance(Long.valueOf(PointLogController.getCellValue(row.getCell(4))));
                    }
                    if(PointLogController.getCellValue(row.getCell(5))!=null && !PointLogController.getCellValue(row.getCell(5)).equals("")){
                        pointlog.setCredit(Long.valueOf(PointLogController.getCellValue(row.getCell(5))));
                    }
                    if(PointLogController.getCellValue(row.getCell(6))!=null && !PointLogController.getCellValue(row.getCell(6)).equals("")){
                        pointlog.setDebit(Long.valueOf(PointLogController.getCellValue(row.getCell(6))));
                    }
                    pointlog.setMemo(PointLogController.getCellValue(row.getCell(7)));
                    if(PointLogController.getCellValue(row.getCell(8))!=null && !PointLogController.getCellValue(row.getCell(8)).equals("")){
                        pointlog.setType(Integer.valueOf(PointLogController.getCellValue(row.getCell(8))));
                    }
                    if(PointLogController.getCellValue(row.getCell(9))!=null && !PointLogController.getCellValue(row.getCell(9)).equals("")){
                        pointlog.setMemberId(Long.valueOf(PointLogController.getCellValue(row.getCell(9))));
                    }
                    pointlogs.add(pointlog);



                }
            }


        }else if(exName.equals("xlsx")){
            XSSFWorkbook  hssfWorkbook=new XSSFWorkbook(new FileInputStream(url));
            for (int i = 0; i <hssfWorkbook.getNumberOfSheets() ; i++) {
                XSSFSheet sheet=hssfWorkbook.getSheetAt(i);
                for (int j = 3; j < sheet.getPhysicalNumberOfRows(); j++) {
                    XSSFRow row=sheet.getRow(j);
                    Pointlog pointlog=new Pointlog();
                    if(PointLogController.getCellValue(row.getCell(0))!=null && !PointLogController.getCellValue(row.getCell(0)).equals("")){
                        pointlog.setId(Long.valueOf(PointLogController.getCellValue(row.getCell(0))));
                    }
                    if(PointLogController.getCellValue(row.getCell(1))!=null && !PointLogController.getCellValue(row.getCell(1)).equals("")){
                        pointlog.setCreateddate(simpleDateFormat.parse(PointLogController.getCellValue(row.getCell(2))));
                    }
                    if(PointLogController.getCellValue(row.getCell(2))!=null && !PointLogController.getCellValue(row.getCell(2)).equals("")){
                        pointlog.setLastmodifieddate(simpleDateFormat.parse(PointLogController.getCellValue(row.getCell(2))));
                    }
                    if(PointLogController.getCellValue(row.getCell(3))!=null && !PointLogController.getCellValue(row.getCell(3)).equals("")){
                        pointlog.setVersion(Long.valueOf(PointLogController.getCellValue(row.getCell(3))));
                    } if(PointLogController.getCellValue(row.getCell(4))!=null && !PointLogController.getCellValue(row.getCell(4)).equals("")){
                        pointlog.setBalance(Long.valueOf(PointLogController.getCellValue(row.getCell(4))));
                    }
                    if(PointLogController.getCellValue(row.getCell(5))!=null && !PointLogController.getCellValue(row.getCell(5)).equals("")){
                        pointlog.setCredit(Long.valueOf(PointLogController.getCellValue(row.getCell(5))));
                    }
                    if(PointLogController.getCellValue(row.getCell(6))!=null && !PointLogController.getCellValue(row.getCell(6)).equals("")){
                        pointlog.setDebit(Long.valueOf(PointLogController.getCellValue(row.getCell(6))));
                    }
                    pointlog.setMemo(PointLogController.getCellValue(row.getCell(7)));
                    if(PointLogController.getCellValue(row.getCell(8))!=null && !PointLogController.getCellValue(row.getCell(8)).equals("")){
                        pointlog.setType(Integer.valueOf(PointLogController.getCellValue(row.getCell(8))));
                    }
                    if(PointLogController.getCellValue(row.getCell(9))!=null && !PointLogController.getCellValue(row.getCell(9)).equals("")){
                        pointlog.setMemberId(Long.valueOf(PointLogController.getCellValue(row.getCell(9))));
                    }
                    pointlogs.add(pointlog);



                }
            }

        }


    }catch (Exception e){
        e.printStackTrace();
    }




        pointLogService.insert(pointlogs);
        return  new  Result(true,"导入成功");
    }


    @RequestMapping("upFile")
    public  Result importCotentList(@RequestParam("upFile")MultipartFile file,HttpServletRequest request,HttpServletResponse response){
        List<Pointlog> pointlogs=new ArrayList<>();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String s = UpLoadFileUtil.uploadFile(file, request, "/img");
        System.out.println(s);
        String  orignalFilename=file.getOriginalFilename();

       String exName=orignalFilename.substring(orignalFilename.indexOf(".")+1);
       try {

           FastDFSClient dfsClient=new FastDFSClient("classpath:config/fdfs_client.conf");
           String path =dfsClient.uploadFile(file.getBytes(),exName);
           String url=FILE_SERVER_URL+path;

           if(exName.equals("xls")){
               File file1 = new File(url);
               System.out.println(file1);
               HSSFWorkbook hssfWorkbook=new HSSFWorkbook(new FileInputStream(file1));
               System.out.println(hssfWorkbook);
               System.out.println(1);
               for (int i = 0; i <hssfWorkbook.getNumberOfSheets() ; i++) {
                   HSSFSheet  sheet=hssfWorkbook.getSheetAt(i);
                   for (int j = 3; j < sheet.getPhysicalNumberOfRows(); j++) {
                       HSSFRow row=sheet.getRow(j);
                       Pointlog pointlog=new Pointlog();
                       if(PointLogController.getCellValue(row.getCell(0))!=null && !PointLogController.getCellValue(row.getCell(0)).equals("")){
                            pointlog.setId(Long.valueOf(PointLogController.getCellValue(row.getCell(0))));
                       }
                       if(PointLogController.getCellValue(row.getCell(1))!=null && !PointLogController.getCellValue(row.getCell(1)).equals("")){
                            pointlog.setCreateddate(simpleDateFormat.parse(PointLogController.getCellValue(row.getCell(2))));
                       }
                       if(PointLogController.getCellValue(row.getCell(2))!=null && !PointLogController.getCellValue(row.getCell(2)).equals("")){
                            pointlog.setLastmodifieddate(simpleDateFormat.parse(PointLogController.getCellValue(row.getCell(2))));
                       }
                       if(PointLogController.getCellValue(row.getCell(3))!=null && !PointLogController.getCellValue(row.getCell(3)).equals("")){
                           pointlog.setVersion(Long.valueOf(PointLogController.getCellValue(row.getCell(3))));
                       } if(PointLogController.getCellValue(row.getCell(4))!=null && !PointLogController.getCellValue(row.getCell(4)).equals("")){
                           pointlog.setBalance(Long.valueOf(PointLogController.getCellValue(row.getCell(4))));
                       }
                       if(PointLogController.getCellValue(row.getCell(5))!=null && !PointLogController.getCellValue(row.getCell(5)).equals("")){
                           pointlog.setCredit(Long.valueOf(PointLogController.getCellValue(row.getCell(5))));
                       }
                       if(PointLogController.getCellValue(row.getCell(6))!=null && !PointLogController.getCellValue(row.getCell(6)).equals("")){
                           pointlog.setDebit(Long.valueOf(PointLogController.getCellValue(row.getCell(6))));
                       }
                       pointlog.setMemo(PointLogController.getCellValue(row.getCell(7)));
                       if(PointLogController.getCellValue(row.getCell(8))!=null && !PointLogController.getCellValue(row.getCell(8)).equals("")){
                           pointlog.setType(Integer.valueOf(PointLogController.getCellValue(row.getCell(8))));
                       }
                       if(PointLogController.getCellValue(row.getCell(9))!=null && !PointLogController.getCellValue(row.getCell(9)).equals("")){
                           pointlog.setMemberId(Long.valueOf(PointLogController.getCellValue(row.getCell(9))));
                       }
                       pointlogs.add(pointlog);


                       
                   }
               }


           }else if(exName.equals("xlsx")){
               XSSFWorkbook  hssfWorkbook=new XSSFWorkbook(new FileInputStream(url));
               for (int i = 0; i <hssfWorkbook.getNumberOfSheets() ; i++) {
                   XSSFSheet sheet=hssfWorkbook.getSheetAt(i);
                   for (int j = 3; j < sheet.getPhysicalNumberOfRows(); j++) {
                       XSSFRow row=sheet.getRow(j);
                       Pointlog pointlog=new Pointlog();
                       if(PointLogController.getCellValue(row.getCell(0))!=null && !PointLogController.getCellValue(row.getCell(0)).equals("")){
                           pointlog.setId(Long.valueOf(PointLogController.getCellValue(row.getCell(0))));
                       }
                       if(PointLogController.getCellValue(row.getCell(1))!=null && !PointLogController.getCellValue(row.getCell(1)).equals("")){
                           pointlog.setCreateddate(simpleDateFormat.parse(PointLogController.getCellValue(row.getCell(2))));
                       }
                       if(PointLogController.getCellValue(row.getCell(2))!=null && !PointLogController.getCellValue(row.getCell(2)).equals("")){
                           pointlog.setLastmodifieddate(simpleDateFormat.parse(PointLogController.getCellValue(row.getCell(2))));
                       }
                       if(PointLogController.getCellValue(row.getCell(3))!=null && !PointLogController.getCellValue(row.getCell(3)).equals("")){
                           pointlog.setVersion(Long.valueOf(PointLogController.getCellValue(row.getCell(3))));
                       } if(PointLogController.getCellValue(row.getCell(4))!=null && !PointLogController.getCellValue(row.getCell(4)).equals("")){
                           pointlog.setBalance(Long.valueOf(PointLogController.getCellValue(row.getCell(4))));
                       }
                       if(PointLogController.getCellValue(row.getCell(5))!=null && !PointLogController.getCellValue(row.getCell(5)).equals("")){
                           pointlog.setCredit(Long.valueOf(PointLogController.getCellValue(row.getCell(5))));
                       }
                       if(PointLogController.getCellValue(row.getCell(6))!=null && !PointLogController.getCellValue(row.getCell(6)).equals("")){
                           pointlog.setDebit(Long.valueOf(PointLogController.getCellValue(row.getCell(6))));
                       }
                       pointlog.setMemo(PointLogController.getCellValue(row.getCell(7)));
                       if(PointLogController.getCellValue(row.getCell(8))!=null && !PointLogController.getCellValue(row.getCell(8)).equals("")){
                           pointlog.setType(Integer.valueOf(PointLogController.getCellValue(row.getCell(8))));
                       }
                       if(PointLogController.getCellValue(row.getCell(9))!=null && !PointLogController.getCellValue(row.getCell(9)).equals("")){
                           pointlog.setMemberId(Long.valueOf(PointLogController.getCellValue(row.getCell(9))));
                       }
                       pointlogs.add(pointlog);



                   }
               }

           }


       }catch (Exception e){
            e.printStackTrace();
       }




        pointLogService.insert(pointlogs);
        return  new  Result(true,"导入成功");
    }

    private static String getCellValue(XSSFCell cell){
        String value = null;
        //简单的查检列类型
        switch(cell.getCellType())
        {
            case XSSFCell.CELL_TYPE_STRING://字符串
                value = cell.getRichStringCellValue().getString();
                break;
            case XSSFCell.CELL_TYPE_NUMERIC://数字
                long dd = (long)cell.getNumericCellValue();
                value = dd+"";
                break;
            case XSSFCell.CELL_TYPE_BLANK:
                value = "";
                break;
            case XSSFCell.CELL_TYPE_FORMULA:
                value = String.valueOf(cell.getCellFormula());
                break;
            case HSSFCell.CELL_TYPE_BOOLEAN://boolean型值
                value = String.valueOf(cell.getBooleanCellValue());
                break;
            case XSSFCell.CELL_TYPE_ERROR:
                value = String.valueOf(cell.getErrorCellValue());
                break;
            default:
                break;
        }
        return value;
    }



    private static String getCellValue(HSSFCell cell){
        String value = null;
        //简单的查检列类型
        switch(cell.getCellType())
        {
            case HSSFCell.CELL_TYPE_STRING://字符串
                value = cell.getRichStringCellValue().getString();
                break;
            case HSSFCell.CELL_TYPE_NUMERIC://数字
                long dd = (long)cell.getNumericCellValue();
                value = dd+"";
                break;
            case HSSFCell.CELL_TYPE_BLANK:
                value = "";
                break;
            case HSSFCell.CELL_TYPE_FORMULA:
                value = String.valueOf(cell.getCellFormula());
                break;
            case HSSFCell.CELL_TYPE_BOOLEAN://boolean型值
                value = String.valueOf(cell.getBooleanCellValue());
                break;
            case HSSFCell.CELL_TYPE_ERROR:
                value = String.valueOf(cell.getErrorCellValue());
                break;
            default:
                break;
        }
        return value;
    }

}
