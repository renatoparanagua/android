package com.projeto.danilosetubal.listviewpersonalizada1.utils;

import android.app.Activity;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.projeto.danilosetubal.listviewpersonalizada1.R;
import com.projeto.danilosetubal.listviewpersonalizada1.models.Categoria;
import com.projeto.danilosetubal.listviewpersonalizada1.models.Curso;

import java.util.List;

/**
 * Created by danilosetubal on 04/10/17.
 */

public class AdapterCursosPersonalizado extends BaseAdapter {

    private final List<Curso> cursos;
    private final Activity act;

    public AdapterCursosPersonalizado(List<Curso> cursos, Activity act) {
        this.cursos = cursos;
        this.act = act;
    }

    // Método que retorna a quantidade de itens existentes na lista.
    @Override
    public int getCount() {
        return cursos.size();
    }

    // Retorna um item passando como parâmetro o indíce dele na lista.
    @Override
    public Object getItem(int i) {
        return cursos.get(i);
    }

    // Retorna o ID de um item, passando como parâmetro a posição dele.
    @Override
    public long getItemId(int i) {
        return 0;
    }

    // Método responsável pela construção de cada item da listView.
    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View view = act.getLayoutInflater().inflate(R.layout.lista_curso_personalizada,
                parent, false);
        Curso curso = cursos.get(i);

        // pegando as referências das views
        TextView nome = (TextView) view.findViewById(R.id.lista_curso_personalizada_nome);
        TextView descricao = (TextView) view.findViewById(R.id.lista_curso_personalizada_descricao);
        ImageView imagem = (ImageView) view.findViewById(R.id.lista_curso_personalizada_imagem);

        // populando as views
        nome.setText(curso.getNome());
        descricao.setText(curso.getDescricao());

        Categoria categoria = curso.getCategoria();

        if (categoria.equals(Categoria.HTML)) {
            imagem.setImageResource(R.drawable.html);
        } else if (categoria.equals(Categoria.JAVA)) {
            imagem.setImageResource(R.drawable.java);
        } else if (categoria.equals(Categoria.ANDROID)) {
            imagem.setImageResource(R.drawable.android);
        }

        return view;
    }
}
