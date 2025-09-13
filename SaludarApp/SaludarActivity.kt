package com.example.miprimeraapp.SaludarApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.miprimeraapp.R

class SaludarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludar)
        val btnEnviar = findViewById<Button>(R.id.btn_enviar)
        val etNombre = findViewById<EditText>(R.id.et_nombre)

        btnEnviar.setOnClickListener{
            val name = etNombre.text.toString()
            if(name.isNotEmpty()){
                val intent = Intent(this, ResultadoActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }
        }
    }
}