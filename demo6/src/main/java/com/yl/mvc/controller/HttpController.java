package com.yl.mvc.controller;

import com.yl.mvc.pojo.User;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.UUID;

/**
 * @author candk
 * @Description
 * @date 11/24/21 - 4:04 PM
 */
@Controller
public class HttpController {

    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody) {
        System.out.println(requestBody);
        return "success";
    }

    @RequestMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity) {
        System.out.println(requestEntity.getHeaders());
        System.out.println(requestEntity.getBody());
        return "success";
    }

    @RequestMapping("/testResponse")
    public void testResponse(HttpServletResponse response) throws IOException {
        response.getWriter().println("hello, response!");
    }

    @RequestMapping("/testResponseBody")
    @ResponseBody
    public String testResponseBody(){
        return "success";
    }

    @RequestMapping("/testResponseUser")
    @ResponseBody
    public User testResponseUser(){
        return new User(1001, "admin", "111", 23, "female");
    }

    @RequestMapping("/testDownload")
    public ResponseEntity<byte[]> testResponseEntity(HttpSession session) throws IOException {
        //获取ServletContext对象
        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext.getServletContextName());
        //获取服务器中文件的真实路径
        String realPath = servletContext.getRealPath("/static/img/1.jpg");
        System.out.println(realPath);
        //创建输入流
        InputStream is = new FileInputStream(realPath);
        //创建字节数组
        byte[] bytes = new byte[is.available()];
        //将流读到字节数组中
        is.read(bytes);
        //创建HttpHeaders对象设置响应头信息
        MultiValueMap<String, String> headers = new HttpHeaders();
        //设置要下载方式以及下载文件的名字
        headers.add("Content-Disposition", "attachment;filename=1.jpg");
        //设置响应状态码
        HttpStatus statusCode = HttpStatus.OK;
        //创建ResponseEntity对象
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, headers, statusCode);
        //关闭输入流
        is.close();
        return responseEntity;
    }

    @RequestMapping("/testUpload")
    public String testUpload(MultipartFile photo, HttpSession session) throws IOException {
        System.out.println(photo.getName());
        String fileName = photo.getOriginalFilename();
        System.out.println(fileName);
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffixName);
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        fileName = uuid + suffixName;
        ServletContext servletContext = session.getServletContext();
        String contextPath = servletContext.getContextPath();
        System.out.println(contextPath);
        String path = servletContext.getRealPath("photo");
        File file = new File(path);
        if (!file.exists()) {
            file.mkdir();
        }
        String finalPath = path + File.separator + fileName;
        photo.transferTo(new File(finalPath));
        return "success";
    }
}
