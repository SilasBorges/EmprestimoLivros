package com.silasborges.bibliotery.model;

import java.util.List;

public class Library {
    private String name;
    private String cnpj;
    private String address;
    private List<Book> library;

    public Library(String name, String cnpj, String address, List<Book> library) {
        this.name = name;
        this.cnpj = cnpj;
        this.address = address;
        this.library = library;
    }

    public String getName() {
        return name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getAddress() {
        return address;
    }

    public List<Book> getLibrary() {
        return library;
    }

    @Override
    public String toString() {
        return name + "Endereço: " + address;
    }
}
