package com.yl.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author candk
 * @Description
 * @date 11/22/21 - 10:46 AM
 */
@Controller
public class HelloController {

    @RequestMapping(value ="/")
    public String index() {
        return "index";
    }

    @RequestMapping(value ="/target")
    public String target() {
        return "target";
    }
}
