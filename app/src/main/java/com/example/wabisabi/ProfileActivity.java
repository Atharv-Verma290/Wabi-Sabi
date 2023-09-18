package com.example.wabisabi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class ProfileActivity extends AppCompatActivity {
    private EditText name,age,phonenumber,email;
    private Button contprof;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        name = findViewById(R.id.rectangle_4);
        age = findViewById(R.id.ageprof);
        phonenumber = findViewById(R.id.phonenum);
        email = findViewById(R.id.emailprof);
        contprof = findViewById(R.id.contprof);
        contprof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = name.getText().toString();
                String userage = name.getText().toString();
                String userphone = name.getText().toString();
                String useremail = name.getText().toString();
                Intent intent = new Intent(ProfileActivity.this,Login.class);
                intent.putExtra("keyname",username);
                intent.putExtra("keyage",userage);
                intent.putExtra("keyemail",useremail);
                intent.putExtra("keyphone",userphone);
                startActivity(intent);
            }
        });

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Gender,R.layout.drop_down_item);
        adapter.setDropDownViewResource(R.layout.drop_down_item);
        spinner.setAdapter(adapter);
    }
}