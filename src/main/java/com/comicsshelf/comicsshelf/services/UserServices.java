package com.comicsshelf.comicsshelf.services;

import com.comicsshelf.comicsshelf.model.User;
import com.comicsshelf.comicsshelf.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {
    private UserRepository userRepository;

    @Autowired
    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers(){
        return userRepository.findAllUsers();
    }

    public User findById(Long id){
        return userRepository.findUserById(id);
    }
}
