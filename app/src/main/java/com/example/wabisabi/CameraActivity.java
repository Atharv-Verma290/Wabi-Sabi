package com.example.wabisabi;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class CameraActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        bottomNavigationView = findViewById(R.id.bottomNav2);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.bottom_home) {
                    startActivity(new Intent(CameraActivity.this, Login.class));
                    return true;
                } else if (itemId == R.id.bottom_camera) {
                    return true;
                } else if (itemId == R.id.bottom_profile) {
                    startActivity(new Intent(CameraActivity.this, ProfileAct.class));
                    return true;
                }
                return false;
            }
        });
    }
}