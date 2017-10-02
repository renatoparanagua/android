package com.projeto.danilosetubal.spinnersimplestrings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

// Basicamente, um spinner para funcionar adequadamente a partir de um dataSet pré-definido
// a "ligação" entre o spinner no layout e os dados definidos na classe ou vindos do bd deve ser
// realizada utilizando um Adapter.

public class MainActivity extends AppCompatActivity {

    // 1 - Definir o dataSet do spinner.
    private String[] cidades = {"Barcelona", "Las Vegas", "Florianópolis"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2 - Instanciar um novo adapter que recebe o dataSet.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, cidades);
        // 3 - Melhora a visualização do spinner, separando melhor os elementos.
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        // 4 - Resgata o elemento spinner do layout.
        Spinner spinner = (Spinner) findViewById(R.id.spCidades);
        // 5 - Seta o adapter com o dataSet no spinner.
        spinner.setAdapter(adapter);

    }
}
