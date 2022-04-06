package com.wjs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @author wjs
 * @create 2022-03-01 17:21
 */
@Controller
public class FileUploadController {
    @RequestMapping("/upload")
    public void fileUpload(MultipartFile fileUpload, HttpServletRequest request) throws IOException {
        String filename = fileUpload.getOriginalFilename();
        System.out.println("文件名"+filename);
    //    上传文件
    //    String realPath=request.getServletContext().getRealPath("fileupload");
    //    System.out.println("realpath"+realPath);
    //    String filepath=realPath+"\\"+filename;
        String filepath="D:\\Program Files\\idea project\\homeWork_ssm1\\src\\main\\webapp\\fileupload"+"\\"+filename;
        System.out.println("文件上传路径"+filepath);
        fileUpload.transferTo(new File(filepath));
    }
}
