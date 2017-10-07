package com.projeto.danilosetubal.listviewsimples2.models;

/**
 * Created by danilosetubal on 04/10/17.
 */

public class Pessoa {

    private String nome;
    private Integer idade;
    private Sexo sexo;

    public Pessoa() {
    }

    public Pessoa(String nome, Integer idade, Sexo sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return getNome() + " - " + getIdade() + " - " + getSexo();
    }
}
