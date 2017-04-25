package com.example.a127107.p02_ps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by 127107 on 25/4/2017.
 */

public class typeHoliday extends AppCompatActivity {

    ListView lv;
    TextView tv;
    ArrayAdapter aa;
    ArrayList<holiday> al;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.holiday_list);

        lv = (ListView) findViewById(R.id.lvHoliday2);
        tv = (TextView)findViewById(R.id.textView);

        Intent i = getIntent();
        String type = i.getStringExtra("type");
        tv.setText(type);
        al = new ArrayList<holiday>();
        if(type.equalsIgnoreCase("secular")){
            al.add(new holiday("New Year's Day","1 Jan 2017",type,R.drawable.newyear));
            al.add(new holiday("Labour Day","1 May 2017",type,R.drawable.labourday));

        } else {
            al.add(new holiday("Chinese New Year","28-29 Jan 2017",type,R.drawable.cny));
            al.add(new holiday("Good Friday","14 April 2017",type,R.drawable.goodfriday));

        }
        aa = new holidayAdapter(this, R.layout.row, al);
        lv.setAdapter(aa);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                holiday selection = al.get(position);

                Toast.makeText(typeHoliday.this, selection.getHoliday()
                                + ": " + selection.getDate(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}