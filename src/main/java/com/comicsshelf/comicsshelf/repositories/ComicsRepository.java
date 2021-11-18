package com.comicsshelf.comicsshelf.repositories;
import com.comicsshelf.comicsshelf.model.Comics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComicsRepository extends JpaRepository<Comics, Long> {

}
