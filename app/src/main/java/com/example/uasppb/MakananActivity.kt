package com.example.uasppb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MakananActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makanan)

        val actionbar= supportActionBar
        actionbar!!.title = "Makanan dan Minuman Activity"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}