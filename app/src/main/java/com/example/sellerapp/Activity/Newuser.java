package com.example.sellerapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.sellerapp.R;

public class Newuser extends AppCompatActivity {
TextView logbtn,exitseller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newuser);
        logbtn=findViewById(R.id.logbtn);
        exitseller=findViewById(R.id.exitseller);


        logbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Newuser.this,NewUserotp.class);
                startActivity(i);
            }
        });


        exitseller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Newuser.this,Login.class);
                startActivity(i);
            }
        });
    }
}