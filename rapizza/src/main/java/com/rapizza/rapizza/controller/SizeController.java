package com.rapizza.rapizza.controller;


import com.rapizza.rapizza.model.Size;
import com.rapizza.rapizza.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sizes")
public class SizeController {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    private SizeService sizeService;

    public  SizeController(JdbcTemplate jdbcTemplate){

        this.jdbcTemplate = jdbcTemplate;
    }


    @GetMapping("/all")
    private Iterable<Size> getAllSizes(){
        return sizeService.getAllSize();
    }


    /*@GetMapping("/all")
    private Iterable<Size> getAllSizes(){
        return sizeService.getAllSize();
    }*/
}
