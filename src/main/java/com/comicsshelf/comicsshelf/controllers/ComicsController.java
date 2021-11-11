package com.comicsshelf.comicsshelf.controllers;

import com.comicsshelf.comicsshelf.services.ComicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComicsController {
    private ComicsService comicsService;

    @Autowired
    public ComicsController(ComicsService comicsService) {
        this.comicsService = comicsService;
    }

    @GetMapping("/")
    public String showMainPage(Model model){
        model.addAttribute("comics", comicsService.findAll());
        return "index";
    }
    @GetMapping("/nav")
    public String showNavigationPage(){
        return "navi";
    }

    @GetMapping("/add_comics")
    public String showAddComicsForm(){
        return "add_comics_form";
    }


}
