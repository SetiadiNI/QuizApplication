package com.example.ikhwan.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Main22Activity extends AppCompatActivity implements View.OnClickListener {

    Button proses;

    CheckBox cek1, cek2, cek3, cek4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

        proses = (Button) findViewById(R.id.proses);

        cek1 = (CheckBox) findViewById(R.id.c1);
        cek2 = (CheckBox) findViewById(R.id.c2);
        cek3 = (CheckBox) findViewById(R.id.c3);
        cek4 = (CheckBox) findViewById(R.id.c4);

        proses.setOnClickListener(this);

    }

    public void onClick(View klik) {
        // TODO Auto-generated method stub
        String rt = "jawaban";
        if (cek2.isChecked()) {
            rt = "Benar";
            Intent intent = null;
            intent = new Intent(getApplicationContext(), Main3Activity.class);
            startActivity(intent);
        } else {
            rt = "Salah";
        }

        Toast.makeText(this, "Jawaban : " + rt, Toast.LENGTH_LONG).show();

        cek1.setChecked(false);
        cek2.setChecked(false);
        cek3.setChecked(false);
        cek4.setChecked(false);
    }
}
