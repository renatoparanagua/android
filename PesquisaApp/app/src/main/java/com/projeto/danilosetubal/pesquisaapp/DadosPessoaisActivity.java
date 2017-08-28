package com.projeto.danilosetubal.pesquisaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.view.View;

import java.util.ArrayList;

public class DadosPessoaisActivity extends AppCompatActivity {

    EditText editNome, editIdade;
    Spinner spProfissao;
    ArrayList<String> listProfissoes;
    ArrayAdapter<String> adapterProfissoes;

    public void montarSpinner() {
        // Organizando items a serem mostrados no spinner
        listProfissoes = new ArrayList<>();
        listProfissoes.add(new String("Programados"));
        listProfissoes.add(new String("Professor"));
        listProfissoes.add(new String("Analista"));

        // Montando relacionamento da programação com o layout
        adapterProfissoes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listProfissoes);

        // Inserindo lista relacionada com Layout dentro do spinner
        spProfissao = (Spinner) findViewById(R.id.spProfissao);
        spProfissao.setAdapter(adapterProfissoes);
    }

    public void montarNumberPicker() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_pessoais);

        // Chamada da montagem do spinner
        montarSpinner();

        // Resgatar elementos do form
        editNome = (EditText) findViewById(R.id.editNome);
        editIdade = (EditText) findViewById(R.id.editCidade);
    }

    public void enviar(View V) {
        String nome = editNome.getText().toString();
        // int idade = npIdade.getValue();
        String profissao = (String) spProfissao.getSelectedItem();

        if (nome.equals("")) {
            setResult(RESULT_CANCELED);
        } else {
            Intent it = new Intent();
            it.putExtra("pnome", nome);
            // it.putExtra("pidade", idade);
            it.putExtra("pprofissoa", profissao);

            setResult(RESULT_OK, it);
        }
        finish();

    }

}
