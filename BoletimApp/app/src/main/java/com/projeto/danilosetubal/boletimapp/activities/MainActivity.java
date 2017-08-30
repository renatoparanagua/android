package com.projeto.danilosetubal.boletimapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.projeto.danilosetubal.boletimapp.R;
import com.projeto.danilosetubal.boletimapp.models.Avaliacao;
import com.projeto.danilosetubal.boletimapp.models.Disciplina;

public class MainActivity extends AppCompatActivity {

    Avaliacao avaliacao1, avaliacao2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        avaliacao1 = new Avaliacao();
        avaliacao2 = new Avaliacao();
    }

    public void dadosAv(View v) {

        Intent it  = null;
        int codRequisicao = 0;

        it = new Intent(this, AvaliacaoActivity.class);
        startActivityForResult(it, codRequisicao);

        Toast.makeText(this, "OPA! Chamou o método 'dadosAv'!", Toast.LENGTH_SHORT).show();


    }


}
