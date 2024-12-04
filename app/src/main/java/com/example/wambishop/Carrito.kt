package com.example.wambishop

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CarritoActivity : AppCompatActivity() {

    // Lista de productos: agregamos dos más para tener cuatro
    private val productList = listOf(
        Product("Sunlee Noodles", 3.75, 1),
        Product("Lechuga Marina", 5.75, 1),
        Product("Salsa Soya", 2.50, 1),  // Nuevo producto
        Product("Dulces Japoneses", 4.00, 1)  // Nuevo producto
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrito)

        val productsContainer = findViewById<LinearLayout>(R.id.productsContainer)

        // Para cada producto en la lista, inflamos la vista correspondiente y la añadimos al layout
        for (product in productList) {
            val productView = LayoutInflater.from(this).inflate(R.layout.item_cesta_producto, productsContainer, false)

            // Encuentra las vistas dentro del layout del producto
            val productName: TextView = productView.findViewById(R.id.productName)
            val productPrice: TextView = productView.findViewById(R.id.productPrice)
            val quantityText: TextView = productView.findViewById(R.id.quantityText)
            val increaseButton: Button = productView.findViewById(R.id.increaseButton)
            val decreaseButton: Button = productView.findViewById(R.id.decreaseButton)
            val deleteButton: ImageButton = productView.findViewById(R.id.deleteButton)

            // Asignar datos al layout del producto
            productName.text = product.name
            productPrice.text = String.format("%.2f€", product.price)
            quantityText.text = product.quantity.toString()

            // Manejo de botones para aumentar o disminuir cantidad
            increaseButton.setOnClickListener {
                product.quantity++
                quantityText.text = product.quantity.toString()
            }

            decreaseButton.setOnClickListener {
                if (product.quantity > 1) {
                    product.quantity--
                    quantityText.text = product.quantity.toString()
                }
            }

            // Botón de eliminar producto
            deleteButton.setOnClickListener {
                productsContainer.removeView(productView)
            }

            // Añadir la vista del producto al contenedor de productos
            productsContainer.addView(productView)
        }
    }
}
