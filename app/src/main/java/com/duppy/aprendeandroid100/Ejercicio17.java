package com.duppy.aprendeandroid100;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;


public class Ejercicio17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio17);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    /*
    * Llamada a Intent explicito
    */
    public void callIntExplicito(View view) {
        Intent intentExplicito = new Intent(this, Ejercicio17_2.class);
        intentExplicito.putExtra("TEXTO_ENVIDADO","mensaje enviado desde clase Ejercicio17");
        startActivity(intentExplicito);
    }

    /*
    * Llamada a Intent implicito
    */
    public void callIntImplicito(View view) {
        Intent intentImplicito = new Intent();
        intentImplicito.setAction(Intent.ACTION_SEND);
        intentImplicito.putExtra(Intent.EXTRA_TEXT,"Mensaje de prueba añadido al intent implicito");
        intentImplicito.setType("text/plain");
        if (intentImplicito.resolveActivity(getPackageManager()) != null) {
            startActivity(intentImplicito);
        } else {
            Toast.makeText(this,"No se puede ejecutar intentImplicito",Toast.LENGTH_SHORT).show();
        }

    }

    /*
    * Llamada a Intent pending
    */
    public void callIntPending(View view) {
        Intent intentPending = new Intent(this, Ejercicio17_2.class);
        PendingIntent pendIntent = PendingIntent.getActivity(getApplicationContext(),0,intentPending,0);

        Toast.makeText(this,"Intent pending a realizarse en un futuro",Toast.LENGTH_SHORT).show();
    }
}
