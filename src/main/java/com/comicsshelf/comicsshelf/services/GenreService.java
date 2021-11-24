package com.comicsshelf.comicsshelf.services;

import com.comicsshelf.comicsshelf.model.Genre;
import com.comicsshelf.comicsshelf.repositories.GenreRepository;
import net.bytebuddy.description.type.TypeDescription;
import org.apache.logging.log4j.spi.ObjectThreadContextMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GenreService {
    private final GenreRepository genreRepository;

    @Autowired
    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public Optional<Genre> findComicsByGenreId(Long id){
        return genreRepository.findComicsByCategory(id);
    }

    public Optional<Genre> findGenreById(Long id){
        return genreRepository.findById(id);
    }
}
