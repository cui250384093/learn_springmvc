package com.yl.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author candk
 * @Description
 * @date 11/22/21 - 3:24 PM
 */
@Controller
//@RequestMapping("/hello")
public class RequestMappingController {

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = {"/test", "/testMapping"},
                    method = {RequestMethod.POST, RequestMethod.GET},
                    params = {"username"},
                    headers = {"Host=localhost:8082"})
    public String testMapping() {
        return "testMapping";
    }


    @RequestMapping("/a*a/testAnt")
    public String testAnt() {
        return "testMapping";
    }

    @RequestMapping("/testPath/{id}/{username}")
    public String testPath(@PathVariable("id")Integer id, @PathVariable("username")String username) {
        System.out.println(id + username);
        return "testMapping";
    }


}
