package com.comicsshelf.comicsshelf.services;

import com.comicsshelf.comicsshelf.model.Comics;
import com.comicsshelf.comicsshelf.repositories.ComicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComicsService {
    private ComicsRepository comicsRepository;

    // обращение к репозиторию, т.к. бд пока что нет. Но только
    //репозиторий может иметь доступ к бд ИЛИ как в нашем случае хранить данные на прямую ВНУТРИ СЕБЯ.
    //Поэтому создаем объект репозитория и обращаемся к данным, которые он хранит.

    @Autowired
    public ComicsService(ComicsRepository comicsRepository) {
        this.comicsRepository = comicsRepository;
    }

    public List<Comics> findAll(){
        return comicsRepository.findAllComics();
    }

    public Comics findById(Long id){
        return comicsRepository.findById(id);
    }
}
