package com.javascript.jscript.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.javascript.jscript.R;

public class InterviewItemsAdapterPro extends BaseAdapter {
    String[] itemNamePro;
    Integer[] itemImagesPro;
    Context contextPro;

    public InterviewItemsAdapterPro(String[] itemNamePro, Integer[] itemImagesPro, Context contextPro) {
        this.itemNamePro = itemNamePro;
        this.itemImagesPro = itemImagesPro;
        this.contextPro = contextPro;
    }

    @Override
    public int getCount() {
        return itemNamePro.length;
    }

    @Override
    public Object getItem(int i) {
        return itemNamePro[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View gridViewPro = view;
        LayoutInflater inflater;
        if (view == null){
            inflater = (LayoutInflater) contextPro.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridViewPro = inflater.inflate(R.layout.programs_items_grid_layout,null);
        }

        TextView items = gridViewPro.findViewById(R.id.programs_items);
        items.setText(itemNamePro[i]);

        ImageView imageItems = gridViewPro.findViewById(R.id.itemsImages);
        imageItems.setImageResource(itemImagesPro[i]);

        return gridViewPro;
    }
}
