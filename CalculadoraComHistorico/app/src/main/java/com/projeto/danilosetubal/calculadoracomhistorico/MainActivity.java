package com.projeto.danilosetubal.calculadoracomhistorico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editN1, editN2;
    // TextView tvResultado;
    LinearLayout layoutDinamico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Resgatar entradas
        editN1 = (EditText) findViewById(R.id.editN1);
        editN2 = (EditText) findViewById(R.id.editN2);

        // Resgatar textView do resultado
        // tvResultado = (TextView) findViewById(R.id.tvResultado);
        layoutDinamico = (LinearLayout) findViewById(R.id.layoutFinal);

    }

    public void somar(View V) {
        TextView tvResultado = new TextView(this);
        double num1 = Double.parseDouble(editN1.getText().toString());
        double num2 = Double.parseDouble(editN2.getText().toString());
        double result = num1 + num2;
        tvResultado.setText(num1 + " + " + num2 + " = " + new Double(result).toString());
        layoutDinamico.addView(tvResultado);
    }

    public void subtrair(View V) {
        TextView tvResultado = new TextView(this);
        double num1 = Double.parseDouble(editN1.getText().toString());
        double num2 = Double.parseDouble(editN2.getText().toString());
        double result = num1 - num2;
        tvResultado.setText(num1 + " - " + num2 + " = " + new Double(result).toString());
        layoutDinamico.addView(tvResultado);
    }

    public void multiplicar(View V) {

        String sN2 = editN2.getText().toString();

        if (sN2.matches("")) {
            Toast.makeText(this, "Campo 2 está vazio", Toast.LENGTH_SHORT).show();
            editN2.requestFocus();
            return;
        } else {
            TextView tvResultado = new TextView(this);
            double num1 = Double.parseDouble(editN1.getText().toString());
            double num2 = Double.parseDouble(editN2.getText().toString());
            double result = num1 * num2;
            tvResultado.setText(num1 + " * " + num2 + " = " + new Double(result).toString());
            layoutDinamico.addView(tvResultado);
        }

    }

    public void dividr(View V) {
        TextView tvResultado = new TextView(this);
        double num1 = Double.parseDouble(editN1.getText().toString());
        double num2 = Double.parseDouble(editN2.getText().toString());
        double result = num1 / num2;
        tvResultado.setText(num1 + " / " + num2 + " = " + new Double(result).toString());
        layoutDinamico.addView(tvResultado);
    }


    public void gravarHistorico(View V) {

    }


}
