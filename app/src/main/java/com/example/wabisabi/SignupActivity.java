package com.example.wabisabi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.annotation.NonNull;


import android.content.Intent;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;

public class SignupActivity extends AppCompatActivity {
    EditText Loginphonenumber,Loginpassword;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Loginphonenumber = findViewById(R.id.editTextPhone2);
        Loginpassword = findViewById(R.id.editTextTextPassword2);
        loginButton = findViewById(R.id.button3);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!validateUsername() | !validatePassword()) {
                } else {
                    checkUser();
                }
            }
        });

    }
    public Boolean validateUsername(){
        String val = Loginphonenumber.getText().toString();
        if(val.isEmpty()){
            Loginphonenumber.setError("User phone number cannot be empty");
            return false;
        }
        else{
            Loginphonenumber.setError(null);
            return true;
        }
    }
    public Boolean validatePassword(){
        String val = Loginpassword.getText().toString();
        if(val.isEmpty()){
            Loginpassword.setError("Password cannot be empty");
            return false;
        }
        else{
            Loginpassword.setError(null);
            return true;
        }
    }
    public void checkUser(){
        String phone_number = Loginphonenumber.getText().toString().trim();
        String create_pass = Loginpassword.getText().toString().trim();

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("users");
        Query checkUserDatabase = reference.orderByChild("phone_number").equalTo(phone_number);

        checkUserDatabase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()){
                    Loginphonenumber.setError(null);
                    String passwordFromDB = snapshot.child(phone_number).child("create_pass").getValue(String.class);

                    if (!Objects.equals(passwordFromDB,create_pass)){
                        Loginphonenumber.setError(null);
                        Intent intent = new Intent(SignupActivity.this, MainActivity.class);
                        startActivity(intent);
                    }else{
                        Loginpassword.setError("Invalid Credentials");
                        Loginpassword.requestFocus();
                    }
                } else {
                    Loginphonenumber.setError("User does not exist");
                    Loginphonenumber.requestFocus();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}
