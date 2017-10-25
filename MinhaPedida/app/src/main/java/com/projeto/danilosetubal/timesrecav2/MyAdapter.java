package com.projeto.danilosetubal.timesrecav2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Renato on 24/09/2017.
 */

public class MyAdapter extends BaseAdapter {

    private ArrayList<Torcedor> listTorcedores;
    private LayoutInflater inflater;

    public MyAdapter(ArrayList<Torcedor> torcedores, Context context) {
        this.listTorcedores = torcedores;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listTorcedores.size();
    }

    @Override
    public Object getItem(int i) {
        return listTorcedores.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public void add(Torcedor t){
        listTorcedores.add(t);
    }

    public void remover(Torcedor t){
        listTorcedores.remove(t);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Torcedor torcedor = listTorcedores.get(i);
        view = inflater.inflate(R.layout.item_listview, null);

        TextView tvNome = (TextView) view.findViewById(R.id.tvNome);
        TextView tvIdade = (TextView) view.findViewById(R.id.tvIdade);
        TextView tvNomeTime = (TextView) view.findViewById(R.id.tvNomeTime);
        ImageView ivImagem = (ImageView) view.findViewById(R.id.imageView);

        tvNome.setText(torcedor.getNome());
        tvIdade.setText(String.valueOf(torcedor.getIdade()) + " anos");

        if (torcedor.getTime().getNome().equals("Maçã")) {
            ivImagem.setImageResource(R.drawable.apple);
        } else if (torcedor.getTime().getNome().equals("Laranja")) {
            ivImagem.setImageResource(R.drawable.orange);
        } else if (torcedor.getTime().getNome().equals("Uva")) {
            ivImagem.setImageResource(R.drawable.grapes);
        } else if (torcedor.getTime().getNome().equals("Melancia")) {
            ivImagem.setImageResource(R.drawable.watermelon);
        } else if (torcedor.getTime().getNome().equals("Cerveja")) {
            ivImagem.setImageResource(R.drawable.beer);
        }else if (torcedor.getTime().getNome().equals("Hamburger")) {
            ivImagem.setImageResource(R.drawable.burger);
        }else if (torcedor.getTime().getNome().equals("Batata Frita")) {
            ivImagem.setImageResource(R.drawable.fries);
        }

        tvNomeTime.setText(torcedor.getTime().getNome());

        return view;
    }
}