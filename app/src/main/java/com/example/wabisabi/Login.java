package com.example.wabisabi;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Login extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    ImageView quizstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        bottomNavigationView = findViewById(R.id.bottomNav);
        quizstart = findViewById(R.id.imageView19);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.bottom_home) {
                return true;
            } else if (itemId == R.id.bottom_camera) {
                startActivity(new Intent(Login.this, CameraActivity.class));
                return true;
            } else if (itemId == R.id.bottom_profile) {
                startActivity(new Intent(Login.this, ProfileAct.class));
                return true;
            }
            return false;
        });

        quizstart.setOnClickListener(v -> {
            Intent intent = new Intent(Login.this, com.example.wabisabi.quizstart.class);
            startActivity(intent);
        });

    }

}