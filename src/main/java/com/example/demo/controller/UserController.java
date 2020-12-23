package com.example.demo.controller;

import com.example.demo.error.Errors;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {


        private UserService userService;

        @Autowired
        public UserController(UserService userService) {
            this.userService = userService;
        }

        @GetMapping("/login")
        public String getLoginPage(@RequestParam(required = false) String error, Model model) {
            if (error != null) {
                model.addAttribute("error", Errors.INVALID_CREDENTIALS);
            }

            return "login";
        }

}
