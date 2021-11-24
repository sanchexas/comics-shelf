package com.comicsshelf.comicsshelf.repositories;

import com.comicsshelf.comicsshelf.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface GenreRepository extends JpaRepository<Genre, Long> {
    @Query("select g from Genre g join fetch g.comics where g.id = :id")
    Optional<Genre> findComicsByCategory(Long id);
}
