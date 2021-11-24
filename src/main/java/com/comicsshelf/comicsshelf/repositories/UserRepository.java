package com.comicsshelf.comicsshelf.repositories;

import com.comicsshelf.comicsshelf.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
