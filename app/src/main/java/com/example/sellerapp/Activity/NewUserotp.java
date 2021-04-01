package com.example.sellerapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.sellerapp.R;

public class NewUserotp extends AppCompatActivity {
TextView Verify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_userotp);


        Verify=findViewById(R.id.Verify);



        Verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(NewUserotp.this,Password.class);
                startActivity(i);
            }
        });
    }
}