package com.wjs.controller;

import com.wjs.pojo.Goods;
import com.wjs.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author wjs
 * @create 2022-02-28 15:01
 */
@Controller
@RequestMapping("/goods")
public class GoodController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    //MultipartFile 处理器适配器会把文件放在Multipart中，从适配器中取出即可
    public String addGoods(Goods goods, @RequestPart MultipartFile fileuploadimgs, HttpServletRequest request) throws IOException {
        //接收的文件名字
        //获取文件名字
        String filename = fileuploadimgs.getOriginalFilename();
        System.out.println("文件名" + filename);
        System.out.println("realpath="+request.getServletContext().getRealPath("/fileupload"));
        //将图片存储起来
        //获取上传路径
        String fileUploadPath = "D:\\Program Files\\idea project\\homeWork_ssm1\\src\\main\\webapp\\fileupload";
        System.out.println("fileuploadPath"+fileUploadPath);
        //String realPath = request.getServletContext().getRealPath("fileupload");
        //System.out.println("realpath"+realPath);
        //拼接新路径
        String upload = fileUploadPath + "\\" + filename;
        System.out.println("文件最终上传路径" + upload);
        upload=request.getServletContext().getRealPath("fileupload")+File.separator+filename;
        System.out.println("------------------>end fileUploadPath"+upload);
        //上传文件
        fileuploadimgs.transferTo(new File(upload));
        //向后端传输值
        //goods是前端传入的参数
        System.out.println(goods);
        System.out.println("上传成功");
        //文件最终上传路径D:\Program Files\idea project\homeWork_ssm1\src\main\webapp\fileupload\5.jpg
        //设置新的值重新封装进行传送
        Goods goods1 = new Goods();
        goods1.setGoodsName(goods.getGoodsName());
        goods1.setGoodsPrice(goods.getGoodsPrice());
        goods1.setTypeId(goods.getTypeId());
        goods1.setGoodsPhoto(filename);
        //查看封装数据是否正确
        System.out.println(goods1);
        goodsService.add(goods1);
        //从数据库查询总数据，带到前台,监听器方式不可取
        List<Goods> goodAll = goodsService.findAll();
        request.setAttribute("goodAll", goodAll);
        return "AddSuccess";

    }

    @RequestMapping("/select")
    public String selectGoods(int id) {
        Goods goods = goodsService.selectById(id);
        System.out.println("begin");
        System.out.println(goods);
        return "SelectSuccess";
    }
}
