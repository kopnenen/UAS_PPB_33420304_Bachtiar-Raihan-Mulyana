package com.example.uasppb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RumahActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rumah)

        val actionbar= supportActionBar
        actionbar!!.title = "Rumah dan Dapur Activity"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}