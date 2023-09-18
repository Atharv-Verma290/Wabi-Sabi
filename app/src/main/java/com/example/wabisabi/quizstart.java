package com.example.wabisabi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class quizstart extends AppCompatActivity implements View.OnClickListener {
    Button button, Option1, Option2, Option3, Option4;
        FloatingActionButton close;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_quizstart);
            button = findViewById(R.id.button5);
            close = findViewById(R.id.floatingActionButton);
            Option1 = findViewById(R.id.option1);
            Option2 = findViewById(R.id.option2);
            Option3 = findViewById(R.id.option3);
            Option4 = findViewById(R.id.option4);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(quizstart.this, quizsecond.class);
                    startActivity(intent);
                }
            });

            close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(quizstart.this, Login.class);
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
            if (clickedButton.getId() == R.id.option1) {
                clickedButton.setBackgroundColor(Color.GREEN);
            } else {
                clickedButton.setBackgroundColor(Color.RED);
            }
        }

}