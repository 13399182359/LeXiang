package com.LeXiang.manager.controller;

import com.LeXiang.manager.service.OrderService;
import com.LeXiang.mapper.entity.ResultBean;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/14 12:36
 * @Param
 * @return
 **/
@RequestMapping("order")
@RestController
public class OrderController {
    @Reference(timeout = 60000)
    private OrderService orderService;
    @RequestMapping("findAll")
    public ResultBean findAll(ResultBean resultBean){
        return orderService.findAll(resultBean);
    }
    @RequestMapping("delete")
    public ResultBean delete(Long[] ids) {
        try {
            orderService.delete(ids);
            return new ResultBean(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultBean(false,"删除失败");
        }
    }
    @RequestMapping("findEcharts")
    public ResultBean findEcharts(String startDate,String endDate) throws ParseException {
        return orderService.findEcharts(startDate,endDate);
    }
    @RequestMapping("poiDown")
    public void poiDown(String[] ids, HttpServletResponse response){
        try {
            List list =  orderService.poiDown(ids);
            String[] rowName =  (String[])list.get(0);
            List<Object[]> list1 = (List<Object[]>) list.get(1);
            System.out.println(list);
            ExportExcel exportExcel = new ExportExcel("订单管理统计",rowName,list1 ,response);
            exportExcel.export();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
