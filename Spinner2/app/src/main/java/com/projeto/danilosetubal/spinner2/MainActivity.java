package com.projeto.danilosetubal.spinner2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

// Adapter faz a ponte entre os dados e o spinner no layout.

public class MainActivity extends AppCompatActivity {

    private String[] frutas = {"Maçã", "Laranja", "Uva", "Limão"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, frutas);
        Spinner spinnerFrutas = (Spinner) findViewById(R.id.spinner2frutas);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinnerFrutas.setAdapter(adapter);
    }
}
