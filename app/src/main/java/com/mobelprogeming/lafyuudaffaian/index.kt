package com.mobelprogeming.lafyuudaffaian

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class index : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_index)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val FS = findViewById<ImageView>(R.id.flashSale)
        FS.setOnClickListener{
            val intent = Intent(this, FlashSale::class.java)
            startActivity(intent)
        }
        val Fv = findViewById<ImageView>(R.id.lope)
        Fv.setOnClickListener{
            val intent = Intent(this, favorit::class.java)
            startActivity(intent)
        }
        val dt = findViewById<LinearLayout>(R.id.ditel)
        dt.setOnClickListener{
            val intent = Intent(this, ProuctDetail::class.java)
            startActivity(intent)
        }

        val dte = findViewById<LinearLayout>(R.id.dtel)
        dte.setOnClickListener{
            val intent = Intent(this, ProuctDetail::class.java)
            startActivity(intent)
        }
    }
}