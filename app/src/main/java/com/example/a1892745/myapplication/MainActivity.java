package com.example.a1892745.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String name,password;
    TextView txt_nm,txt_ps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = getIntent();

        i.getExtras();
        name = i.getStringExtra("un");
        password = i.getStringExtra("ps");


        txt_nm = findViewById(R.id.txt_name);
        txt_ps = findViewById(R.id.txt_name_name_pas);

        txt_nm.setText(name);
        txt_ps.setText(password);


    }
}
