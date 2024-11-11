package com.example.wambishop

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configura el listener del botón "Acceder"

        val registro = findViewById<Button>(R.id.boton_registro);

        val acceder = findViewById<Button>(R.id.boton_acceder) ;
        registro.setOnClickListener{
            val intent = Intent(this@MainActivity, RegisterActivity ::class.java)
            startActivity(intent)
        }
        acceder.setOnClickListener{
            val a = Intent (this@MainActivity , Tienda_Principal :: class.java)
            startActivity(a)
        }
        // Ajusta los paddings según los insets del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
