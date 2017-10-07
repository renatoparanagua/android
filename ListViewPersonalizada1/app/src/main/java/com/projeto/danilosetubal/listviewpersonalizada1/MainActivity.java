package com.projeto.danilosetubal.listviewpersonalizada1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.projeto.danilosetubal.listviewpersonalizada1.models.Categoria;
import com.projeto.danilosetubal.listviewpersonalizada1.models.Curso;
import com.projeto.danilosetubal.listviewpersonalizada1.models.EstadoAtual;
import com.projeto.danilosetubal.listviewpersonalizada1.utils.AdapterCursosPersonalizado;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Curso> cursos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Pegando a lista de cursos
        List<Curso> cursos = todosOsCursos();
        // Pegando a referência do listview do layout.
        ListView listaDeCursos = (ListView) findViewById(R.id.lista);

//        ArrayAdapter<Curso> adapter = new ArrayAdapter<Curso>(this,
//                android.R.layout.simple_list_item_1, cursos);

        AdapterCursosPersonalizado adapter = new AdapterCursosPersonalizado(cursos, this);

        listaDeCursos.setAdapter(adapter);

    }

    public List<Curso> todosOsCursos() {
        Curso curso1 = new Curso("HTML5 Básico",
                "Curso básico de HTML5.", EstadoAtual.FAZENDO, Categoria.HTML);
        Curso curso2 = new Curso("Java",
                "Descubra essa poderosa linguagem.", EstadoAtual.FAZENDO, Categoria.JAVA);
        Curso curso3 = new Curso("Android",
                "Uma introdução ao mundo mobile..", EstadoAtual.FINALIZADO, Categoria.ANDROID);

        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        return cursos;
    }
}
