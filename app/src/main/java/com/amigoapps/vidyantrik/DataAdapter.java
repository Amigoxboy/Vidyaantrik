package com.amigoapps.vidyantrik;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DataAdapter extends ArrayAdapter<Data>
{
    public DataAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Data> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public Context getContext() {
        return super.getContext();
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Nullable
    @Override
    public Data getItem(int position) {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        Data data =getItem(position);

        View listView =convertView;
        if(listView==null)
        {
            listView= LayoutInflater.from(getContext()).inflate(R.layout.list_layout,parent,false);
        }

        TextView val1;
        TextView val2 ;
        TextView val3;
        ImageView imageView;
        LinearLayout linearLayout;

        val1 =listView.findViewById(R.id.value1);
        val2= listView.findViewById(R.id.value2);
        val3 =listView.findViewById(R.id.value3);
       imageView =listView.findViewById(R.id.viewimage);
        linearLayout =listView.findViewById(R.id.visible_screen);

        val1.setText(data.getVal1());
        val2.setText(data.getVal2());
        val3.setText(data.getVal3());
        imageView.setImageResource(data.getImage());
        linearLayout.setBackgroundResource(data.getColor());

       return listView;
    }
}
