package com.example.trening;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrsaITriceps2 extends AppCompatActivity {
        private Button dugme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prsa_itriceps2);
        dugme=(Button) findViewById(R.id.sledeceButton2);
        dugme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otvoriPrsa3();
            }
        });
    }

    public void otvoriPrsa3(){
        Intent intent=new Intent(this,PrsaITriceps3.class);
        startActivity(intent);
    }
}