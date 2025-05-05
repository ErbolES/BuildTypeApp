package com.example.buildtypesapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this).apply {
            text = "API_URL: ${BuildConfig.API_URL}\nApp Name: ${getString(R.string.app_name)}"
            textSize = 18f
            setPadding(24, 24, 24, 24)
        }

        setContentView(textView)
    }
}