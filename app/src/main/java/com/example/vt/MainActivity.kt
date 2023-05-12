package com.example.vt

import android.content.Intent
import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        //val numeutilizator = findViewById<EditText>(R.id.nume_utilizator)
        //val parola = findViewById<EditText>(R.id.parola)
        val submit = findViewById<Button>(R.id.submit)

        submit.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

        }
    }
}
