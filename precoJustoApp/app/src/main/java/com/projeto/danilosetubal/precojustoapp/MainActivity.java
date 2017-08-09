package com.projeto.danilosetubal.precojustoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editNomeProduto, editValorProduto, editQtdPar, editJuros;
    TextView tvPrecoFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Resgatar os campos do formulário
        editNomeProduto = (EditText) findViewById(R.id.editNomeProduto);
        editValorProduto = (EditText) findViewById(R.id.editValorProduto);
        editQtdPar = (EditText) findViewById(R.id.editQtdPar);
        editJuros = (EditText) findViewById(R.id.editJuros);

        // Resgatar textviews
        tvPrecoFinal = (TextView) findViewById(R.id.tvPrecoFinal);

    }

    public void calcular(View V) {

        String nomeProduto = editNomeProduto.getText().toString();
        double valorProduto = Double.parseDouble(editValorProduto.getText().toString());
        int qtdParcelas = Integer.parseInt(editQtdPar.getText().toString());
        double juros = Double.parseDouble(editJuros.getText().toString());

        // Calcular o preço final
        double valorParcela = valorProduto / qtdParcelas;
        double precoFinal = (valorParcela + ((valorParcela * juros)/100)) * qtdParcelas;

        tvPrecoFinal.setText(String.format( "Total : R$ %.2f", precoFinal));

        Log.d("Valor precoFinal", String.valueOf(precoFinal));
    }

    // Limpa todos os campos e focaliza novamente no campo nomeProduto.
    public void limparDados(View V) {
        editNomeProduto.setText("");
        editValorProduto.setText("");
        editQtdPar.setText("");
        editJuros.setText("");
        tvPrecoFinal.setText("");
        editNomeProduto.requestFocus();
    }

}
