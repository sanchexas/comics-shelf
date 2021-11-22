package com.comicsshelf.comicsshelf.repositories;

import com.comicsshelf.comicsshelf.model.User;
import com.comicsshelf.comicsshelf.utils.ResourseNotFoundException;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> userList;



    public List<User> findAllUsers(){
        return Collections.unmodifiableList(userList);
    }

    public User findUserById(Long id){
       for (User u : userList){
           if (u.getId().equals(id)){
               return u;
           }

       }
        throw new ResourseNotFoundException();
    }
}
