package com.projeto.danilosetubal.listviewsimples2.models;

/**
 * Created by danilosetubal on 04/10/17.
 */

public enum Sexo {
    MASCULINO {
        @Override
        public String toString() {
            return "Masculino";
        }
    }, FEMININO {
        @Override
        public String toString() {
            return "Feminino";
        }
    };
}
