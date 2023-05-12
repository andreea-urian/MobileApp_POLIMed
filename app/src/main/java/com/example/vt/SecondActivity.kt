package com.example.vt

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)
        val prog = findViewById<ImageView>(R.id.imageButton)
        val rec = findViewById<ImageView>(R.id.imageButton2)
        val mas = findViewById<ImageView>(R.id.imageButton3)
        val logout = findViewById<Button>(R.id.buttonLogOut)

        prog.setOnClickListener {
            val intent = Intent(this, Programari::class.java)
            startActivity(intent)

        }

        rec.setOnClickListener {
            val intent = Intent(this, Recomandari::class.java)
            startActivity(intent)

        }

        mas.setOnClickListener {
            val intent = Intent(this, Masurare::class.java)
            startActivity(intent)

        }

        logout.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}