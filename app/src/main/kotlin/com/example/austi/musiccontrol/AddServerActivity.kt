package com.example.austi.musiccontrol

import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import java.util.Arrays

class AddServerActivity : AppCompatActivity(), SwipeRefreshLayout.OnRefreshListener {


    private var swipeView: SwipeRefreshLayout? = null

    private var listView: ListView? = null
    private var adapter: ArrayAdapter<String>? = null

    private val LIST_ITEM_TEXT_CITIES = arrayOf("Los Angeles", "Chicago", "Indianapolis", "San Francisco", "Oklahoma City", "Washington")

    private val LIST_ITEM_TEXT_MORE_CITIES = arrayOf("Phoenix", "San Antonio", "San Jose", "Nashville", "Las Vegas", "Virginia Beach")

    private var cityList: List<String>? = null

    // variable to toggle city values on refresh
    internal var refreshToggle = true
    private var toolbar: Toolbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.serverlist)
        toolbar = findViewById(R.id.add_server_toolbar) as Toolbar?
        setSupportActionBar(toolbar)

        swipeView = findViewById(R.id.swipe_view) as SwipeRefreshLayout?
        swipeView!!.setOnRefreshListener(this)
        swipeView!!.setColorSchemeColors(Color.GRAY, Color.GREEN, Color.BLUE,
                Color.RED, Color.CYAN)
        swipeView!!.setDistanceToTriggerSync(20)// in dips
        swipeView!!.setSize(SwipeRefreshLayout.DEFAULT)// LARGE also can be used

        cityList = Arrays.asList(*LIST_ITEM_TEXT_CITIES)
        listView = findViewById(R.id.list) as ListView?
        adapter = ArrayAdapter(applicationContext,
                R.layout.list_item, cityList!!)
        listView!!.adapter = adapter
        listView!!.requestLayout()
    }

    internal var handler: Handler = object : Handler() {
        override fun handleMessage(msg: android.os.Message) {

            if (refreshToggle) {
                refreshToggle = false
                cityList = Arrays.asList(*LIST_ITEM_TEXT_MORE_CITIES)
                adapter = ArrayAdapter(applicationContext,
                        R.layout.list_item, cityList!!)
            } else {
                refreshToggle = true
                cityList = Arrays.asList(*LIST_ITEM_TEXT_CITIES)
                adapter = ArrayAdapter(applicationContext,
                        R.layout.list_item, cityList!!)
            }
            listView!!.adapter = adapter

            swipeView!!.postDelayed({
                Toast.makeText(applicationContext,
                        "city list refreshed", Toast.LENGTH_SHORT).show()
                swipeView!!.isRefreshing = false
            }, 1000)
        }
    }

    override fun onRefresh() {

        swipeView!!.postDelayed({
            swipeView!!.isRefreshing = true
            handler.sendEmptyMessage(0)
        }, 1000)
    }

}