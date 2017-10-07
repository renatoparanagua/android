package com.projeto.danilosetubal.listviewsimples1.models;

/**
 * Created by danilosetubal on 04/10/17.
 */

public enum Divisao {

    PRIMEIRA {
        @Override
        public String toString() {
            return "1a Divisão";
        }
    }, SEGUNDA {
        @Override
        public String toString() {
            return "2a Divisão";
        }
    }, TERCEIRA {
        @Override
        public String toString() {
            return "3a Divisão";
        }
    };
}
