package com.example.trening;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrsaITriceps extends AppCompatActivity {
private Button sledeceButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prsa_itriceps);
        sledeceButton=(Button) findViewById(R.id.SledećeButton);
        sledeceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otvoriPrsa2();
            }
        });
    }

    public void otvoriPrsa2(){
        Intent intent=new Intent(this,PrsaITriceps2.class);
        startActivity(intent);
    }

}