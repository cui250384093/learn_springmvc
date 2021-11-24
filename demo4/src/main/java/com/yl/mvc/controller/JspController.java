package com.yl.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author candk
 * @Description
 * @date 11/23/21 - 4:23 PM
 */
@Controller
public class JspController {

    @RequestMapping("/success")
    public String success() {
        return "success";
    }


}
