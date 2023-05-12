package com.example.vt

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Masurare : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.masurare_date)

        val back = findViewById<ImageView>(R.id.buttonBack)


        // set on-click listener
        back.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

        }
    }

}