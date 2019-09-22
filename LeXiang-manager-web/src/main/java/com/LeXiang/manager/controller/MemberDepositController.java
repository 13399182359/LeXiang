package com.LeXiang.manager.controller;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.MemberDepositService;
import com.LeXiang.manager.service.PointLogService;
import com.LeXiang.pojo.Member;
import com.LeXiang.pojo.Memberdepositlog;
import com.LeXiang.pojo.Pointlog;
import com.alibaba.dubbo.config.annotation.Reference;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import util.ExportExcel;
import util.FastDFSClient;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;



@RestController
@RequestMapping("memberdeposit")
public class MemberDepositController {
    private static final String FILE_SERVER_URL ="http://192.168.11.128/" ;
    @Reference
    private MemberDepositService memberDepositService;
    @Reference
    private PointLogService pointLogService;

    @RequestMapping("queryMemberDeposit")
    public PageResult queryPoint(Integer page, Integer rows, Memberdepositlog memberdepositlog, Member member){

        return  memberDepositService.queryMemberdepositlog(page,rows,memberdepositlog,member);
    }
    @RequestMapping("deleteMemberDeposit")
    public Result deletePointLog(Memberdepositlog memberdepositlog){
        return  memberDepositService.deleteMemberdepositlog(memberdepositlog);
    }
    @RequestMapping("queryMemberUserName")
    public Map<String,Object> queryMemberUserName(Member member){
        return memberDepositService.queryMemberUserName(member);
    }

    @RequestMapping("updateMemberDeposit")
    public  Result updatePoint(Memberdepositlog memberdepositlog,Member member){

        return  memberDepositService.updateMemberdepositlog(memberdepositlog,member);
    }


    @RequestMapping("exportContentList")
    public  void exportContentList(HttpServletResponse res){
        List<Memberdepositlog> memberdepositlogs=memberDepositService.findAll();
        String title="内容信息";
        String rowsName[]=new String[]{"序号","新增日期","修改日期","版本号","当前积分","增加值","扣除值","描述","类型","会员id"};
        List<Object[]> objects=new ArrayList<Object[]>();
        for (int i = 0; i <memberdepositlogs.size() ; i++) {
            Object[] obj=new Object[rowsName.length];
            obj[0]=memberdepositlogs.get(i).getId();
            obj[1]=memberdepositlogs.get(i).getCreateddate();
            obj[2]=memberdepositlogs.get(i).getLastmodifieddate();
            obj[3]=memberdepositlogs.get(i).getVersion();
            obj[4]=memberdepositlogs.get(i).getBalance();
            obj[5]=memberdepositlogs.get(i).getCredit();
            obj[6]=memberdepositlogs.get(i).getDebit();
            obj[7]=memberdepositlogs.get(i).getMemo();
            obj[8]=memberdepositlogs.get(i).getType();
            obj[9]=memberdepositlogs.get(i).getMemberId();
            objects.add(obj);
        }
        ExportExcel exportExcel=new ExportExcel(title,rowsName,objects,res);
        try {
            exportExcel.export();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @RequestMapping("queryEcharts")
    public  Map<String,Object> queryEcharts(){
        return memberDepositService.queryEcharts();
    }




    @RequestMapping("importCotentList")
    public  Result importCotentList(MultipartFile file, HttpServletResponse response){
        List<Memberdepositlog> pointlogs=new ArrayList<>();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
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
                    HSSFSheet sheet=hssfWorkbook.getSheetAt(i);
                    for (int j = 3; j < sheet.getPhysicalNumberOfRows(); j++) {
                        HSSFRow row=sheet.getRow(j);
                        Memberdepositlog pointlog=new Memberdepositlog();
                        if(MemberDepositController.getCellValue(row.getCell(0))!=null && !MemberDepositController.getCellValue(row.getCell(0)).equals("")){
                            pointlog.setId(Long.valueOf(MemberDepositController.getCellValue(row.getCell(0))));
                        }
                        if(MemberDepositController.getCellValue(row.getCell(1))!=null && !MemberDepositController.getCellValue(row.getCell(1)).equals("")){
                            pointlog.setCreateddate(simpleDateFormat.parse(MemberDepositController.getCellValue(row.getCell(2))));
                        }
                        if(MemberDepositController.getCellValue(row.getCell(2))!=null && !MemberDepositController.getCellValue(row.getCell(2)).equals("")){
                            pointlog.setLastmodifieddate(simpleDateFormat.parse(MemberDepositController.getCellValue(row.getCell(2))));
                        }
                        if(MemberDepositController.getCellValue(row.getCell(3))!=null && !MemberDepositController.getCellValue(row.getCell(3)).equals("")){
                            pointlog.setVersion(Long.valueOf(MemberDepositController.getCellValue(row.getCell(3))));
                        } if(MemberDepositController.getCellValue(row.getCell(4))!=null && !MemberDepositController.getCellValue(row.getCell(4)).equals("")){
                            pointlog.setBalance(BigDecimal.valueOf(Long.valueOf(MemberDepositController.getCellValue(row.getCell(4)))));
                        }
                        if(MemberDepositController.getCellValue(row.getCell(5))!=null && !MemberDepositController.getCellValue(row.getCell(5)).equals("")){
                            pointlog.setCredit(BigDecimal.valueOf(Long.valueOf(MemberDepositController.getCellValue(row.getCell(5)))));
                        }
                        if(MemberDepositController.getCellValue(row.getCell(6))!=null && !MemberDepositController.getCellValue(row.getCell(6)).equals("")){
                            pointlog.setDebit(BigDecimal.valueOf(Long.valueOf(MemberDepositController.getCellValue(row.getCell(6)))));
                        }
                        pointlog.setMemo(MemberDepositController.getCellValue(row.getCell(7)));
                        if(MemberDepositController.getCellValue(row.getCell(8))!=null && !MemberDepositController.getCellValue(row.getCell(8)).equals("")){
                            pointlog.setType(Integer.valueOf(MemberDepositController.getCellValue(row.getCell(8))));
                        }
                        if(MemberDepositController.getCellValue(row.getCell(9))!=null && !MemberDepositController.getCellValue(row.getCell(9)).equals("")){
                            pointlog.setMemberId(Long.valueOf(MemberDepositController.getCellValue(row.getCell(9))));
                        }
                        pointlogs.add(pointlog);



                    }
                }


            }else if(exName.equals("xlsx")){
                XSSFWorkbook hssfWorkbook=new XSSFWorkbook(new FileInputStream(url));
                for (int i = 0; i <hssfWorkbook.getNumberOfSheets() ; i++) {
                    XSSFSheet sheet=hssfWorkbook.getSheetAt(i);
                    for (int j = 3; j < sheet.getPhysicalNumberOfRows(); j++) {
                        XSSFRow row=sheet.getRow(j);
                        Memberdepositlog pointlog=new Memberdepositlog();
                        if(MemberDepositController.getCellValue(row.getCell(0))!=null && !MemberDepositController.getCellValue(row.getCell(0)).equals("")){
                            pointlog.setId(Long.valueOf(MemberDepositController.getCellValue(row.getCell(0))));
                        }
                        if(MemberDepositController.getCellValue(row.getCell(1))!=null && !MemberDepositController.getCellValue(row.getCell(1)).equals("")){
                            pointlog.setCreateddate(simpleDateFormat.parse(MemberDepositController.getCellValue(row.getCell(2))));
                        }
                        if(MemberDepositController.getCellValue(row.getCell(2))!=null && !MemberDepositController.getCellValue(row.getCell(2)).equals("")){
                            pointlog.setLastmodifieddate(simpleDateFormat.parse(MemberDepositController.getCellValue(row.getCell(2))));
                        }
                        if(MemberDepositController.getCellValue(row.getCell(3))!=null && !MemberDepositController.getCellValue(row.getCell(3)).equals("")){
                            pointlog.setVersion(Long.valueOf(MemberDepositController.getCellValue(row.getCell(3))));
                        } if(MemberDepositController.getCellValue(row.getCell(4))!=null && !MemberDepositController.getCellValue(row.getCell(4)).equals("")){
                            pointlog.setBalance(BigDecimal.valueOf(Long.valueOf(MemberDepositController.getCellValue(row.getCell(4)))));
                        }
                        if(MemberDepositController.getCellValue(row.getCell(5))!=null && !MemberDepositController.getCellValue(row.getCell(5)).equals("")){
                            pointlog.setCredit(BigDecimal.valueOf(Long.valueOf(MemberDepositController.getCellValue(row.getCell(5)))));
                        }
                        if(MemberDepositController.getCellValue(row.getCell(6))!=null && !MemberDepositController.getCellValue(row.getCell(6)).equals("")){
                            pointlog.setDebit(BigDecimal.valueOf(Long.valueOf(MemberDepositController.getCellValue(row.getCell(6)))));
                        }
                        pointlog.setMemo(MemberDepositController.getCellValue(row.getCell(7)));
                        if(MemberDepositController.getCellValue(row.getCell(8))!=null && !MemberDepositController.getCellValue(row.getCell(8)).equals("")){
                            pointlog.setType(Integer.valueOf(MemberDepositController.getCellValue(row.getCell(8))));
                        }
                        if(MemberDepositController.getCellValue(row.getCell(9))!=null && !MemberDepositController.getCellValue(row.getCell(9)).equals("")){
                            pointlog.setMemberId(Long.valueOf(MemberDepositController.getCellValue(row.getCell(9))));
                        }
                        pointlogs.add(pointlog);



                    }
                }

            }


        }catch (Exception e){
            e.printStackTrace();
        }




        memberDepositService.insert(pointlogs);
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
