package com.comicsshelf.comicsshelf.model;

import java.math.BigDecimal;

public class Comics {
    private Long id;
    private String title;
    private String author;
    private int creationYear;
    private double price;

    public Comics(){

    }

    public Comics(Long id, String title, String author, int creationYear, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.creationYear = creationYear;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
