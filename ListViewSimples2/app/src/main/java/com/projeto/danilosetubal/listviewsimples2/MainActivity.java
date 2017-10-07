package com.projeto.danilosetubal.listviewsimples2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.projeto.danilosetubal.listviewsimples2.models.Pessoa;
import com.projeto.danilosetubal.listviewsimples2.models.Sexo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Pessoa> listaDePessoas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1 - Resgatando a listView do layout.
        ListView lvPessoas = (ListView) findViewById(R.id.lvCPessoas);

        // 2 - Pegando uma lista de pessoas.
        List<Pessoa> pessoas = todasAsPessoas();

        // 3 - Criando o adapter com a lista de pessoas.
        ArrayAdapter<Pessoa> adapter = new ArrayAdapter<Pessoa>(this,
                android.R.layout.simple_list_item_1, pessoas);

        // 4 - Setando a listView (layout) com o adapter carregado.
        lvPessoas.setAdapter(adapter);
    }

    public List<Pessoa> todasAsPessoas() {
        Pessoa p1 = new Pessoa("Jesus de Nazaré", 33, Sexo.MASCULINO);
        Pessoa p2 = new Pessoa("Maria Betânia", 25, Sexo.FEMININO);
        Pessoa p3 = new Pessoa("Jonhny Cash", 54, Sexo.MASCULINO);
        listaDePessoas.add(p1);
        listaDePessoas.add(p2);
        listaDePessoas.add(p3);
        return listaDePessoas;
    }

}
