package com.projeto.danilosetubal.boletimapp.models;

import java.io.Serializable;

/**
 * Created by danilosetubal on 30/08/17.
 */

public class Avaliacao {
    private String professor;
    private double nota;
    private Disciplina disciplina;

    public Avaliacao() {

    }

    public Avaliacao(String professor, double nota, Disciplina disciplina) {
        this.professor = professor;
        this.nota = nota;
        this.disciplina = disciplina;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "professor='" + professor + '\'' +
                ", nota=" + nota +
                ", disciplina=" + disciplina +
                '}';
    }
}
