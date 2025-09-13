package com.example.miprimeraapp.SaludarApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.miprimeraapp.R

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        val tvResultado = findViewById<TextView>(R.id.tv_resultado)
        val name : String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvResultado.text = "Hola $name"
    }
}