package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView hunza;
    TextView shogran;
    TextView skardu;
    TextView chitral;
    Button my_dest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hunza = findViewById(R.id.hunza);
        shogran = findViewById(R.id.shogran);
        skardu = findViewById(R.id.skardu);
        chitral = findViewById(R.id.chitral);
        my_dest =findViewById(R.id.my_dest);
        hunza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Hunza.class);
                startActivity(intent);
            }
        });
        shogran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this,Shogran.class);
                startActivity(intent);
            }
        });
        skardu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this,Skardu.class);
                startActivity(intent);
            }
        });
        chitral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this,Chitral.class);
                startActivity(intent);
            }
        });
        my_dest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MapsActivityDestinations.class);
                startActivity(intent);
            }
        });
    }
}