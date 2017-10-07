package com.projeto.danilosetubal.spinnercomobjetos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Torcedor torcedor1 = new Torcedor("Pedro Melo", "Figueirense");
    private Torcedor torcedor2 = new Torcedor("Mario da Silva", "Avaí");
    private Torcedor torcedor3 = new Torcedor("Luiz Paulo", "Santos");
    private Torcedor[] torcedores = {torcedor1, torcedor2, torcedor3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<Torcedor> adapter = new ArrayAdapter<Torcedor>(this, android.R.layout.simple_spinner_item, torcedores);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Spinner spinner = (Spinner) findViewById(R.id.spTorcedores);
        spinner.setAdapter(adapter);

    }
}
