package senac.renato.correcaominhapedida.activitys;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import senac.renato.correcaominhapedida.R;
import senac.renato.correcaominhapedida.modelos.MyAdapter;
import senac.renato.correcaominhapedida.modelos.Pedido;


public class PrincipalActivity extends AppCompatActivity {

    ListView lvPedidos;
    ArrayList<Pedido> listPedidos;
    MyAdapter myAdapter;
    TextView tvTotalPagar;
    double total = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        tvTotalPagar = (TextView) findViewById(R.id.tvTotalPagar);

        lvPedidos = (ListView) findViewById(R.id.lvPedidos);

        //Criacao do arraylist vazio
        listPedidos = new ArrayList<>();
        myAdapter = new MyAdapter(listPedidos, this);
        lvPedidos.setAdapter(myAdapter);

        lvPedidos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(PrincipalActivity.this, "Clique curto", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void chamarTela(View v){
        Intent it = new Intent(this, AddProdutoActivity.class);
        startActivityForResult(it, RESULT_FIRST_USER);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }

    protected void atualizarTotal(){
        tvTotalPagar.setText("R$"+total);
    }
}
