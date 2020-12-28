package com.example.demo.controller;

import com.example.demo.entity.Admin;

import com.example.demo.service.AdminService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path="")
public class UserController {

    @Autowired
    AdminService adminService;

    @PostMapping(path="/add")
    public  @ResponseBody
    Admin addAdmin(@RequestBody Admin admin){
        return adminService.createAdmin(admin);
    }

//    @PostMapping(path="/add") // Map ONLY POST Requests
//        public @ResponseBody String addNewUser (@RequestParam String name
//                , @RequestParam String email) {
//            // @ResponseBody means the returned String is the response, not a view name
//            // @RequestParam means it is a parameter from the GET or POST request
//
//            User n = new User();
//            n.setName(name);
//            n.setEmail(email);
//            userRepository.save(n);
//            return "Saved";
//        }




}
