package com.example.ikhwan.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button proses;

    CheckBox cekAbubakar, cekAbuJahal, cekMuslim, cekBukhori;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        proses = (Button) findViewById(R.id.proses);

        cekAbubakar = (CheckBox) findViewById(R.id.c1);
        cekAbuJahal = (CheckBox) findViewById(R.id.c2);
        cekMuslim = (CheckBox) findViewById(R.id.c3);
        cekBukhori = (CheckBox) findViewById(R.id.c4);

        proses.setOnClickListener(this);

    }

    public void onClick(View klik) {
        // TODO Auto-generated method stub
        String rt = "jawaban";
        if (cekAbubakar.isChecked()) {
            rt = "Benar";
            Intent intent = null;
            intent = new Intent(getApplicationContext(), Main22Activity.class);
            startActivity(intent);
        } else {
            rt = "Salah";
        }

        Toast.makeText(this, "Jawaban : " + rt, Toast.LENGTH_LONG).show();

        cekAbubakar.setChecked(false);
        cekMuslim.setChecked(false);
        cekAbuJahal.setChecked(false);
        cekBukhori.setChecked(false);
    }
}
