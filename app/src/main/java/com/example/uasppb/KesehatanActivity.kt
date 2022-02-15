package com.example.uasppb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class KesehatanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kesehatan)

        val actionbar= supportActionBar
        actionbar!!.title = "Kesehatan dan Kecantikan Activity"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}