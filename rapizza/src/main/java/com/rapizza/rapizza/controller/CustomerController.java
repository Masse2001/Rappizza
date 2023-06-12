package com.rapizza.rapizza.controller;

import com.rapizza.rapizza.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/login")
    public ModelAndView loginPage (){
        return new ModelAndView("customer/loginPage");
    }

    @GetMapping("/signin")
    public ModelAndView signinPage (){
        Customer customer = new Customer();
        ModelAndView mav = new ModelAndView("customer/signInPage");
        mav.addObject("customer", customer);
        return mav;
    }
}
