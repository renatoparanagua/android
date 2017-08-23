package com.projeto.danilosetubal.pesquisaapp;

/**
 * Created by danilosetubal on 23/08/17.
 */

public class Pessoa {

    private String nome;
    private String idade;
    private String profissao;
    private String email;
    private String telefone;
    private String rua;
    private String cep;
    private String cidade;

    public Pessoa() {

    }

    public Pessoa(String nome, String idade, String profissao, String email, String telefone, String rua, String cep, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
        this.email = email;
        this.telefone = telefone;
        this.rua = rua;
        this.cep = cep;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }
}
