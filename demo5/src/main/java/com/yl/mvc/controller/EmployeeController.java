package com.yl.mvc.controller;

import com.yl.mvc.dao.EmployeeDao;
import com.yl.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author candk
 * @Description
 * @date 11/24/21 - 11:39 AM
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "/employee", method= RequestMethod.GET)
    public String getAllEmployee(Model model) {
        Collection<Employee> employeeList = employeeDao.getAll();
        model.addAttribute("employeeList", employeeList);
        return "employee_list";
    }

    @RequestMapping(value = "/employee/{id}", method= RequestMethod.GET)
    public String getEmployeeById(Model model, @PathVariable("id")Integer id) {
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee", employee);
        return "employee_update";
    }

    @RequestMapping(value = "/employee/{id}", method= RequestMethod.DELETE)
    public String deleteEmployeeById(@PathVariable("id")Integer id) {
        employeeDao.delete(id);
        return "redirect:employee";
    }

    @RequestMapping(value = "/employee", method= RequestMethod.POST)
    public String addEmployee(Employee employee) {
        employeeDao.save(employee);
        return "redirect:employee";
    }

    @RequestMapping(value = "/employee", method= RequestMethod.PUT)
    public String updateEmployee(Employee employee) {
        employeeDao.save(employee);
        return "redirect:employee";
    }
}
