package florianopolis.senac.renato.exemplolayoutcustomizado;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Aluno on 11/09/2017.
 */

public class AdapterListView extends BaseAdapter {

    private LayoutInflater inflater;
    private ArrayList<Planeta> itens;

    public AdapterListView(Context ctx, ArrayList<Planeta> lista){
        inflater = LayoutInflater.from(ctx);
        itens = lista;
    }

    @Override
    public int getCount() {
        return itens.size();
    }

    @Override
    public Object getItem(int position) {
        return itens.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Resgate do elemento
        Planeta planeta = itens.get(position);

        //Resgate do layout a ser inserideo os dados
        convertView = inflater.inflate(R.layout.item_listview, null);

        //Resgatar os elementos do layout
        TextView tvNome = (TextView) convertView.findViewById(R.id.tvNomePlaneta);
        ImageView imagem = (ImageView) convertView.findViewById(R.id.imagemPlaneta);

        //Inserir os dados do planeta atual no item do listView
        tvNome.setText(planeta.getNome());
        imagem.setImageResource(planeta.getResImagem());

        return convertView;
    }
}
