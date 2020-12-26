package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomePageController {
    //link for about,client,main page,
    @GetMapping("/")
    public String index(){
        return "/index";
    }

    @GetMapping("/about")
    public String aboutUs(Model model){

        return "about";
    }



}

