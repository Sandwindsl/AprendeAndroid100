package com.duppy.aprendeandroid100;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /* Acciones de los botones */
    public void callBtn16(View view) {
        Intent intent = new Intent(this, Ejercicio16.class);
        startActivity(intent);
    }

    public void callBtn17(View view) {
        Intent intent = new Intent(this, Ejercicio17.class);
        startActivity(intent);
    }

    public void callBtn18(View view) {
        Intent intent = new Intent(this, Ejercicio18.class);
        startActivity(intent);
    }

    public void callBtn19(View view) {
        Intent intent = new Intent(this, Ejercicio19.class);
        startActivity(intent);
    }

    public void callBtn20(View view) {
        Intent intent = new Intent(this, Ejercicio20.class);
        startActivity(intent);
    }

    public void callBtn21(View view) {
        Intent intent = new Intent(this, Ejercicio21.class);
        startActivity(intent);
    }

    public void callBtn22(View view) {
        Toast.makeText(this,"En pruebas 22",Toast.LENGTH_SHORT).show();
    }

    public void callBtn23(View view) {
        Toast.makeText(this,"En pruebas 23",Toast.LENGTH_SHORT).show();
    }

    public void callBtn24(View view) {
        Toast.makeText(this,"En pruebas 24",Toast.LENGTH_SHORT).show();
    }

    public void callBtn25(View view) {
        Toast.makeText(this,"En pruebas 25",Toast.LENGTH_SHORT).show();
    }

    public void callBtn26(View view) {
        Toast.makeText(this,"En pruebas 26",Toast.LENGTH_SHORT).show();
    }
}
