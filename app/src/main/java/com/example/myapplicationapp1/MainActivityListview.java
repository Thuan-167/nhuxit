package com.example.myapplicationapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivityListview extends AppCompatActivity {
    ListView lvMonAn;
    ArrayList<MonAn> mangMonAn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        lvMonAn=(ListView) findViewById(R.id.listViewMonAn);
        mangMonAn= new ArrayList<MonAn>();
        mangMonAn.add(new MonAn("Bánh xèo",12000,R.drawable.banhxeo));
        mangMonAn.add(new MonAn("Bún đậu",25000,R.drawable.bundau));
        mangMonAn.add(new MonAn("Cơm tấm",35000,R.drawable.comtam));
        mangMonAn.add(new MonAn("Thịt nướng",5000,R.drawable.thitxien));
        MonAnAdapter anAdapter= new MonAnAdapter(
                MainActivityListview.this,
                R.layout.dong_mon_an,mangMonAn
        );
        lvMonAn.setAdapter(anAdapter);
    }
}