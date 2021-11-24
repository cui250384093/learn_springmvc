package com.yl.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author candk
 * @Description
 * @date 11/24/21 - 4:04 PM
 */
@Controller
public class HttpController {

    @RequestMapping("/")
    public String index() {
        return "/";
    }
}
