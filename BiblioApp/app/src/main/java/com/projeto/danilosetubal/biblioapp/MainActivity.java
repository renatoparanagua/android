package com.projeto.danilosetubal.biblioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spAutores;
    private List<Autor> autores = new ArrayList<Autor>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        private Autor autor1 = new Autor("João da Silva", "Brasileira");
        private Autor autor2 = new Autor("Maria da Silva", "Brasileira");
        autores.add(autor1);
        autores.add(autor2);

        spAutores



    }
}
