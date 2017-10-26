package com.projeto.danilosetubal.minhacotac.models;

/**
 * Created by danilosetubal on 25/10/17.
 */
public class Moeda {

    String sigla;
    String nome;
    String valor;

    public Moeda() {
    }

    public Moeda(String sigla, String nome, String valor) {
        this.sigla = sigla;
        this.nome = nome;
        this.valor = valor;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
