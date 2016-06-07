package com.example.austi.musiccontrol;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by erinmunoz on 6/6/16.
 */
public class MySettingFragment extends PreferenceFragment
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.fragment_preferences);
    }
}
