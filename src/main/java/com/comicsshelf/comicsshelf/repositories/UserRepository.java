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

    @PostConstruct
    public void standard(){
        userList = new ArrayList<>(Arrays.asList(
           new User(1L,"MyLittlePony", 20),
           new User(2L,"Alexandr", 18),
           new User(3L,"Sanches", 19)
        ));
    }
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
