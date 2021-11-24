package com.yl.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author candk
 * @Description
 * @date 11/23/21 - 11:16 AM
 */
@Controller
public class TestController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/testView")
    public String testView() {
        return "view";
    }
}
