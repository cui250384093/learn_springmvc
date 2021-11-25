package com.yl.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author candk
 * @Description
 * @date 11/25/21 - 3:29 PM
 */
@Controller
public class TestController {

    @RequestMapping("/testInterceptor")
    public String testInterceptor() {
        return "ok";
    }
}
