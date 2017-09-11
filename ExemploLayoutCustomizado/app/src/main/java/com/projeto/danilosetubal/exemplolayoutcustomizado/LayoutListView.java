package com.projeto.danilosetubal.exemplolayoutcustomizado;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LayoutListView extends Activity {

    ListView lvPlanetas;
    ArrayList<Planeta> listPlanetas;
    AdapterListView adapterPlanetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_list_view);

        listPlanetas = new ArrayList<>();
        listPlanetas.add(new Planeta("Terra", R.drawable.terra));
        listPlanetas.add(new Planeta("Júpiter", R.drawable.jupiter));
        listPlanetas.add(new Planeta("Terra Plana", R.drawable.terra_plana));

        adapterPlanetas - new AdapterListView(this, listPlanetas);

        // Atribuir o adapter aos listview
        lvPlanetas = (ListView) findViewById(R.id.listViewPlanetas);


    }
}
