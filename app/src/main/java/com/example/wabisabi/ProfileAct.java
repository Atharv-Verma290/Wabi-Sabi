package com.example.wabisabi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class ProfileAct extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);

        bottomNavigationView = findViewById(R.id.bottomNav3);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.bottom_home) {
                    startActivity(new Intent(ProfileAct.this, Login.class));
                    return true;
                } else if (itemId == R.id.bottom_camera) {
                    startActivity(new Intent(ProfileAct.this, CameraActivity.class));
                    return true;
                } else if (itemId == R.id.bottom_profile) {
                    return true;
                }
                return false;
            }
        });
    }
}