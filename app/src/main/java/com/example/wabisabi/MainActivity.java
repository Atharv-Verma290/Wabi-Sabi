package com.example.wabisabi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText phone;
    EditText createPassword;
    EditText re_createPassword;
    Button joinUs;
    Button signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences preferences = getSharedPreferences("PREFERENCE",MODE_PRIVATE);
        String FirstTime = preferences.getString("FirstTimeInstall","");

        if(FirstTime.equals("Yes")){
            Intent intent = new Intent(MainActivity.this, Login.class);
            startActivity(intent);
        }else {
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("FirstTimeInstall","Yes");
            editor.apply();
        }

        name = findViewById(R.id.editTextText);
        phone = findViewById(R.id.editTextPhone);
        createPassword = findViewById(R.id.editTextTextPassword);
        re_createPassword = findViewById(R.id.editTextTextPassword3);
        joinUs = findViewById(R.id.button);
        signUp = findViewById(R.id.button2);

        joinUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SignupActivity.class);
                startActivity(intent);
            }
        });

    }


}