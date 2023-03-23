package com.example.demo.models;

public class Curso {
    String nome;
    String ID;

    public Curso(String nome, String iD) {
        this.nome = nome;
        ID = iD;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getID() {
        return ID;
    }
    public void setID(String iD) {
        ID = iD;
    }
}
