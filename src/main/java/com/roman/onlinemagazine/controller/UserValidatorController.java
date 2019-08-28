package com.roman.onlinemagazine.controller;


import com.roman.onlinemagazine.model.User;
import com.roman.onlinemagazine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserValidatorController {

    @Autowired
    private UserService userService;

    @GetMapping("/validatedUser")
        public String giveForm(Model m){
            m.addAttribute("user",new User());
                return "register";

    }


    @PostMapping("/saveUser")
    public String saveForm(@Valid User user, BindingResult result,Model model){
        if (result.hasErrors()){
            return "register";
        }
        userService.save(user);
            return "home";
    }

}
