package com.example.logonrm.alarmemanager

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btStart.setOnClickListener({
            disparar()
        })
    }

    fun disparar(){
        val tempo = Integer.parseInt(tvSegundos.text.toString())
        val intentAlarme = Intent(this,AlarmeReceiver::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this,0,intentAlarme,0)
        val alarmeManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager

        alarmeManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (tempo * 1000),pendingIntent)
    }
}
