package com.example.austi.musiccontrol

import android.preference.PreferenceActivity

class SettingsActivity : PreferenceActivity() {

    override fun onBuildHeaders(target: List<PreferenceActivity.Header>) {
        loadHeadersFromResource(R.xml.preference_header, target)
    }

    override fun isValidFragment(fragmentName: String): Boolean {
        return MySettingFragment::class.java!!.getName() == fragmentName
    }
}
