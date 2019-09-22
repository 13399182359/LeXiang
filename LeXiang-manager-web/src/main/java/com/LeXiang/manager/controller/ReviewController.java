package com.LeXiang.manager.controller;

import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.ReviewService;
import com.LeXiang.pojo.Memberdepositlog;
import com.LeXiang.pojo.Review;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import util.ExportExcel;
import util.FastDFSClient;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("review")
public class ReviewController {
    private static final String FILE_SERVER_URL ="http://192.168.11.128/" ;
    @Reference
    private ReviewService reviewService;




    @RequestMapping("queryReview")
    public PageResult queryReview (Integer page, Integer rows, Review review){
        return  reviewService.queryReview(page,rows,review);
    }

    @RequestMapping("deleteReview")
    public Result deleteReview(Review review){
        return reviewService.deleteReview(review);
    }



    @RequestMapping("exportContentList")
    public  void exportContentList(HttpServletResponse res){
        List<Review> reviews=reviewService.findAll();
        String title="内容信息";
        String rowsName[]=new String[]{"序号","新增日期","修改日期","版本号","内容","ip","是否展示","分值"};
        List<Object[]> objects=new ArrayList<Object[]>();
        for (int i = 0; i <reviews.size() ; i++) {
            Object[] obj=new Object[rowsName.length];
            obj[0]=reviews.get(i).getId();
            obj[1]=reviews.get(i).getCreateddate();
            obj[2]=reviews.get(i).getLastmodifieddate();
            obj[3]=reviews.get(i).getVersion();
            obj[4]=reviews.get(i).getContent();
            obj[5]=reviews.get(i).getIp();
            obj[6]=reviews.get(i).getIsshow();
            obj[7]=reviews.get(i).getScore();

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
    public Map<String,Object> queryEcharts(){
        return reviewService.queryEcharts();
    }




    @RequestMapping("importCotentList")
    public  Result importCotentList(MultipartFile file, HttpServletResponse response){
        List<Review> pointlogs=new ArrayList<>();
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

                for (int i = 0; i <hssfWorkbook.getNumberOfSheets() ; i++) {
                    HSSFSheet sheet=hssfWorkbook.getSheetAt(i);
                    for (int j = 3; j < sheet.getPhysicalNumberOfRows(); j++) {
                        HSSFRow row=sheet.getRow(j);
                        Review pointlog=new Review();
                        if(ReviewController.getCellValue(row.getCell(0))!=null && !ReviewController.getCellValue(row.getCell(0)).equals("")){
                            pointlog.setId(Long.valueOf(ReviewController.getCellValue(row.getCell(0))));
                        }
                        if(ReviewController.getCellValue(row.getCell(1))!=null && !ReviewController.getCellValue(row.getCell(1)).equals("")){
                            pointlog.setCreateddate(simpleDateFormat.parse(ReviewController.getCellValue(row.getCell(2))));
                        }
                        if(ReviewController.getCellValue(row.getCell(2))!=null && !ReviewController.getCellValue(row.getCell(2)).equals("")){
                            pointlog.setLastmodifieddate(simpleDateFormat.parse(ReviewController.getCellValue(row.getCell(2))));
                        }
                        if(ReviewController.getCellValue(row.getCell(3))!=null && !ReviewController.getCellValue(row.getCell(3)).equals("")){
                            pointlog.setVersion(Long.valueOf(ReviewController.getCellValue(row.getCell(3))));
                        }
                        pointlog.setContent(ReviewController.getCellValue(row.getCell(4)));
                        pointlog.setIp(ReviewController.getCellValue(row.getCell(5)));



                        if(ReviewController.getCellValue(row.getCell(6))!=null && !ReviewController.getCellValue(row.getCell(6)).equals("")){
                            pointlog.setScore(Integer.valueOf(ReviewController.getCellValue(row.getCell(6))));
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
                        Review pointlog=new Review();
                        if(ReviewController.getCellValue(row.getCell(0))!=null && !ReviewController.getCellValue(row.getCell(0)).equals("")){
                            pointlog.setId(Long.valueOf(ReviewController.getCellValue(row.getCell(0))));
                        }
                        if(ReviewController.getCellValue(row.getCell(1))!=null && !ReviewController.getCellValue(row.getCell(1)).equals("")){
                            pointlog.setCreateddate(simpleDateFormat.parse(ReviewController.getCellValue(row.getCell(2))));
                        }
                        if(ReviewController.getCellValue(row.getCell(2))!=null && !ReviewController.getCellValue(row.getCell(2)).equals("")){
                            pointlog.setLastmodifieddate(simpleDateFormat.parse(ReviewController.getCellValue(row.getCell(2))));
                        }
                        if(ReviewController.getCellValue(row.getCell(3))!=null && !ReviewController.getCellValue(row.getCell(3)).equals("")){
                            pointlog.setVersion(Long.valueOf(ReviewController.getCellValue(row.getCell(3))));
                        }
                        pointlog.setContent(ReviewController.getCellValue(row.getCell(4)));
                        pointlog.setIp(ReviewController.getCellValue(row.getCell(5)));



                        if(ReviewController.getCellValue(row.getCell(6))!=null && !ReviewController.getCellValue(row.getCell(6)).equals("")){
                            pointlog.setScore(Integer.valueOf(ReviewController.getCellValue(row.getCell(6))));
                        }
                        pointlogs.add(pointlog);



                    }
                }

            }


        }catch (Exception e){
            e.printStackTrace();
        }




        reviewService.insert(pointlogs);
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
