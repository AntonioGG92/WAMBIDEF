package com.example.wambishop

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.wambishop.databinding.ActivityTiendaSecundariaBinding

class TiendaSecundaria : AppCompatActivity() {

    // Definir una variable para ViewBinding
    private lateinit var binding: ActivityTiendaSecundariaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inicializar ViewBinding
        binding = ActivityTiendaSecundariaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Acción al hacer clic en Añadir al Carrito
        binding.addToCartButton.setOnClickListener {
            Toast.makeText(this, "Producto añadido al carrito", Toast.LENGTH_SHORT).show()
        }

        // Acción al hacer clic en el botón de Favorito
        binding.favoriteButton.setOnClickListener {
            Toast.makeText(this, "Producto añadido a favoritos", Toast.LENGTH_SHORT).show()
        }
    }
}
