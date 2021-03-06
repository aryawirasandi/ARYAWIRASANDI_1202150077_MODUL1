package com.example.arya.aryawirasandi_1202150077_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    Deklarasi variabel;
    Button Abnormal, Eatbus;
    EditText makanan, porsi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input);
//  Get by Id
        Abnormal = (Button)findViewById(R.id.abnormal);
        Eatbus = (Button)findViewById(R.id.eatbus);
        makanan = (EditText)findViewById(R.id.makanan);
        porsi = (EditText)findViewById(R.id.qty);

//  Abnormal BUtton
        Abnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(MainActivity.this,hasil.class);
                String tempat = Abnormal.getText().toString();
                move.putExtra("makanan", makanan.getText().toString());
                move.putExtra("tempat", tempat);
                move.putExtra("porsi", porsi.getText().toString());
                startActivity(move);

            }
        });
//  Eatbus Button
        Eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(MainActivity.this,hasil.class);
                String tempat = Eatbus.getText().toString();
                pindah.putExtra("makanan", makanan.getText().toString());

                pindah.putExtra("tempat", tempat);
                pindah.putExtra("porsi", porsi.getText().toString());
                startActivity(pindah);
            }
        });
    }
}
