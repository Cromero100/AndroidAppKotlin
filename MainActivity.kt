package com.example.miprimeraapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.miprimeraapp.SaludarApp.SaludarActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSaludar = findViewById<Button>(R.id.btn_saludar)
        btnSaludar.setOnClickListener{
            navigateToSaludar()
        }

    }

    private fun navigateToSaludar() {
        val intent = Intent(this,SaludarActivity::class.java)
        startActivity(intent)
    }
}