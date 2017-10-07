package com.projeto.danilosetubal.listviewsimples3.models;

/**
 * Created by danilosetubal on 04/10/17.
 */

public class Filme {

    private String nome;
    private String diretor;
    private Integer ano;
    private Genero genero;

    public Filme() {
    }

    public Filme(String nome, String diretor, Integer ano, Genero genero) {
        this.nome = nome;
        this.diretor = diretor;
        this.ano = ano;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return getNome() + " - " + getAno();
    }
}
