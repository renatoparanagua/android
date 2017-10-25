package com.projeto.danilosetubal.timesrecav2;

import java.io.Serializable;

/**
 * Created by danilosetubal on 02/10/17.
 */

public class Torcedor implements Serializable {

    private String nome;
    private Integer idade;
    private Time time;

    public Torcedor() {
    }

    public Torcedor(String nome, Integer idade, Time time) {
        this.nome = nome;
        this.idade = idade;
        this.time = time;
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

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

}
