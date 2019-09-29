package com.adil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.adil.model.SportsClub;

@Controller
public class FeesController {
	@GetMapping("/sportsclub")
    public String sendForm(SportsClub sportsClub) {
        return "sportsclub";
    }

    @PostMapping("/sportsclub")
    public String processForm(SportsClub sportsClub, Model model) {
    	int result = SportsClub.getFees();
    	model.addAttribute("result", result);
        return "fees-result";
    }

}
