package com.projeto.danilosetubal.listviewsimples3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.projeto.danilosetubal.listviewsimples3.models.Filme;
import com.projeto.danilosetubal.listviewsimples3.models.Genero;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1 - Resgatar listView do layout.
        ListView lvFilmes = (ListView) findViewById(R.id.lvFilmes);

        // 2 - Resgatar dados para alimentar o listView.
        List<Filme> filmes = todosOsFilmes();

        // 3 - Criar o adapter carregado dos filmes.
        ArrayAdapter<Filme> adapter = new ArrayAdapter<Filme>(this,
                android.R.layout.simple_list_item_1, filmes);

        // 4 - Setar o listView com o adapter carregado.
        lvFilmes.setAdapter(adapter);

    }

    public List<Filme> todosOsFilmes() {
        List<Filme> listaDeFilmes = new ArrayList<>();

        Filme filme1 = new Filme("Jurassic Park",
                "Steven Spilberg", 1993, Genero.AVENTURA);
        Filme filme2 = new Filme("Interstellar",
                "Christopher Nolan", 2014, Genero.FICÇAO_CIENTÍFICA);
        Filme filme3 = new Filme("Matrix",
                "Lily & Lana Wachowski", 1999, Genero.FICÇAO_CIENTÍFICA);
        Filme filme4 = new Filme("O Poderoso Chefão",
                "Francis Ford Coppola", 1972, Genero.DRAMA);

        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        listaDeFilmes.add(filme4);

        return listaDeFilmes;
    }

}
