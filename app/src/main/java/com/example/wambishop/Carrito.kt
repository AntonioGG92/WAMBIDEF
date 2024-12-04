package com.example.wambishop

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CarritoActivity : AppCompatActivity() {

    // Lista de productos
    private val productList = mutableListOf(
        Product("Sunlee Noodles", 3.75, 1, R.drawable.sunleestickrice_scrollview),
        Product("Lechuga Marina", 5.75, 1, R.drawable.lechuga_image),
        Product("Salsa Soya", 2.50, 1, R.drawable.salsasoja_horizontalscroll),
        Product("Dulces Japoneses", 4.00, 1, R.drawable.dulces_horizontalscroll)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrito)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val productAdapter = ProductAdapter(productList)
        recyclerView.adapter = productAdapter

        Log.d("CarritoActivity", "RecyclerView configurado, adaptador inicializado con ${productList.size} productos")
    }
}
