package florianopolis.senac.renato.exemplolayoutcustomizado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LayoutListViewActivity extends AppCompatActivity {

    ListView lvPlanetas;
    ArrayList<Planeta> listPlanetas;
    AdapterListView adapterPlanetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_list_view);

        listPlanetas = new ArrayList<>();
        listPlanetas.add(new Planeta("Terra", R.drawable.terra));
        listPlanetas.add(new Planeta("Jupiter", R.drawable.jupiter));
        listPlanetas.add(new Planeta("Terra Plana", R.drawable.terra_plana));


        //ArrayAdapter adapterAntigo = new ArrayAdapter(this, android.R.layout.simple_list_item_2, listPlanetas);
        adapterPlanetas = new AdapterListView(this, listPlanetas);

        //Atribuir o adapter ao listView
        lvPlanetas = (ListView) findViewById(R.id.listViewPlanetas);
        lvPlanetas.setAdapter(adapterPlanetas);
    }
}





