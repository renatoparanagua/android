package com.projeto.danilosetubal.minhacotac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.projeto.danilosetubal.minhacotac.models.Moeda;
import com.projeto.danilosetubal.minhacotac.utils.MoedaDeserializer;
import com.projeto.danilosetubal.minhacotac.utils.MyAdapter;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Properties;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {

    ListView lvMoedas;
    ArrayList<Moeda> listMoedas;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buscaCotac(View v) {

        AsyncHttpClient client = new AsyncHttpClient();
        client.get("http://api.promasters.net.br/cotacao/v1/valores",
                new AsyncHttpResponseHandler() {
                    @Override
                    public void onSuccess(int i, Header[] headers, byte[] response) {

                        MoedaDeserializer deserializer = new MoedaDeserializer();

                        Moeda moeda;
                        String responseString = new String(response);


//                        moeda = deserializer.deserialize(responseString);




//                        Toast.makeText(MainActivity.this, valor.toString(), Toast.LENGTH_SHORT).show();





                    }

                    @Override
                    public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {
                        Toast.makeText(MainActivity.this, "Erro na busca!", Toast.LENGTH_SHORT).show();
                    }
        });

    }
}
