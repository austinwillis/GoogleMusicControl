package com.example.austi.musiccontrol;

import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by erinmunoz on 6/6/16.
 */
public class SettingsActivity extends PreferenceActivity {

    @Override
    public void onBuildHeaders(List<Header> target)
    {
        loadHeadersFromResource(R.xml.preference_header, target);
    }

    @Override
    protected boolean isValidFragment(String fragmentName)
    {
        return MySettingFragment.class.getName().equals(fragmentName);
    }
}
