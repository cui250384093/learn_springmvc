package com.yl.mvc.controller;

import com.yl.mvc.pojo.User;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;

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

        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext.getServletContextName());

        String realPath = servletContext.getRealPath("/static/img/1.jpg");
        System.out.println(realPath);

        InputStream is = new FileInputStream(realPath);

        byte[] bytes = new byte[is.available()];
        is.read(bytes);

        MultiValueMap<String, String> headers = new HttpHeaders();

        headers.add("Content-Disposition", "attachment;filename=1.jpg");

        HttpStatus statusCode = HttpStatus.OK;
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, headers, statusCode);

        is.close();
        return responseEntity;
    }
}
