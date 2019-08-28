package com.roman.onlinemagazine.controller;


import com.roman.onlinemagazine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    private UserService userService;
    private static final int TOTAL = 3;


    @GetMapping({"/","/index","/logout"})
    public String index(){

        return "index";
    }

    @RequestMapping(value = "/home/{page}")
    public String home(@PathVariable("page")int page,Model model){
        model.addAttribute("userList",
                userService.findAll(PageRequest.of(page,TOTAL)));
                return "home";

    }

}
