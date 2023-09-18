package com.example.wabisabi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class ProfileAct extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    TextView name,age,email,phonenum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);
        name =findViewById(R.id.textView3);
        age = findViewById(R.id.textView4);
        email = findViewById(R.id.textView8);
        phonenum = findViewById(R.id.textView9);
        String username = getIntent().getStringExtra("keyname");
        String userage = getIntent().getStringExtra("keyage");
        String userphone = getIntent().getStringExtra("keyphone");
        String useremail = getIntent().getStringExtra("keyemail");
        name.setText(username);
        age.setText(userage);
        email.setText(useremail);
        phonenum.setText(userphone);





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