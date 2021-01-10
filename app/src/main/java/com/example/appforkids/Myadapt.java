package com.example.appforkids;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

public class Myadapt extends BaseAdapter {
    Context context;
    String name[];
    LayoutInflater layoutInflater;

    public Myadapt(Context context, String[] name) {
        this.context = context;
        this.name = name;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=layoutInflater.inflate(R.layout.item,null);
        Button btn1=view.findViewById(R.id.bt1);
        btn1.setText( name[i]);

        return view;
    }
}

