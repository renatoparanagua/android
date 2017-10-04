package com.projeto.danilosetubal.timesrecav2;

import android.content.Intent;
import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            String nome = extras.getString("nome");
            Integer idade = extras.getInt("idade");
            String time = extras.getString("Time");
            if (nome != "") {
            }
        }
    }

    public void novo(View v) {
        Intent intent = new Intent(this, CadastroTorcedorActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
          // PEGAR OS DADOS
        } else {
            Toast.makeText(this, "Erro no cadastro!", Toast.LENGTH_SHORT).show();
        }
    }
}
