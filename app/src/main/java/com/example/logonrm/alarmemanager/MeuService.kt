package com.example.logonrm.alarmemanager

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.widget.Toast

/**
 * Created by logonrm on 17/02/2018.
 */
class MeuService:Service() {

    lateinit var mp : MediaPlayer

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        mp = MediaPlayer.create(this,R.raw.alarm_clock)
        mp.start()
        if (intent?.extras != null) {
            val parametro = intent?.getStringExtra("parametro1")
            Toast.makeText(this, parametro, Toast.LENGTH_LONG).show()
        }

        //Estudar retornos
        return START_REDELIVER_INTENT
    }

    override fun onBind(intent: Intent?): IBinder ?{
        return null
    }
}