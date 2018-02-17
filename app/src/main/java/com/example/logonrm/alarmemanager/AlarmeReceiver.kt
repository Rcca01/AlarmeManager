package com.example.logonrm.alarmemanager

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.widget.Toast

/**
 * Created by logonrm on 17/02/2018.
 */
class AlarmeReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val intent = Intent(context,MeuService::class.java)
        intent.putExtra("parametro1","oi")
        context?.startService(intent)
    }
}