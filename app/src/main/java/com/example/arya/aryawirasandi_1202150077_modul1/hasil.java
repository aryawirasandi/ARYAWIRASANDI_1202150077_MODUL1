package com.example.arya.aryawirasandi_1202150077_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static java.lang.Integer.parseInt;

public class hasil extends AppCompatActivity {
//    Deklarasi variabel
    int uangSaku = 65000; int biaya, total, hargaTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil);
        TextView Makanan = (TextView)findViewById(R.id.makanan);
        TextView Qty = (TextView)findViewById(R.id.qty);
        TextView lokasi = (TextView)findViewById(R.id.lokasi);
        TextView hasil = (TextView)findViewById(R.id.harga);
//        untuk mendapatkan intent dari layout 1
        Intent i = getIntent();

//      Receive
        String makanan = i.getStringExtra("makanan");
        String Lokasi = i.getStringExtra("tempat");
        String qty = i.getStringExtra("porsi");
//      Display
        Makanan.setText(makanan);
        Qty.setText(qty);
        lokasi.setText(Lokasi);

        switch (Lokasi){
            case "EATBUS":
                    biaya = 50000;
            break;
            case "Abnormal":
                biaya = 30000;
                break;
        }
        total = parseInt(qty) * biaya;
        String hargaTotal = Integer.toString(total);
        if(uangSaku < total){
            hasil.setText("Rp"+hargaTotal);
            Toast.makeText(this, "Anda Tidak bisa makan disini", Toast.LENGTH_SHORT).show();
        }else{
            hasil.setText("Rp"+hargaTotal);
            Toast.makeText(this, "Anda bisa makan disini", Toast.LENGTH_SHORT).show();
        }
    }
}
