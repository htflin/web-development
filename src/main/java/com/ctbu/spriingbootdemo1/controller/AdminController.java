package com.ctbu.spriingbootdemo1.controller;

import com.ctbu.spriingbootdemo1.domain.Admin;
import com.ctbu.spriingbootdemo1.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;


    @RequestMapping(value = "/hi")
    public String SayHi(){

        return "hello SpringBoot";
    }
    @RequestMapping(value = "/getAdminAll")
    public List<Admin> GetAdminAll(){

        return adminService.findAll();
    }
}
