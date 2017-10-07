package com.projeto.danilosetubal.listviewsimples1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.projeto.danilosetubal.listviewsimples1.models.Divisao;
import com.projeto.danilosetubal.listviewsimples1.models.Time;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Time> listaTimes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1 - Pegando a lista de times.
        List<Time> times = todosOsTimes();

        // 2 - Resgatando a listView do layout.
        ListView lvTimes = (ListView) findViewById(R.id.lvTimes);

        // 3 - Criando o adapter.
        ArrayAdapter<Time> adapter = new ArrayAdapter<Time>(this,
                android.R.layout.simple_list_item_1, times);

        // 4 - Setando o adapter a listView de times.
        lvTimes.setAdapter(adapter);


    }



    public List<Time> todosOsTimes() {

        Time time1 = new Time("Santos FC", "Santos, SP", Divisao.PRIMEIRA);
        Time time2 = new Time("Figueirense FC", "Florianópolis, SC", Divisao.SEGUNDA);
        Time time3 = new Time("Joinville EC", "Joinville, SC", Divisao.TERCEIRA);

        listaTimes.add(time1);
        listaTimes.add(time2);
        listaTimes.add(time3);

        return listaTimes;
    }

}
