package com.example.trening;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NogeITrbusnaci extends AppCompatActivity {
    private Button dugmence;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noge_itrbusnaci);

        dugmence=findViewById(R.id.Stranica2NogeButton);
        dugmence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otvoriNoge2();
            }
        });

    }
    public void otvoriNoge2(){
        Intent intent=new Intent(this,NogeITrbusnjaci2.class);
        startActivity(intent);
    }
}