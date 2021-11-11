package com.comicsshelf.comicsshelf.repositories;
import com.comicsshelf.comicsshelf.model.Comics;
import com.comicsshelf.comicsshelf.utils.ResourseNotFoundException;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.*;

@Component
public class ComicsRepository {
    private List<Comics> comics;

    @PostConstruct
    public void standard(){
        comics = new ArrayList<>(Arrays.asList(
              new Comics(1L,"Spider Man","Jack",1998,250.2),
                new Comics(2L,"Hulk","Cory",2001,280.2),
                new Comics(3L,"Super Man","Aaron",1991,150.1)
        ));
    }

    public List<Comics> findAllComics(){
        return Collections.unmodifiableList(comics);
    }

    public Comics findById(Long id){
        for(Comics c : comics){
            if (c.getId().equals(id)){
                return c;
            }
        }
        throw new ResourseNotFoundException();
    }
}
