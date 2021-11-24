package com.yl.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author candk
 * @Description
 * @date 11/22/21 - 11:53 AM
 */

@Controller
public class TestController {

    @RequestMapping({"/", "index"})
    public String index() {return "index";}



}
