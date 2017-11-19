package com.duppy.aprendeandroid100;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Ejercicio20 extends AppCompatActivity {
    // Enlazado
    MiServicioEnlazado mService;
    boolean mBound = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio20);
    }

    @Override
    protected void onStart() {
        super.onStart();
        // Bind to LocalService
        Intent intent = new Intent(this, MiServicioEnlazado.class);
        bindService(intent, mConnection, Context.BIND_AUTO_CREATE);
    }

    @Override
    protected void onStop() {
        super.onStop();
        // Unbind from the service
        if (mBound) {
            unbindService(mConnection);
            mBound = false;
        }
    }

    /** Defines callbacks for service binding, passed to bindService() */
    private ServiceConnection mConnection = new ServiceConnection() {

        @Override
        public void onServiceConnected(ComponentName className,
                                       IBinder service) {
            // We've bound to LocalService, cast the IBinder and get LocalService instance
            MiServicioEnlazado.LocalBinder binder = (MiServicioEnlazado.LocalBinder) service;
            mService = binder.getService();
            //Toast.makeText(null, "onServiceConnected ", Toast.LENGTH_SHORT).show();
            mBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName arg0) {
            //Toast.makeText(null, "onServiceDisconnected ", Toast.LENGTH_SHORT).show();
            mBound = false;
        }
    };

    /* SERVICIO ENLAZADO */
    public void enlazarServicio(View v) {
        if (mBound) {
            // Call a method from the LocalService.
            // However, if this call were something that might hang, then this request should
            // occur in a separate thread to avoid slowing down the activity performance.
            int num = mService.getRandomNumber();
            Toast.makeText(this, "número: " + num, Toast.LENGTH_SHORT).show();
        }
    }

    public void desenlazarServicio(View v) {
        if (mBound) {
            unbindService(mConnection);
            mBound = false;
        }
    }

    /* SERVICIO INICIADO */
    public void arrancarServicio(View v) {
        Intent intent = new Intent(this, MiServicioIniciado.class);
        startService(intent);
    }

}
