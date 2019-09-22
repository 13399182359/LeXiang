package com.LeXiang.manager.controller;

import com.LeXiang.Entity.MemberResult;
import com.LeXiang.Entity.PageResult;
import com.LeXiang.Entity.Result;
import com.LeXiang.manager.service.MemberService;
import com.LeXiang.pojo.Member;
import com.LeXiang.pojo.Memberattribute;
import com.LeXiang.pojo.Memberrank;
import com.alibaba.dubbo.config.annotation.Reference;
import jdk.nashorn.internal.runtime.logging.DebugLogger;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.ExportExcel;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("member")
public class MemberController  {

    //===================================会员管理====================================
    @Reference(timeout = 6000)
    private MemberService memberService;
    private DebugLogger log;
    private ServletContext servletContext;
    @RequestMapping("findMember")
    public PageResult findMember(Integer page, Integer rows, Member member) {
        if(page==null){
            page=1;
        }
        if(rows==null){
            rows=3;
        }
        return memberService.findMember(page,rows,member);
    }

    @RequestMapping("addMember")
    public Result addMember(Member member){
        if(member.getId()==null){
            try {
                Md5Hash md5Hash=new Md5Hash(member.getEncodedpassword(),member.getUsername(),1);
                String s = md5Hash.toString();
                member.setEncodedpassword(s);
                member.setPoint(10l);
                BigDecimal b=new BigDecimal(10);
                member.setBalance(b);
                memberService.addMember(member);
                return new Result(true,"新增成功");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return new Result(false,"新增失败");
        }else{
            try {
                Md5Hash md5Hash=new Md5Hash(member.getEncodedpassword(),member.getUsername(),1);
                String s = md5Hash.toString();
                member.setEncodedpassword(s);
                memberService.editMember(member);
                return new Result(true,"修改成功");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return new Result(false,"修改失败");
        }
    }

    @RequestMapping("toUpdMember")
    public MemberResult toUpdMember(Long id) {
        return memberService.toUpdMember(id);
    }


    @RequestMapping("delMember")
    public Result delMember(Long[] ids){
        try {
            memberService.delMember(ids);
            return new Result(false,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"删除失败");
    }
//=======================================会员等级=============================================================

    @RequestMapping("findMemberRank")
    public PageResult findMemberRank(Integer page, Integer rows, Memberrank memberrank) {
        if(page==null){
            page=1;
        }
        if(rows==null){
            rows=3;
        }
        return memberService.findMemberRank(page,rows,memberrank);
    }

    @RequestMapping("addMemberRank")
    public Result addMemberRank(Memberrank memberrank){
        if(memberrank.getId()==null){
            try {
                memberService.addMemberRank(memberrank);
                return new Result(true,"新增成功");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return new Result(false,"新增失败");
        }else{
            try {
                memberService.editMemberRank(memberrank);
                return new Result(true,"修改成功");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return new Result(false,"修改失败");
        }
    }


    @RequestMapping("toUpdMemberRank")
    public Memberrank toUpdMemberRank(Long id) {
        return memberService.toUpdMemberRank(id);
    }

    @RequestMapping("delMembeRank")
    public Result delMembeRank(Long[] ids){
        try {
            memberService.delMembeRank(ids);
            return new Result(false,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"删除失败");
    }
//==================================会员注册======================================================================

    @RequestMapping("findMemberAtt")
    public PageResult findMemberAtt(Integer page, Integer rows, Memberattribute memberattribute) {
        if(page==null){
            page=1;
        }
        if(rows==null){
            rows=3;
        }
        return memberService.findMemberAtt(page,rows,memberattribute);
    }

    @RequestMapping("addMemberAtt")
    public Result addMemberAtt(Memberattribute memberattribute){
        if(memberattribute.getId()==null){
            try {

                memberService.addMemberAtt(memberattribute);
                return new Result(true,"新增成功");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return new Result(false,"新增失败");
        }else{
            try {
                memberService.editMemberAtt(memberattribute);
                return new Result(true,"修改成功");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return new Result(false,"修改失败");
        }
    }


    @RequestMapping("toUpdMemberAtt")
    public Memberattribute toUpdMemberAtt(Long id) {
        return memberService.toUpdMemberAtt(id);
    }

    @RequestMapping("delMembeAtt")
    public Result delMembeAtt(Long[] ids){
        try {
            memberService.delMembeAtt(ids);
            return new Result(false,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"删除失败");
    }
//=========================================poi导出=====================================


   @RequestMapping("/exportContentList")
    public void  exportContentList(HttpServletResponse response){
           //获得数据信息
           List<Memberrank> list=memberService.findAll();
            //标题
           String title="会员等级信息";
           String[] rowsName=new String[]{"名称","优惠比例","消费金额","是否默认"};
            //定义数据集合
           List<Object[]>  dataList = new ArrayList<Object[]>();

           for (int i = 0; i <list.size() ; i++) {
               Object[] obj=new Object[rowsName.length];
               obj[0] = list.get(i).getName();
               obj[1] = list.get(i).getScale();
               obj[2] = list.get(i).getAmount();
               obj[3] = list.get(i).getIsdefault();
               dataList.add(obj);
           }
           ExportExcel exportExcel = new ExportExcel(title, rowsName,dataList,response);
       try {
           exportExcel.export();
       } catch (Exception e) {
           e.printStackTrace();
       }
   };


    //===============================poi导入=====================================================
    /*@Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext=servletContext;
    }

    @RequestMapping("importContextList")
    public Result importContextList(MultipartFile file,HttpServletResponse response){
        //取文件的扩展名
        String originalFilename = file.getOriginalFilename();
        String extName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
        //2创建一个fastDFS 客户端
        FastDFSClient fastDFSClient = null;
        try {
            fastDFSClient = new FastDFSClient("classpath:config/fdfs_client.conf");
            //执行上传处理
            fastDFSClient.uploadFile(file.getBytes(),extName);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }*/

}

