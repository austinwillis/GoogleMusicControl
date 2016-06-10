package com.example.austi.musiccontrol

import android.os.Bundle
import android.preference.PreferenceFragment

class MySettingFragment : PreferenceFragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addPreferencesFromResource(R.xml.fragment_preferences)
    }
}
