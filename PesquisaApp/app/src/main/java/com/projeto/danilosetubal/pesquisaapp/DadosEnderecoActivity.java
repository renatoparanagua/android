package com.projeto.danilosetubal.pesquisaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DadosEnderecoActivity extends AppCompatActivity {

    EditText  editCep, editRua, editCidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_endereco);

        // Resgatar elemntos do layout
        editCep = (EditText) findViewById(R.id.editCep);
        editRua = (EditText) findViewById(R.id.editRua);
        editCidade = (EditText) findViewById(R.id.editCidade);

    }

    public void enviar(View v) {
        // Resgatar valores do form
        String cep = editCep.getText().toString();
        String rua = editRua.getText().toString();
        String cidade = editCidade.getText().toString();

        if (cep.equals("") && rua.equals("") && cidade.equals("")) {
            setResult(RESULT_CANCELED);
        } else {
            Intent it = new Intent();
            it.putExtra("pcep", cep);
            it.putExtra("prua", rua);
            it.putExtra("cidade", cidade);

            // Enviar dados para activity chamadora
            setResult(RESULT_OK, it);
        }

        finish();
    }
}
