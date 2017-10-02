package com.projeto.danilosetubal.biblioapp;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by danilosetubal on 02/10/17.
 */

@DatabaseTable(tableName = "livros")
public class Livro {

    @DatabaseField(allowGeneratedIdInsert = true, generatedId = true)
    private Integer id;

    @DatabaseField(canBeNull = false)
    private String titulo;

    @DatabaseField(canBeNull = false)
    private Autor autor;

    private Integer numeroPaginas;

    public Livro() {
    }

    public Livro(String titulo, Autor autor, Integer numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return getAutor() + " - " + getTitulo() + " - " + getNumeroPaginas();
    }


}
