package com.example.a127107.p02_ps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.attr.type;


public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<String> al;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) this.findViewById(R.id.lvHoliday);
        //create array object
        al = new ArrayList<String>();
        al.add("secular");
        al.add("ethnic & religion");

        aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,al);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String type = al.get(position).toString();
                Intent intent = new Intent(getBaseContext(),typeHoliday.class);
                intent.putExtra("type",type);
                startActivity(intent);
            }
        });






    }
}
