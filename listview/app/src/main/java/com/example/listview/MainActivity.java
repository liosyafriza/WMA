package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.text.DateFormatSymbols;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    ListView listViewMonth;
    String[] months;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewMonth = findViewById(R.id.listViewMonth);
        months = new DateFormatSymbols().getMonths();//data array nama bulan
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, months);//fungsi untuk menampilkan datalist melalui adapter
        listViewMonth.setAdapter(adapter);

        //action klik
        listViewMonth.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View View, int position, long id) {
                Toast.makeText(getApplicationContext(), "Anda klik bulan : " + parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}