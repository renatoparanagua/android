package com.projeto.danilosetubal.minhacotac.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.projeto.danilosetubal.minhacotac.R;
import com.projeto.danilosetubal.minhacotac.models.Moeda;

import java.util.ArrayList;

/**
 * Created by danilosetubal on 25/10/17.
 */

public class MyAdapter extends BaseAdapter {

    private ArrayList<Moeda> listMoedas;
    private LayoutInflater inflater;

    public MyAdapter(ArrayList<Moeda> moedas, Context context) {
        this.listMoedas = moedas;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listMoedas.size();
    }

    @Override
    public Object getItem(int i) {
        return listMoedas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public void add(Moeda m) {
        listMoedas.add(m);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Moeda moeda = listMoedas.get(i);
        view = inflater.inflate(R.layout.item_listview, null);

        TextView tvSigla = view.findViewById(R.id.tvSigla);
        TextView tvNome = view.findViewById(R.id.tvNome);
        TextView tvValor = view.findViewById(R.id.tvValor);

        tvSigla.setText(moeda.getSigla());
        tvNome.setText(moeda.getNome());
        tvValor.setText(moeda.getValor());

        return view;
    }
}
