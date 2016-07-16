package com.example.pan.appaew;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pan on 7/13/2016.
 */
public class MonthsAdapter extends ArrayAdapter<Months>{

    Context mContext;
    int mResource;
    ArrayList<Months> mObjects;

    public MonthsAdapter(Context context, int resource, ArrayList<Months> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
        mObjects = objects;
    }

    public View getView (int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(mResource, parent, false);

        TextView month = (TextView) convertView.findViewById(R.id.list_month);
        month.setText(mObjects.get(position).getMonth());

        return convertView;
    }


}

