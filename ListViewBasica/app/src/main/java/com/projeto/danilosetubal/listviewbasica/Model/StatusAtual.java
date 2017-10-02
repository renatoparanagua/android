package com.projeto.danilosetubal.listviewbasica.Model;

/**
 * Created by danilosetubal on 25/09/17.
 */

public enum StatusAtual {

    FAZENDO{
        @Override
        public String toString() {
            return "Fazendo";
        }
    }, FINALIZADO{
        @Override
        public String toString() {
            return "Finalizado";
        }
    };
}
