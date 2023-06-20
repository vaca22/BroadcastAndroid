package com.vaca.broadcastandroid

import android.content.BroadcastReceiver
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.util.Log

class LittlePuReceiver : BroadcastReceiver() {
    private val ACTION_DATA = "com.viatom.action.DATA"
    private val EXTRA_JSON = "com.viatom.extra.JSON"
    override fun onReceive(context: Context, intent: Intent) {
        if(intent.action==ACTION_DATA){
            val code=intent.getStringExtra(EXTRA_JSON)
            if (code != null) {
                Log.e("gagacode",code)
            }
            return
        }
    }
}