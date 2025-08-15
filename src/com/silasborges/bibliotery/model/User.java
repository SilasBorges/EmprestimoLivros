package com.silasborges.bibliotery.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String cpf;
    private int numberPhone;
    private List<Book> loanHistory;

    public User(String name, String cpf, int numberPhone) {
        this.name = name;
        this.cpf = cpf;
        this.numberPhone = numberPhone;
        this.loanHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public List<Book> getLoanHistory() {
        return loanHistory;
    }

    public void changePhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String rentsBook(Book book) {
        loanHistory.add(book);
        return "Emprestimo Realizado!";
    }

    @Override
    public String toString() {
        return "Nome: " + name + "CPF: " + cpf + "Número de telefone: " + numberPhone;
    }
}
