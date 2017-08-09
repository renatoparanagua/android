package com.projeto.danilosetubal.precojustoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    }

    public void calcular(View V) {

        String nomeProduto = editNomeProduto.getText().toString();
        double valorProduto = Double.parseDouble(editValorProduto.getText().toString());
        int qtdParcelas = Integer.parseInt(editQtdPar.getText().toString());
        double juros = Double.parseDouble(editJuros.getText().toString());

        // Calcular o preço final
        double valorParcela = valorProduto / qtdParcelas;
        double precoFinal = (valorParcela + ((valorParcela * juros)/100)) * qtdParcelas;

        tvPrecoFinal.setText("Preço Final: " + precoFinal);
    }

    // Limpa todos os campos e focaliza novamente no campo nomeProduto. int foo = Integer.parseInt("1234");
    public void limparDados(View V) {
        editNomeProduto.setText("");
        editValorProduto.setText("");
        editQtdPar.setText("");
        editJuros.setText("");
        editNomeProduto.requestFocus();
    }

}
