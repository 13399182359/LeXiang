package com.LeXiang.manager.controller;


import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.mapper.entity.User;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;


/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/5 21:33
 * @Param
 * @return
 **/
@RestController
public class UpLoadController {

    /*@Value("${FILE_SERVER_URL}")*/
    private String FILE_SERVER_URL = "http://192.168.238.128/";//文件服务器地址
    @RequestMapping("uploadFile")
    public ResultBean uploadFile(MultipartFile file){
        //1、取文件的扩展名
        String originalFilename = file.getOriginalFilename();
        String extName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
        try {
            //2、创建一个 FastDFS 的客户端
            FastDFSClient fastDFSClient
                    = new FastDFSClient("classpath:config/fdfs_client.conf");
            //3、执行上传处理
            String path = fastDFSClient.uploadFile(file.getBytes(), extName);
            //4、拼接返回的 url 和 ip 地址，拼装成完整的 url
            String url = FILE_SERVER_URL + path;
            HSSFWorkbook hssfWorkbook = new HSSFWorkbook(new FileInputStream(new File(url)));
            HSSFSheet sheetAt = hssfWorkbook.getSheetAt(0);
            User user = null;
            List list = new ArrayList();
            for (int i = 3; i <sheetAt.getPhysicalNumberOfRows() ; i++) {
                HSSFRow row = sheetAt.getRow(i);
                user = new User();
                user.setId(Integer.parseInt(row.getCell(0).toString()));
                user.setName(row.getCell(1).toString());
                list.add(url);
            }
            System.err.println(list);
            return new ResultBean(true,url);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultBean( false,"上传失败");
        }
    }
}
