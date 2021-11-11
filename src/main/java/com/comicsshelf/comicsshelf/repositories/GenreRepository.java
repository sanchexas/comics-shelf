package com.comicsshelf.comicsshelf.repositories;

import com.comicsshelf.comicsshelf.model.Genre;
import com.comicsshelf.comicsshelf.utils.ResourseNotFoundException;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class GenreRepository {
    private List<Genre> genreList;

    @PostConstruct
    public void standard(){
        genreList = new ArrayList<>(Arrays.asList(
           new Genre(1L,"Horror"),
           new Genre(2L,"Fantasy"),
           new Genre(3L, "Fantastic"),
           new Genre(4L,"Detective"),
           new Genre(5L,"Roman")
        ));
    }

    public List<Genre> findAllGenres(){
        return Collections.unmodifiableList(genreList);
    }

    public Genre findGenreById(Long id){
        for (Genre g : genreList){
            if (g.getId().equals(id)){
                return g;
            }
        }
        throw new ResourseNotFoundException();
    }
}
