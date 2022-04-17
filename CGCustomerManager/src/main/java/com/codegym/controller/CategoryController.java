package com.codegym.controller;

import com.codegym.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController {

    @GetMapping("/list")
    public ModelAndView showCreateForm(){
        ModelAndView m = new ModelAndView("/addcustomer");

        m.addObject("customer", new Customer());
        m.addObject("message", "Create customer");
        return  m;
    }
}
