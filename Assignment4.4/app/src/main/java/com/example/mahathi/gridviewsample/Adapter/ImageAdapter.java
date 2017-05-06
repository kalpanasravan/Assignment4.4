package com.example.mahathi.gridviewsample.Adapter;

/**
 * Created by new user on 08-04-2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.mahathi.gridviewsample.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
/**
 * Created by new user on 07-04-2017.
 */

public class ImageAdapter extends BaseAdapter {


    private Context mContext;
    private final String[] name;
    private final int[] Imageid;

    // Constructor
    public ImageAdapter(Context c,String[] name,int[] Imageid) {
        mContext = c;
        this.name=name;
        this.Imageid=Imageid;
    }
    public int getCount() {
        return Imageid.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            grid = new View(mContext);
            grid=inflater.inflate(R.layout.main,null);
            TextView textView = (TextView) grid.findViewById(R.id.grid_text);
            ImageView image = (ImageView)grid.findViewById(R.id.grid_image);
            textView.setText(name[position]);
            image.setImageResource(Imageid[position]);

        }
        else
        {
            grid = (View) convertView;
        }
        grid.setId(Imageid[position]);
        return grid;
    }



}
