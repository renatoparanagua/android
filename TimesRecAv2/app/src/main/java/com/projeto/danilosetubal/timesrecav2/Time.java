package com.projeto.danilosetubal.timesrecav2;

import java.io.Serializable;

/**
 * Created by danilosetubal on 02/10/17.
 */

public class Time implements Serializable {

    private String nome;
    private Integer imageId;

    public Time() {
    }

    public Time(String nome, Integer imageId) {
        this.nome = nome;
        this.imageId = imageId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    @Override
    public String toString() {
        return getNome();
    }
}
