package com.example.a10648.recover;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 10648 on 2016/6/15 0015.
 */
public class SizeAdapter extends ArrayAdapter<Size> {
    private int resourceId;

    public SizeAdapter(Context context, int resource, List<Size> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Size big_small = getItem(position);
//        View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
        View view;
        ViewHolder viewHolder;
        if (convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
            viewHolder = new ViewHolder();
            viewHolder.image = (ImageView)view.findViewById(R.id.size_image);
            viewHolder.name = (TextView)view.findViewById(R.id.size_name);
            view.setTag(viewHolder);
        }else {
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }
        viewHolder.image.setImageResource(big_small.getImageId());
        viewHolder.name.setText(big_small.getName());
        return view;
    }
    class ViewHolder{
        ImageView image;
        TextView name;
    }
}
