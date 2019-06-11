package com.example.a1892745.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class intentproject1 extends AppCompatActivity {
      EditText edt_uname,edt_password;
            Button btn_submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intentproject1);

        edt_uname =findViewById(R.id.edt_uname);
        edt_password =findViewById(R.id.edt_password);
        btn_submit=findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname,password;


                uname= edt_uname.getText() .toString();
                password=edt_password.getText().toString();

                Intent i = new Intent(intentproject1.this,MainActivity.class);
                i.putExtra("un",uname);
                i.putExtra("ps",password);

                startActivity(i);

                Toast.makeText(getApplicationContext(),uname+"thanks" , Toast.LENGTH_LONG).show();

            }
        });

    }
}
