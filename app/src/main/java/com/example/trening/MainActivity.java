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

        button1=(Button) findViewById(R.id.buttonMuskarci);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                otvoriMuskarce();
            }
        });

//        button2=(Button) findViewById(R.id.buttonZene);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                otvoriZene();
//            }
//        });

    }
    public void otvoriMuskarce(){
        Intent intent=new Intent(this,Muskarci.class);
        startActivity(intent);
    }
    public void otvoriZene(){
        Intent intent=new Intent(this,Zene.class);
        startActivity(intent);
    }
}