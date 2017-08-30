package com.projeto.danilosetubal.boletimapp.activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.projeto.danilosetubal.boletimapp.R;

import java.util.ArrayList;

public class AvaliacaoActivity extends AppCompatActivity {

    Spinner spDisciplina;
    ArrayList<String> listDisciplinas;
    ArrayAdapter<String> adapterDisciplinas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avaliacao);

    }

    public void montarSpinner() {
        listDisciplinas = new ArrayList<>();
        listDisciplinas.add(new String("Engenharia de Software"));
        listDisciplinas.add(new String("Programação"));
        listDisciplinas.add(new String("Tópicos Especiais"));
        listDisciplinas.add(new String("Metodologia Científica"));

        adapterDisciplinas =
                new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listDisciplinas);

        spDisciplina = (Spinner) findViewById(R.id.spinnerDisciplina);
        spDisciplina.setAdapter(adapterDisciplinas);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avaliacao);

        montarSpinner();
    }
}
