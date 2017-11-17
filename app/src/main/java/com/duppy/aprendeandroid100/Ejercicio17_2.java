package com.duppy.aprendeandroid100;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ejercicio17_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio17_2);

        Bundle extras = getIntent().getExtras();
        String mensaje = (extras.getString("TEXTO_ENVIDADO")!= null) ? extras.getString("TEXTO_ENVIDADO") : "";

        TextView msg2 = findViewById(R.id.textView2);
        msg2.setText(mensaje);
    }
}
