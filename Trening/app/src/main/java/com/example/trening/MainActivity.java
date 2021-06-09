package com.example.trening;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.trening1Button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otvoriTreningPrsa();

            }
        });

        button2 = (Button) findViewById(R.id.trening2Button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otvoriTreningNoge();
            }
        });

        button3 = (Button) findViewById(R.id.trening3Button);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otvoriTreningLedja();
            }
        });

        button4 = (Button) findViewById(R.id.trening4Button);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otvoriTreningRamena();
            }
        });


    }
    public void otvoriTreningPrsa(){
        Intent intent =new Intent(this,PrsaITriceps.class);
        startActivity(intent);
    }
    public void otvoriTreningNoge(){
        Intent intent =new Intent(this,NogeITrbusnaci.class);
        startActivity(intent);
    }
    public void otvoriTreningLedja(){
        Intent intent =new Intent(this,LedjaIBiceps.class);
        startActivity(intent);
    }
    public void otvoriTreningRamena(){
        Intent intent =new Intent(this,RamenaIRuke.class);
        startActivity(intent);
    }
}