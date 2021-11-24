package com.comicsshelf.comicsshelf.controllers;

import com.comicsshelf.comicsshelf.model.Genre;
import com.comicsshelf.comicsshelf.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GenreController {
    private final GenreService genreService;

    @Autowired
    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }


    @GetMapping("/genre/{id}")
    @ResponseBody
    public Genre showGenreById(@PathVariable Long id){
        return genreService.findComicsByGenreId(id).get();
    }
    @GetMapping("/genreid/{id}")
    @ResponseBody
    public Genre showGenre(@PathVariable Long id){
        return genreService.findGenreById(id).get();
    }

}
