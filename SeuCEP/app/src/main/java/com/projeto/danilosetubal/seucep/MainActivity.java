package com.projeto.danilosetubal.seucep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.projeto.danilosetubal.seucep.model.Endereco;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {

    EditText etBuscaCep;
    EditText etCepProcurado;
    EditText etLogradouro;
    EditText etComplemento;
    EditText etBairro;
    EditText etLocalidade;
    EditText etUf;
    EditText etUnidade;
    EditText etIbge;
    EditText etGia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buscarCep(View v) {

        etBuscaCep = (EditText) findViewById(R.id.etBuscaCep);
        // Toast.makeText(this, etBuscaCep.getText(), Toast.LENGTH_SHORT).show();

        AsyncHttpClient client = new AsyncHttpClient();
        client.get("https://viacep.com.br/ws/" + etBuscaCep.getText() + "/json/",
                new AsyncHttpResponseHandler() {
                    @Override
                    public void onSuccess(int i, Header[] headers, byte[] response) {

                        Endereco endereco = new Endereco();

                        String responseString = new String(response);

                        Gson g = new Gson();
                        endereco = g.fromJson(responseString, Endereco.class);

                        etCepProcurado = (EditText) findViewById(R.id.etCepProcurado);
                        etCepProcurado.setText(endereco.getCep());

                        etLogradouro = (EditText) findViewById(R.id.etLogradouro);
                        etLogradouro.setText(endereco.getLogradouro());

                        etComplemento = (EditText) findViewById(R.id.etComplemento);
                        etComplemento.setText(endereco.getComplemento());

                        etBairro = (EditText) findViewById(R.id.etBairro);
                        etBairro.setText(endereco.getBairro());

                        etLocalidade = (EditText) findViewById(R.id.etLocalidade);
                        etLocalidade.setText(endereco.getLocalidade());

                        etUf = (EditText) findViewById(R.id.etUf);
                        etUf.setText(endereco.getUf());

                        etUnidade = (EditText) findViewById(R.id.etUnidade);
                        etUnidade.setText(endereco.getUnidade());

                        etIbge = (EditText) findViewById(R.id.etIbge);
                        etIbge.setText(endereco.getIbge());

                        etGia = (EditText) findViewById(R.id.etGia);
                        etGia.setText(endereco.getGia());

                    }

                    @Override
                    public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {

                    }
                });



    }

}
