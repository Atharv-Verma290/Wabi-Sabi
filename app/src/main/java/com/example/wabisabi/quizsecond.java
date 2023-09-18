package com.example.wabisabi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quizsecond extends AppCompatActivity implements View.OnClickListener{
    Button button,Option1,Option2,Option3,Option4;
    FloatingActionButton close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizsecond);
        button=findViewById(R.id.buttonquiz);
        close = findViewById(R.id.floatingActionButton1);
        Option1 = findViewById(R.id.option_1);
        Option2 = findViewById(R.id.option_2);
        Option3 = findViewById(R.id.option_3);
        Option4 = findViewById(R.id.option_4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(quizsecond.this, quizyend.class);
                startActivity(intent);
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(quizsecond.this, Login.class);
                startActivity(intent);
            }
        });
        Option1.setOnClickListener(this);
        Option2.setOnClickListener(this);
        Option3.setOnClickListener(this);
        Option4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Button clickedButton = (Button) v;
        if (clickedButton.getId() == R.id.option_2){
            clickedButton.setBackgroundColor(Color.GREEN);
        }else{
            clickedButton.setBackgroundColor(Color.RED);
        }
    }
}