package com.silasborges.bibliotery.model;

import java.util.List;

public class Book {
    private String name;
    private String author;
    private int year;
    private int isbn;
    private boolean availability = true;

    public Book(String name, String author, int year, int isbn) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getIsbn() {
        return isbn;
    }

    public boolean isAvailability() {
        return availability;
    }

    @Override
    public String toString() {
        return "Livro " + name + "Autor: " + author + "Ano de lançamento: " + year;
    }
}
