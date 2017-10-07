package com.projeto.danilosetubal.listviewsimples1.models;

/**
 * Created by danilosetubal on 04/10/17.
 */

public class Time {

    private String nome;
    private String cidade;
    private Divisao divisao;

    public Time() {
    }

    public Time(String nome, String cidade, Divisao divisao) {
        this.nome = nome;
        this.cidade = cidade;
        this.divisao = divisao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Divisao getDivisao() {
        return divisao;
    }

    public void setDivisao(Divisao divisao) {
        this.divisao = divisao;
    }

    @Override
    public String toString() {
        return getNome() + " - " + getCidade();
    }
}
