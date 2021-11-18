package com.comicsshelf.comicsshelf.controllers;

import com.comicsshelf.comicsshelf.model.Comics;
import com.comicsshelf.comicsshelf.services.ComicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ComicsController {
    private ComicsService comicsService;

    @Autowired
    public ComicsController(ComicsService comicsService) {
        this.comicsService = comicsService;
    }

    @GetMapping
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

    @PostMapping("/add_comics")
    public String saveNewComics(@RequestParam String title, @RequestParam String author,
                                @RequestParam int creationYear, @RequestParam double price){

        comicsService.saveNewComics(title, author, creationYear, price);

        return "redirect:/";
    }

    @GetMapping("/comics/{id}")
    @ResponseBody
    public Comics findIdAndShowJSON(@PathVariable Long id){
        return comicsService.findById(id);
    }


}
