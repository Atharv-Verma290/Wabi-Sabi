package com.example.wabisabi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {
    EditText signupName;

    EditText signupphonenumber;
    EditText signuppassword;
    EditText signuprecreatepassword;
    Button joinUs;
    Button signUp;

    FirebaseDatabase database;
    DatabaseReference reference;
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

        signupName = findViewById(R.id.editTextText);
        signupphonenumber = findViewById(R.id.editTextPhone);
        signuppassword = findViewById(R.id.editTextTextPassword);
        signuprecreatepassword = findViewById(R.id.editTextTextPassword3);
        joinUs = findViewById(R.id.button);
        signUp = findViewById(R.id.button2);

        joinUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                database = FirebaseDatabase.getInstance();
                reference = database.getReference("users");

                String name = signupName.getText().toString();
                String phone_number = signupphonenumber.getText().toString();
                String  create_pass = signuppassword .getText().toString();
                String re_enter_pa = signuprecreatepassword.getText().toString();

                HelperClass helperClass = new HelperClass(name, phone_number,  create_pass, re_enter_pa);
                reference.child(name).setValue(helperClass);

                Toast.makeText(MainActivity.this, "You have signup successfully!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SignupActivity.class);
                startActivity(intent);
            }
        });

    }


}