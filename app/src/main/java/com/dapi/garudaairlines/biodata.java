package com.dapi.garudaairlines;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class biodata extends AppCompatActivity {
    EditText nama, alamat, ttl, kwg, harga;
    Spinner dari, tujuan, kelas;
    Button btnpesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        nama = (EditText) findViewById(R.id.editnama);
        alamat = (EditText) findViewById(R.id.editalamat);
        ttl = (EditText) findViewById(R.id.editttl);
        kwg = (EditText) findViewById(R.id.editkw);
        harga = (EditText) findViewById(R.id.editharga);
        dari = (Spinner) findViewById(R.id.sp_dari);
        tujuan = (Spinner) findViewById(R.id.sp_tujuan);
        kelas = (Spinner) findViewById(R.id.sp_kelas);
        btnpesan = (Button) findViewById(R.id.btn_pesantiket);


        btnpesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(biodata.this, result.class);
                startActivity(intent);
            }
        });


    }
}