package com.example.mid_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> friends=new ArrayList<String>();
        friends.add("Ahmad");
        friends.add("Saad");
        friends.add("Ali");
        listview=findViewById(R.id.friendlist);
        ArrayAdapter<String> adapt=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,friends);
        listview.setAdapter(adapt);

    }
}