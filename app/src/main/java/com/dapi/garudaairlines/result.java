package com.dapi.garudaairlines;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result extends AppCompatActivity {

    Button btndownload, btnselesai;
    TextView tvtampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        btndownload = (Button) findViewById(R.id.btn_download);
        btnselesai = (Button) findViewById(R.id.btn_selesai);
        tvtampil = (TextView) findViewById(R.id.tv_tampil);


        tvtampil.getText().toString();




        btnselesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(result.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}