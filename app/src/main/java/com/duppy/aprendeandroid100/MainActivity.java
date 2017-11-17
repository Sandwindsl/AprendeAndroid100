package com.duppy.aprendeandroid100;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

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
        Toast.makeText(this,"En pruebas 18",Toast.LENGTH_SHORT).show();
    }

    public void callBtn19(View view) {
        Toast.makeText(this,"En pruebas 19",Toast.LENGTH_SHORT).show();
    }

    public void callBtn20(View view) {
        Toast.makeText(this,"En pruebas 20",Toast.LENGTH_SHORT).show();
    }

    public void callBtn21(View view) {
        Toast.makeText(this,"En pruebas 21",Toast.LENGTH_SHORT).show();
    }

    public void callBtn22(View view) {
        Toast.makeText(this,"En pruebas 22",Toast.LENGTH_SHORT).show();
    }
}
