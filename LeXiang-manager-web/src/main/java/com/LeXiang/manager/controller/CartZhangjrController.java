package com.LeXiang.manager.controller;

import com.LeXiang.manager.service.PurductZhangjrService;
import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.Member;
import com.LeXiang.pojo.Orders;
import com.LeXiang.pojo.Product;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import org.codehaus.plexus.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/20 16:27
 * @Param
 * @return
 **/
@RequestMapping("cartZhangjr")
@RestController
public class CartZhangjrController {
    @Reference(timeout = 60000)
    private PurductZhangjrService purductZhangjrService;
    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping("addOrUpdate")
    public ResultBean addOrUpdate(Long id){
        //取 redis 中用户登录信息
        Object user = redisTemplate.opsForValue().get("user");
        /*if (user==null){
            return new ResultBean(false,"请登录后再操作！！");
        }*/
        //取 redis 中购物车数据
        Object cart = redisTemplate.opsForValue().get("cart");
        Product one = purductZhangjrService.findProductKey(id);
        if (cart==null){
            List<Product> list = new ArrayList<>();
            if (StringUtils.isNotEmpty(one.getMemo())) {
                Long aLong = Long.valueOf(one.getMemo());
                one.setMemo(++aLong+"");
            }else {
                one.setMemo("1");
            }
            list.add(one);
            String string = JSON.toJSONString(list);
            redisTemplate.opsForValue().set("cart",string);
            return new ResultBean(true,"添加购物车成功！");
        }else {
            List<Product> list = JSON.parseArray(cart.toString(), Product.class);
            Integer count = 0;
            for (int i = 0; i <list.size() ; i++) {
                if (list.get(i).getId() == one.getId()) {
                    count = 1;

                    Long aLong = Long.valueOf(list.get(i).getMemo());
                    String memo="1";
                    if (StringUtils.isNotEmpty(one.getMemo())){
                        memo = one.getMemo();
                    }
                    long l = Long.valueOf(memo) + aLong;
                    list.get(i).setMemo(l+"");
                }
            }
            if (count == 0) {
                if (StringUtils.isNotEmpty(one.getMemo())) {
                    Long aLong = Long.valueOf(one.getMemo());
                    one.setMemo(++aLong+"");
                }else {
                    one.setMemo("1");
                }
                list.add(one);
            }
            redisTemplate.delete("cart");
            String string = JSON.toJSONString(list);
            redisTemplate.opsForValue().set("cart",string);
            return new ResultBean(true,"添加购物车成功！");
        }
    }
    @RequestMapping("findAll")
    public ResultBean findAll(){
        //取 redis 中用户登录信息
        Object user = redisTemplate.opsForValue().get("user");
        /*if (user==null){
            return new ResultBean(false,"请登录后再操作！！");
        }*/
        Object cart = redisTemplate.opsForValue().get("cart");
        if (cart == null) {
            return new ResultBean(false,"购物车暂无信息！！");
        }
        List<Product> list = JSON.parseArray(cart.toString(), Product.class);
        ResultBean bean = new ResultBean();

        bean.setSuccess(true);
        bean.setRows(list);
        return bean;
    }
    @RequestMapping("delete")
    public ResultBean delete(Long[] id) {
        Object cart = redisTemplate.opsForValue().get("cart");
        if (cart == null) {
            return new ResultBean(false,"购物车暂无信息！！");
        }
        List<Product> list = JSON.parseArray(cart.toString(), Product.class);
        for (Long ids : id) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == ids) {
                    list.remove(i);
                }
            }
        }
        redisTemplate.delete("cart");
        String string = JSON.toJSONString(list);
        redisTemplate.opsForValue().set("cart",string);
        return new ResultBean(true,"删除成功！");
    }
    @RequestMapping("findOne")
    public ResultBean findOne(Long[] id) {
        return purductZhangjrService.findOneKey(id);
    }
    @RequestMapping("addCart")
    public ResultBean addCart(Orders orders, HttpServletRequest request) {
        Member member = (Member) request.getSession().getAttribute("MEMBER_KEY" + request.getSession().getId());
        orders.setSn(new Date().getTime()+"");
        orders.setCompletedate(new Date());
        orders.setCreateddate(new Date());
        orders.setLastmodifieddate(new Date());
        orders.setMemberId(member.getId());
        // 新增
        try {
            //商品的id 和 数量
            String[] ids = orders.getInvoicetitle().split(",");
            Long[] idds = new Long[ids.length];
            for (int i = 0; i < ids.length; i++) {
                idds[i] = Long.valueOf(ids[i]);
            }
            //商品的id 和 数量
            String[] count = orders.getInvoicecontent().split(",");
            List<Product> list = purductZhangjrService.findOneKey(idds).getRows();
            for (int i = 0; i < list.size(); i++) {
                list.get(i).setWeekhits(Long.valueOf(list.get(i).getWeekhits())-Long.valueOf(count[i]));
                purductZhangjrService.addOrUpdate(list.get(i));
            }
            purductZhangjrService.addCart(orders);
            redisTemplate.delete("cart");
            return new ResultBean(true,"提交成功！");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultBean(false,"提交失败！");
        }
    }
    @RequestMapping("queryCart")
    public ResultBean queryCart(HttpServletRequest request) {
        Member member = (Member) request.getSession().getAttribute("MEMBER_KEY" + request.getSession().getId());
        return purductZhangjrService.queryCart(member);
    }
}
