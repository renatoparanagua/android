package com.projeto.danilosetubal.listviewsimples3.models;

/**
 * Created by danilosetubal on 04/10/17.
 */

public enum Genero {

    AÇÃO {
        @Override
        public String toString() {
            return "Ação";
        }
    }, AVENTURA {
        @Override
        public String toString() {
            return "Aventura";
        }
    }, COMÉDIA {
        @Override
        public String toString() {
            return "Comédia";
        }
    }, DRAMA {
        @Override
        public String toString() {
            return "Drama";
        }
    }, TERROR {
        @Override
        public String toString() {
            return "Terror";
        }
    }, FICÇAO_CIENTÍFICA {
        @Override
        public String toString() { return "Ficção Científica"; }
    };
}
