package com.projeto.danilosetubal.timesrecav2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by danilosetubal on 02/10/17.
 */

public class SpinnerAdapter extends ArrayAdapter<Time> {

    int groupid;
    Activity context;
    ArrayList<Time> list;
    LayoutInflater inflater;

    public SpinnerAdapter(Activity context, int groupid, int id, ArrayList<Time> list){
        super(context,id,list);
        this.list = list;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.groupid=groupid;
    }

    public View getView(int position, View convertView, ViewGroup parent ){
        View itemView=inflater.inflate(groupid,parent,false);
        ImageView imageView = itemView.findViewById(R.id.img);

        if (list.get(position).getImageId() == null) {
            imageView.setImageResource(0);
        } else {
            imageView.setImageResource(list.get(position).getImageId());
        }

        //imageView.setImageResource(list.get(position).getImageId());
        TextView textView = itemView.findViewById(R.id.txt);
        textView.setText(list.get(position).getNome());
        return itemView;
    }

    public View getDropDownView(int position, View convertView, ViewGroup
            parent){
        return getView(position,convertView,parent);

    }

}
