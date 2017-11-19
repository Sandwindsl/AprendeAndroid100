package com.duppy.aprendeandroid100;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.widget.Toast;

import java.util.Random;

public class MiServicioEnlazado extends Service {
    //private MiEnlace enlace = new MiEnlace();
    private final IBinder mBinder = new LocalBinder();
    private final Random mGenerator = new Random();

    public MiServicioEnlazado() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        //throw new UnsupportedOperationException("Not yet implemented");
        return mBinder;
    }
/*
    @Override
    public int onStartCommand(Intent intent, int flags, int startld) {
        Toast.makeText(this, "servicio comenzando", Toast.LENGTH_SHORT).show();

        return START_NOT_STICKY;
    }
*/
    @Override
    public void onDestroy() {
        Toast.makeText(this, "servicio realizado", Toast.LENGTH_SHORT).show();
    }

    /** method for clients */
    public int getRandomNumber() {
        return mGenerator.nextInt(100);
    }

    public class LocalBinder extends Binder {

        MiServicioEnlazado getService() {
            // Return this instance of LocalService so clients can call public methods
            return MiServicioEnlazado.this;
        }
    }
}
