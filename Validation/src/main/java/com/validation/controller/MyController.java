package com.validation.controller;

import com.validation.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MyController {
    @GetMapping("/home")
    public String homePage(Model model){
        model.addAttribute("loginData",new User());
        return "formFragment";
    }

    @PostMapping("/save")
    public String submitPage(@Valid @ModelAttribute("loginData") User user , Model model){
            System.out.println(user);
            model.addAttribute("username" , user.getUsername());
            model.addAttribute("password",user.getPassword());
            return "newPage";


    }

//    @GetMapping("/success")
//    public String afterLogin(){
//        return "newPage";
//    }





}
