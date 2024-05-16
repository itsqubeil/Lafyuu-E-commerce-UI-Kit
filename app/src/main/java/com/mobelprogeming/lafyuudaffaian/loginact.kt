package com.mobelprogeming.lafyuudaffaian

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Loginact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_loginact)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val reg = findViewById<TextView>(R.id.log)
        reg.setOnClickListener{
            val intent = Intent(this, registeract::class.java)
            startActivity(intent)
        }
        val main = findViewById<Button>(R.id.button)
        main.setOnClickListener{
            val intent = Intent(this, index::class.java)
            startActivity(intent)
        }
    }
}