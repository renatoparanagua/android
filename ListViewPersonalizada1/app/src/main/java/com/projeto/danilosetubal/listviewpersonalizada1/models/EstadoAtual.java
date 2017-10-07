package com.projeto.danilosetubal.listviewpersonalizada1.models;

/**
 * Created by danilosetubal on 04/10/17.
 */

public enum EstadoAtual {

    FAZENDO {
        @Override
        public String toString() {
            return  "Fazendo";
        }
    }, FINALIZADO {
        @Override
        public String toString() {
            return "Finalizado";
        }
    };
}
