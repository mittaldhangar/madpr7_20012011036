package com.example.madpr7_20012011036

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.madpr7_20012011036.AlarmService
class AlarmBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val str1 = intent.getStringExtra("Service1")
        if(str1 == "Start" || str1 == "Stop")

        {
            val intentService = Intent(context, AlarmService::class.java)
            intentService.putExtra("Service1", intent.getStringExtra("Service1"))
            if(str1 == "Start")
            {
                context.startService(intentService)
            }
            else if(str1=="Stop") { context.stopService(intentService)
            }
        }
    }
}