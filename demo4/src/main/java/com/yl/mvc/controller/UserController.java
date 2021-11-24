package com.yl.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author candk
 * @Description
 * @date 11/24/21 - 8:57 AM
 */
@Controller
public class UserController {


    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getAllUser() {
        return "success";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String getUserById(String id) {
        System.out.println(id);
        return "success";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String InsertUser(String username, String password) {
        return "success";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public String deleteUser() {
        return "success";
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public String updateUser(String username, String password) {
        System.out.println(username + ", " + password);
        return "success";
    }
}
