package com.comicsshelf.comicsshelf.services;

import com.comicsshelf.comicsshelf.model.Genre;
import com.comicsshelf.comicsshelf.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreService {
    private GenreRepository genreRepository;

    @Autowired
    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public Genre findById(Long id){
        return genreRepository.findGenreById(id);
    }

}
