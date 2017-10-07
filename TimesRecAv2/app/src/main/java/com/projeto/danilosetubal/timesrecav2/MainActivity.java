package com.projeto.danilosetubal.timesrecav2;

import android.content.Intent;
import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvTorcedores;
    ArrayList<Torcedor> listTorcedores;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTorcedores = (ListView) findViewById(R.id.listViewCustom);
        listTorcedores = new ArrayList<>();
        myAdapter = new MyAdapter(listTorcedores, this);
        lvTorcedores.setAdapter(myAdapter);

    }

    public void renderizarListView() {
        Toast.makeText(this, "Renderizar ListView!", Toast.LENGTH_SHORT).show();

    }

    public void novo(View v) {
        Intent intent = new Intent(this, CadastroTorcedorActivity.class);
        startActivityForResult(intent, RESULT_FIRST_USER);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK){
            Bundle param = data.getExtras();
            Torcedor torcedor = (Torcedor) param.getSerializable("torcedor");
            Toast.makeText(this, "chamou onActivityResult", Toast.LENGTH_SHORT).show();

            Toast.makeText(this, torcedor.getNome()
                    + " - " + torcedor.getIdade(), Toast.LENGTH_SHORT).show();

            myAdapter.add(torcedor);
            myAdapter.notifyDataSetChanged();
        }
    }



}
