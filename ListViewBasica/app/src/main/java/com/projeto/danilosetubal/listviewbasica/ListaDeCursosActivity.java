package com.projeto.danilosetubal.listviewbasica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.projeto.danilosetubal.listviewbasica.Model.Curso;
import com.projeto.danilosetubal.listviewbasica.Model.StatusAtual;

import java.util.List;

public class ListaDeCursosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_cursos);

        List<Curso> cursos = todosOsCursos();
        ListView listaDeCursos = (ListView) findViewById(R.id.lista);

    }

    public List<Curso> todosOsCursos() {

        private List<Curso> listaDeCursos;

        private Curso cursoAds = new Curso("Análise e Desenvolvimento de Sistemas",
                "Curso da área de TI", StatusAtual.FINALIZADO);
        private Curso cursoDireito = new Curso("Direito",
                "Curso para atuar na área jurídica", StatusAtual.FAZENDO);
        private Curso cursoPsicologia = new Curso("Psicologia",
                )

        return listaDeCursos;
    }
}
