package com.comicsshelf.comicsshelf.services;
import com.comicsshelf.comicsshelf.model.Comics;
import com.comicsshelf.comicsshelf.repositories.ComicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ComicsService {
    private final ComicsRepository comicsRepository;

    @Autowired
    public ComicsService(ComicsRepository comicsRepository) {
        this.comicsRepository = comicsRepository;
    }

    public List<Comics> findAll(){
        return comicsRepository.findAll();
    }

    public Comics findById(Long id){
        return comicsRepository.findById(id).get();
    }

    public void saveNewComics(String title, String author, int creationYear, double price){
        Comics comics = new Comics();
        comics.setTitle(title);
        comics.setAuthor(author);
        comics.setCreationYear(creationYear);
        comics.setPrice(price);

        if (comics.getPrice() <= 0){
            return;
        }
        comicsRepository.save(comics);
    }
}
