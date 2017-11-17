package com.duppy.aprendeandroid100;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Ejercicio16 extends AppCompatActivity {

    /*
    * @see android.AppCompatActivity#onCreate()
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio16);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Este es un mensaje de prueba", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    /*
    * @see android.AppCompatActivity#onStart()
    */
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"Actividad onStart",Toast.LENGTH_SHORT).show();
    }

    /*
    * @see android.AppCompatActivity#onResume()
    */
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"Actividad onResume",Toast.LENGTH_SHORT).show();
    }

    /*
    * @see android.AppCompatActivity#onPause()
    */
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"Actividad onPause",Toast.LENGTH_SHORT).show();
    }

    /*
    * @see android.AppCompatActivity#onStop()
    */
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"Actividad onStop",Toast.LENGTH_SHORT).show();
    }

    /*
    * @see android.AppCompatActivity#onRestart()
    */
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"Actividad onRestart",Toast.LENGTH_SHORT).show();
    }

    /*
    * @see android.AppCompatActivity#onDestroy()
    */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Actividad onDestroy",Toast.LENGTH_SHORT).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:
                if (item.isChecked()) {
                    Toast.makeText(this,"settings checked -> setChecked(false)",Toast.LENGTH_SHORT).show();
                    item.setChecked(false);
                }
                else {
                    Toast.makeText(this,"settings checked -> setChecked(true)",Toast.LENGTH_SHORT).show();
                    item.setChecked(true);
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /*
    * Botón de mensaje de prueba
    */
    public void callMsgPrueba(View view) {
        Toast.makeText(this,"Esto es un mensaje de prueba",Toast.LENGTH_SHORT).show();
    }

}
