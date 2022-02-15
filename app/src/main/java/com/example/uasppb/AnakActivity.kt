package com.example.uasppb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AnakActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ibuanak)

        val actionbar= supportActionBar
        actionbar!!.title = "Ibu dan Anak Activity"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}