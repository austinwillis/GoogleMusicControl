package com.example.austi.musiccontrol

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar

class AddServerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.serverlist)
        val addToolbar = findViewById(R.id.add_server_toolbar) as Toolbar?
        setSupportActionBar(addToolbar)
        supportActionBar!!.setHomeButtonEnabled(true)
    }
}
