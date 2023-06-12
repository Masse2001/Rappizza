package com.rapizza.rapizza.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping
    public ModelAndView adminPage(){
        return new ModelAndView("admin/loginPage");
    }
}
