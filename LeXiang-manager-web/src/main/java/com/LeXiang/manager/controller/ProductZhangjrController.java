package com.LeXiang.manager.controller;

import com.LeXiang.Commons;
import com.LeXiang.manager.service.PurductZhangjrService;
import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.Business;
import com.LeXiang.pojo.Product;
import com.LeXiang.pojo.Store;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/18 15:53
 * @Param
 * @return
 **/
@RequestMapping("productZhangjr")
@RestController
public class  ProductZhangjrController {
    @Reference(timeout = 60000)
    private PurductZhangjrService purductZhangjrService;
    @Resource
    private RedisTemplate<String,Object> redisTemplate;
    @RequestMapping("findAll")
    public ResultBean findAll(ResultBean resultBean, HttpServletRequest request) {
       /* Object str = redisTemplate.opsForValue().get("store");*/
        HttpSession session = request.getSession();
        Business business = (Business) session.getAttribute(Commons.SHOPKEY + session.getId());
       /* if (str!=null){
            String string =str.toString();
            Store store = (Store) JSON.parse(string);}*/
        List<Store> list=purductZhangjrService.findAllStore(business);

            resultBean.setRows(list);




        return purductZhangjrService.findAll(resultBean);
    }
    @RequestMapping("updateStatus")
    public ResultBean updateStatus(Long[] ids,Long where) {
        try {
            purductZhangjrService.updateStatus(ids,where);
            return new ResultBean(true,"修改成功");
        } catch (Exception e) {
                    e.printStackTrace();
            return new ResultBean(false,"修改失败");
        }
    }
    @RequestMapping("delete")
    public ResultBean delete(Long[] ids) {
        try {
            purductZhangjrService.delete(ids);
            return new ResultBean(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultBean(false,"删除失败");
        }
    }
    @RequestMapping("findOne")
    public ResultBean findOne(Long id) {
        return purductZhangjrService.findOne(id);
    }
    @RequestMapping("addOrUpdate")
    public ResultBean addOrUpdate(Product product) {
        try {
            purductZhangjrService.addOrUpdate(product);
            return new ResultBean(true,"执行成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultBean(false,"执行失败");
        }
    }
}
