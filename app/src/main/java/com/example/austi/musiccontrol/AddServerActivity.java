package com.example.austi.musiccontrol;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class AddServerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.serverlist);
        Toolbar addToolbar = (Toolbar) findViewById(R.id.add_server_toolbar);
        setSupportActionBar(addToolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
    }
}
