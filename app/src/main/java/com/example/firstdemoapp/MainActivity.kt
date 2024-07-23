package com.example.firstdemoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark = findViewById<Button>(R.id.btnDark)
        val buttonRead = findViewById<Button>(R.id.btnRead)
        val layout = findViewById<LinearLayout>(R.id.linearLayout)
        val explicitIntent = findViewById<Button>(R.id.button)

        buttonDark.setOnClickListener{
            Toast.makeText(applicationContext, "Dark Mode Enabled", Toast.LENGTH_SHORT).show()
            layout.setBackgroundResource(R.color.black)
        }

        buttonRead.setOnClickListener {
            Toast.makeText(applicationContext, "Light Mode Enabled", Toast.LENGTH_SHORT).show()
            layout.setBackgroundResource(R.color.yellow)
        }

        explicitIntent.setOnClickListener {
            // open a new activity
            intent = Intent(applicationContext, SecActivity::class.java)
            startActivity(intent)
        }

    }
}