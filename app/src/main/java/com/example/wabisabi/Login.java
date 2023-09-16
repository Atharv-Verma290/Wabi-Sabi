package com.example.wabisabi;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Login extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    ImageView quizstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bottomNavigationView = findViewById(R.id.bottomNav);
        quizstart = findViewById(R.id.imageView19);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
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
            }
        });

        quizstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, com.example.wabisabi.quizstart.class);
                startActivity(intent);
            }
        });

    }

}