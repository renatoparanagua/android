package com.projeto.danilosetubal.correcaoav2.activitys;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.NumberPicker;
import android.widget.Spinner;

import com.projeto.danilosetubal.correcaoav2.R;
import com.projeto.danilosetubal.correcaoav2.modelos.Pedido;
import com.projeto.danilosetubal.correcaoav2.modelos.Produto;

import java.util.ArrayList;

public class AddProdutoActivity extends Activity {

    ArrayList<Produto> listProdutos;
    Spinner spProduto;
    ArrayAdapter<Produto> adapterProduto;
    NumberPicker npQuantidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_produto);

        listProdutos = new ArrayList<>();
        listProdutos.add(new Produto("Batata frita", 12.00));
        listProdutos.add(new Produto("Peixe", 18.00));
        listProdutos.add(new Produto("Camarão", 30.00));

        spProduto = (Spinner) findViewById(R.id.spProdutos);
        adapterProduto = new ArrayAdapter<Produto>(this, android.R.layout.simple_spinner_item, listProdutos);
        spProduto.setAdapter(adapterProduto);

        npQuantidade = (NumberPicker) findViewById(R.id.npQuantidade);
        npQuantidade.setMinValue(1);
        npQuantidade.setMaxValue(10);

    }


    public void enviar(View v){
        Pedido pedido = new Pedido();
        pedido.setItemPedido((Produto) spProduto.getSelectedItem());
        pedido.setQuantidade(npQuantidade.getValue());



        finish();
    }

    public void voltar(View v){
        finish();
    }

}
