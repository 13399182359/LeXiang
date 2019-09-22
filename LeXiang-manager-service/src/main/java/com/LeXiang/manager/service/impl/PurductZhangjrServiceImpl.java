package com.LeXiang.manager.service.impl;

import com.LeXiang.manager.service.PurductZhangjrService;
import com.LeXiang.mapper.*;
import com.LeXiang.mapper.entity.ResultBean;
import com.LeXiang.pojo.*;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import org.codehaus.plexus.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 张俊荣 15835910851
 * @Description //TODO
 * @Date 2019/9/18 11:43
 * @Param
 * @return
 **/
@Service(timeout = 60000)
public class PurductZhangjrServiceImpl implements PurductZhangjrService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private SkuMapper skuMapper;
    @Autowired
    private AreaMapper areaMapper;
    @Autowired
    private ProductcategoryMapper productcategoryMapper;
    @Autowired
    private ReviewMapper reviewMapper;
    @Autowired
    private StoreMapper storeMapper;
    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private BusinessMapper businessMapper;
    @Override
    public ResultBean findAll(ResultBean resultBean) {
        Integer count=0;
        List<Product> productAll=new ArrayList<>();
        List<Product> products=null;
        PageHelper.startPage(resultBean.getPage(),resultBean.getMeiPageCount());
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        List<Store> list=resultBean.getRows();
        for (Store store : list) {
            if (store!=null){
                //每个商家啊只能查看 自己的商品信息

                criteria.andStoreIdEqualTo(store.getId());
            }

            if (StringUtils.isNotEmpty(resultBean.getWhere())){
                if (resultBean.getWhere().equals("编号")) {
                    criteria.andSnEqualTo(resultBean.getMessage());
                }else if(resultBean.getWhere().equals("名称")){
                    criteria.andNameLike("%"+resultBean.getMessage()+"%");
                }else if(resultBean.getWhere().equals("品牌")){
                    criteria.andBrandIdEqualTo(Long.valueOf(resultBean.getMessage()));
                }else if(resultBean.getWhere().equals("分类")){
                    criteria.andProductcategoryIdEqualTo(Long.valueOf(resultBean.getMessage()));
                }
            }
            products = productMapper.selectByExample(productExample);
            for (Product product : products) {
                if (product.getProductcategoryId()!=null) {
                    Productcategory productcategory = productcategoryMapper.selectByPrimaryKey(product.getProductcategoryId());
                    product.setAttributevalue19(productcategory.getName());
                    productAll.add(product);
                }
            }
          count += productMapper.countByExample(productExample);
        }


        double s1 = (double) count/resultBean.getMeiPageCount();
        return new ResultBean(count,productAll,resultBean.getPage(),(int)Math.ceil(s1),resultBean.getMeiPageCount());
    }

    @Override
    public void delete(Long[] ids) {
        for (Long id : ids) {
            productMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public void addOrUpdate(Product product) {
        if (product.getId()!=null){
            productMapper.updateByPrimaryKey(product);
        }else {
            ProductWithBLOBs product1= (ProductWithBLOBs)product;
            productMapper.insert(product1);
        }
    }

    @Override
    public ResultBean findOne(Long id) {
        ProductWithBLOBs productWithBLOBs = productMapper.selectByPrimaryKey(id);
        ResultBean bean = new ResultBean();
        bean.setProductWithBLOBs(productWithBLOBs);
        ReviewExample reviewExample = new ReviewExample();
        ReviewExample.Criteria criteria = reviewExample.createCriteria();
        criteria.andStoreIdEqualTo(1l);
        Store store = storeMapper.selectByPrimaryKey(1l);
        criteria.andProductIdEqualTo(id);
        List<Review> reviews = reviewMapper.selectByExample(reviewExample);
        bean.setRows(reviews);
        bean.setStore(store);
        return bean;
    }

    @Override
    public void updateStatus(Long[] ids, Long where) {
        if (where==1){
            for (Long id : ids) {
                Product productWithBLOBs = productMapper.selectByPrimaryKey(id);
                productWithBLOBs.setIsmarketable(true);
                productMapper.updateByPrimaryKey(productWithBLOBs);
            }
        }else if (where==2){
            for (Long id : ids) {
                Product productWithBLOBs = productMapper.selectByPrimaryKey(id);
                productWithBLOBs.setIsmarketable(false);
                productMapper.updateByPrimaryKey(productWithBLOBs);
            }
        }
    }

    @Override
    public Product findProductKey(Long id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public ResultBean findOneKey(Long[] id) {
        List list = new ArrayList<>();
        for (Long aLong : id) {
            ProductWithBLOBs productWithBLOBs = productMapper.selectByPrimaryKey(aLong);
            list.add(productWithBLOBs);
        }
        return new ResultBean(list.size(),list);
    }

    @Override
    public void addCart(Orders orders) {
        Area area = areaMapper.selectByPrimaryKey(orders.getAreaId());
        orders.setAreaname(area.getName());
        List<Orders> orders1 = ordersMapper.selectByExample(null);
        Long id = 1l;
        for (int i = 0; i <orders1.size() ; i++) {
            for (int j = 0; j < orders1.size(); j++) {
                if (orders1.get(i).getId()<orders1.get(j).getId()) {
                    id = orders1.get(j).getId();
                }
            }
        }
        orders.setId(++id);
        ordersMapper.insert(orders);
    }

    @Override
    public ResultBean queryCart(Member member) {
        OrdersExample ordersExample = new OrdersExample();
        OrdersExample.Criteria criteria = ordersExample.createCriteria();
        criteria.andMemberIdEqualTo(member.getId());
        List<Orders> orders = ordersMapper.selectByExample(ordersExample);
        ResultBean bean = new ResultBean();
        bean.setOrders(orders.get(orders.size()-1));
        return bean;
    }

    @Override
    public List<Store> findAllStore(Business business) {
        StoreExample storeExample=new StoreExample();
        StoreExample.Criteria criteria = storeExample.createCriteria();
        criteria.andBusinessIdEqualTo(business.getId());
        return storeMapper.selectByExample(storeExample);
    }

}
