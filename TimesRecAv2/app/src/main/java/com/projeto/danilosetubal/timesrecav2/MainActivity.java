package com.projeto.danilosetubal.timesrecav2;

import android.app.AlertDialog;
import android.content.DialogInterface;
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

    public void novoTorcedor(View v) {
        Intent intent = new Intent(this, CadastroTorcedorActivity.class);
        startActivityForResult(intent, RESULT_FIRST_USER);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK){
            Bundle param = data.getExtras();
            Torcedor torcedor = (Torcedor) param.getSerializable("torcedor");
            Toast.makeText(this, "Torcedor incluído com sucesso!", Toast.LENGTH_SHORT).show();

            myAdapter.add(torcedor);
            myAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Sair do aplicativo")
                .setMessage("Tem certeza que deseja sair?")
                .setPositiveButton("Sim", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("Não", null)
                .show();
    }

}
