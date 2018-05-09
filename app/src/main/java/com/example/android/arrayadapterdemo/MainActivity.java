package com.example.android.arrayadapterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] things = new String[] {
            "Coffee",
            "Cellphone",
            "Keys",
            "Ring"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list_view);

        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, things));
    }
}
