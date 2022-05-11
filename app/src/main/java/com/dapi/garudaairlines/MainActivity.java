package com.dapi.garudaairlines;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.Normalizer;

public class MainActivity extends AppCompatActivity {
    EditText editemail, editpassword;
    Button btnmasuk;

    String email = "user";
    String password = "password";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editemail = (EditText) findViewById(R.id.editemail);
        editpassword = (EditText) findViewById(R.id.editPassword);
        btnmasuk = (Button) findViewById(R.id.btn_masuk);

        btnmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editemail.getText().toString().equalsIgnoreCase(email)&&editpassword.getText().toString().equalsIgnoreCase(password)) {
                    Intent intent = new Intent(MainActivity.this, biodata.class);
                    startActivity(intent);

                } else {
                    Toast.makeText(MainActivity.this, "Email Atau Password Salah!", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}