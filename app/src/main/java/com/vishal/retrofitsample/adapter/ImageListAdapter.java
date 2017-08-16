package com.vishal.retrofitsample.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.vishal.retrofitsample.R;
import com.vishal.retrofitsample.collection.FlowerCollection;

/**
 * Created by Vishal Aroor on 16-Aug-17.
 */

public class ImageListAdapter extends BaseAdapter {

    FlowerCollection flowerCollection;
    Activity activity;

    public ImageListAdapter() {

    }

    public ImageListAdapter(Activity activity, FlowerCollection flowerCollection) {
        this.flowerCollection = flowerCollection;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return flowerCollection.getFlowers().length;
    }

    @Override
    public Object getItem(int i) {
        return flowerCollection.getFlowers()[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null) {

            LayoutInflater layoutInflater = activity.getLayoutInflater();
            view = layoutInflater.inflate(R.layout.list_item_view_layout, viewGroup, false);
        }

        ImageView imageView = view.findViewById(R.id.imageView);
        Picasso.with(activity).load(flowerCollection.getFlowers()[i].getUrl()).fit().into(imageView);
        return view;
    }
}
