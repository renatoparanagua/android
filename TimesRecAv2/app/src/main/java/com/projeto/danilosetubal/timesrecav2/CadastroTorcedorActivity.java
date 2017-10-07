package com.projeto.danilosetubal.timesrecav2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class CadastroTorcedorActivity extends AppCompatActivity {

    Spinner spTimes;
    EditText etNome, etIdade;
    String itemStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_torcedor);
        etNome = (EditText) findViewById(R.id.editNome);
        etIdade = (EditText) findViewById(R.id.editIdade);
        renderizarSpinner();
    }

    // Método que renderiza meu spinner personalizado.
    public void renderizarSpinner() {
        ArrayList<Time> listTimes = new ArrayList<>();
        listTimes.add(new Time("Barcelona", R.drawable.barcelona));
        listTimes.add(new Time("Boca Juniors", R.drawable.boca));
        listTimes.add(new Time("Cosmos", R.drawable.cosmos));
        listTimes.add(new Time("Santos", R.drawable.santos));
        spTimes = (Spinner) findViewById(R.id.spTimes);
        SpinnerAdapter spAdapter = new SpinnerAdapter(this, R.layout.row, R.id.txt, listTimes);
        spTimes.setAdapter(spAdapter);
        String itemString = spTimes.getSelectedItem().toString();
    }

    public void enviar(View v) {

        Torcedor torcedor = new Torcedor();
        torcedor.setTime((Time) spTimes.getSelectedItem());
        torcedor.setNome(etNome.getText().toString());
        torcedor.setIdade(Integer.parseInt(etIdade.getText().toString()));

        Intent it = new Intent();
        it.putExtra("torcedor", torcedor);
        setResult(RESULT_OK, it);
        finish();
    }

    public void voltar(View v) {
        finish();
    }
}
