package com.example.demo.models;

import java.util.List;

public class Aluno {
    private String nome;
    private String RA;
    private int moedas;
    private List<Curso> cursosInscritos;
    

    public Aluno(String nome, String RA) {
        this.nome = nome;
        this.RA = RA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getRA() {
        return RA;
    }

    public void setRA(String rA) {
        RA = rA;
    }

    public int getMoedas() {
        return moedas;
    }

    public void setMoedas(int moedas) {
        this.moedas = moedas;
    }
    
    public List<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public void setCursosInscritos(List<Curso> cursosInscritos) {
        this.cursosInscritos = cursosInscritos;
    }
    
}
