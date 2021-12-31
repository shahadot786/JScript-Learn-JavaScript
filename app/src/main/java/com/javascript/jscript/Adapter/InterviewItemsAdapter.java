package com.javascript.jscript.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.javascript.jscript.R;

public class InterviewItemsAdapter extends BaseAdapter {

    String[] itemName;
    Context context;
    Integer[] itemsImages;

    public InterviewItemsAdapter(String[] itemName, Context context, Integer[] itemsImages) {
        this.itemName = itemName;
        this.context = context;
        this.itemsImages = itemsImages;
    }

    @Override
    public int getCount() {
        return itemName.length;
    }

    @Override
    public Object getItem(int i) {
        return itemName[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View gridView = view;
        LayoutInflater inflater;
        if (view == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.topics_items_grid_layout,null);
        }

        TextView items = gridView.findViewById(R.id.programs_items);
        items.setText(itemName[i]);

        ImageView imageItems = gridView.findViewById(R.id.itemsImages);
        imageItems.setImageResource(itemsImages[i]);

        return gridView;
    }
}
