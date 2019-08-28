package com.roman.onlinemagazine.controller;

import com.roman.onlinemagazine.model.Match;
import com.roman.onlinemagazine.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

@Controller
public class MatchController {

    @Autowired
    private MatchService matchService;

    @GetMapping("/matches/update")
    public @ResponseBody String updateMatches(){
        try{
            matchService.saveAll(matchService.parseMatches());
            return "Matches successfully updated!";
        } catch (IOException io){
            io.printStackTrace();
            return "Error, matches didn't update";
        }
    }
}
