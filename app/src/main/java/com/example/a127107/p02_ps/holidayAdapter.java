package com.example.a127107.p02_ps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 127107 on 25/4/2017.
 */

public class holidayAdapter extends ArrayAdapter{

    private ArrayList<holiday> holiday;
    private Context context;
    private TextView tvH,tvD;
    private ImageView iv;


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.row, parent, false);


        tvH = (TextView) rowView.findViewById(R.id.tvH);
        tvD = (TextView) rowView.findViewById(R.id.tvD);
        iv = (ImageView) rowView.findViewById(R.id.imageView);

        holiday curr = holiday.get(position);


        tvH.setText(curr.getHoliday());
        tvD.setText(curr.getDate());
        iv.setImageResource(curr.getImg());

        return rowView;
    }
    public holidayAdapter(Context context, int resource, ArrayList<holiday> objects){
        super(context, resource, objects);

        holiday = objects;

        this.context = context;
    }

}
