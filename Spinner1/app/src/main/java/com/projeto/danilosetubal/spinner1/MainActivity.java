package com.projeto.danilosetubal.spinner1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

// Spinner Simples - Que recebe um array de strings.

public class MainActivity extends AppCompatActivity {

    // 1 - Definir o conjunto de dados que será inserido no spinner.
    private String[] times = {"Santos", "Figueirense", "Avaí", "Joinville"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2 - Criar o adapter que fará a ponte entre os dados e o elemento spinner no layout.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, times);

        // 3 - Resgatar o elemento spinner do layout
        Spinner spinner = (Spinner) findViewById(R.id.spinner1times);

        // 4 - Modifica o tipo de visualização do spinner, os dados ficam melhores dispostos.
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);

        // 5 - Seleciona o adapter que será utilizado.
        spinner.setAdapter(adapter);

    }
}
