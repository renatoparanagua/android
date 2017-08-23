package com.projeto.danilosetubal.pesquisaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;

public class DadosContatoActivity extends AppCompatActivity {

    EditText editEmail, editTelefone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_contato);

        // Resgatar elementos do formulário
        editEmail = (EditText) findViewById(R.id.editEmail);
        editTelefone = (EditText) findViewById(R.id.editTelefone);
    }

    public void enviar(View v) {
        // Resgatar parâmetros da tela
        String email = editEmail.getText().toString();
        String telefone = editTelefone.getText().toString();

        if (email.equals("") && telefone.equals("")) {
            setResult(RESULT_CANCELED);
        } else {

            // Montar intenção sem contexto para empacotar os dados
            Intent it = new Intent();
            it.putExtra("pemail", email);
            it.putExtra("ptelefone", telefone);

            // Enviar dados empacatodas para a activity chamadora
            setResult(RESULT_OK, it);
        }

        // Retirar a activity da inserção de dados da memória
        // A activity chamadora irá executar os métodos:
        // onRestart(), onStart(), onResume() e onActivityResult() -> Pegaremos
        // os dados no onActivityResume
        finish();
    }
}
