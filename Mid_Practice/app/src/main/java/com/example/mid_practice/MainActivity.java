package com.example.mid_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    Button btn;
    EditText textedit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.button);
        textedit=findViewById(R.id.enterfriend);



        ArrayList<String> friends=new ArrayList<String>();
        friends.add("Ahmad");
        friends.add("Saad");
        friends.add("Ali");
        listview=findViewById(R.id.friendlist);
        ArrayAdapter<String> adapt=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,friends);
        listview.setAdapter(adapt);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                friends.add(textedit.getText().toString());
                adapt.notifyDataSetChanged();
            }
        });
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("You Selected",friends.get(position));
            }
        });

    }
}