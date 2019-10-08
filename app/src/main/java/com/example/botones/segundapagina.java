package com.example.botones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class segundapagina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundapagina);
    }

    public void Tercera(View view){
        Intent tercera = new Intent(this,tercerpagina.class);
        startActivity(tercera);
    }
}
