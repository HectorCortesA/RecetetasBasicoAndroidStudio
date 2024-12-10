package com.example.menu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.SplashTheme)

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val pizaaButton = findViewById<Button>(R.id.button)
        pizaaButton.setOnClickListener {
            val intent = Intent(this, Pizaa::class.java)
            startActivity(intent)

        }
        val coffeeButton = findViewById<Button>(R.id.button2)
        coffeeButton.setOnClickListener {
            val intent = Intent(this, Coffe::class.java)
            startActivity(intent)
        }
        val tacosButton = findViewById<Button>(R.id.button4)
        tacosButton.setOnClickListener {
            val intent = Intent(this, Tacos::class.java)
            startActivity(intent)
        }
        val postresButton = findViewById<Button>(R.id.button3)
        postresButton.setOnClickListener {
            val intent = Intent(this, Postres::class.java)
            startActivity(intent)
        }
        val pastelButton = findViewById<Button>(R.id.button5)
        pastelButton.setOnClickListener {
            val intent = Intent(this, Pastel::class.java)
            startActivity(intent)
        }
        val tiendaButton = findViewById<Button>(R.id.button6)
        tiendaButton.setOnClickListener {
            val intent = Intent(this, Tienda::class.java)
            startActivity(intent)
        }
        val burgueButton = findViewById<Button>(R.id.button7)
        burgueButton.setOnClickListener {
            val intent = Intent(this, Burguer::class.java)
            startActivity(intent)
        }
        val birriaButton = findViewById<Button>(R.id.button8)
        birriaButton.setOnClickListener {
            val intent = Intent(this, Birria::class.java)
            startActivity(intent)
        }
        val shushiButton = findViewById<Button>(R.id.button9)
        shushiButton.setOnClickListener {
            val intent = Intent(this, Shushi::class.java)
            startActivity(intent)
        }
        val fitButton = findViewById<Button>(R.id.button10)
        fitButton.setOnClickListener {
            val intent = Intent(this, Fit::class.java)
            startActivity(intent)
        }
    }
}