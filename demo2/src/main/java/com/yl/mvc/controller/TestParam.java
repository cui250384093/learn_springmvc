package com.yl.mvc.controller;

import com.yl.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

/**
 * @author candk
 * @Description
 * @date 11/23/21 - 8:34 AM
 */
@Controller
public class TestParam {

    @RequestMapping("/testParam")
    public String testParam(HttpServletRequest request) {

        HttpSession session = request.getSession();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println(username + "  " + password);
        return "test_param";
    }

    @RequestMapping("/testApi")
    public String testSpringMvcApi(@RequestParam("user_name")String username, String password, String[] hobby,
                                   @RequestHeader(value = "Host", required = true, defaultValue = "") String host,
                                   @CookieValue(value = "JSESSIONID", required = false) String JSESSIONID) {
        System.out.println(username + ", " + password + ", + " + Arrays.toString( hobby));
        System.out.println(host);
        System.out.println(JSESSIONID);
        return "test_param";
    }

    @RequestMapping("/testPojo")
    public String testBean(User user) {
        System.out.println(user);
        return "testPojo";
    }


}
