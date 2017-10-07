package com.projeto.danilosetubal.timesrecav2;

/**
 * Created by danilosetubal on 04/10/17.
 */

public class ItemListView {
    private String nome;
    private Integer idade;
    private Integer imageResId;

    public ItemListView() {
    }

    public ItemListView(String nome, Integer idade, Integer imageResId) {
        this.nome = nome;
        this.idade = idade;
        this.imageResId = imageResId;
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

    public Integer getImageResId() {
        return imageResId;
    }

    public void setImageResId(Integer imageResId) {
        this.imageResId = imageResId;
    }
}
