package com.projeto.danilosetubal.listviewbasica.Model;

/**
 * Created by danilosetubal on 25/09/17.
 */

public class Curso {

    private String nome;
    private String descricao;
    private StatusAtual status;

    public Curso(String nome, String descricao, StatusAtual status) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusAtual getStatus() {
        return status;
    }

    public void setStatus(StatusAtual status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", status=" + status +
                '}';
    }
}
