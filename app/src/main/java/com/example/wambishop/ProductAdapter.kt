package com.example.wambishop

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import java.util.Locale

class ProductAdapter(private val productList: MutableList<Product>) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cesta_producto, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position]
        holder.bind(product)
    }

    override fun getItemCount(): Int = productList.size

    inner class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val productImage: ImageView = itemView.findViewById(R.id.productImage)
        private val productName: TextView = itemView.findViewById(R.id.productName)
        private val productPrice: TextView = itemView.findViewById(R.id.productPrice)
        private val deleteButton: ImageButton = itemView.findViewById(R.id.deleteButton)
        private val increaseButton: Button = itemView.findViewById(R.id.increaseButton)
        private val decreaseButton: Button = itemView.findViewById(R.id.decreaseButton)
        private val quantityText: TextView = itemView.findViewById(R.id.quantityText)

        fun bind(product: Product) {
            productName.text = product.name
            productPrice.text = String.format(Locale.getDefault(), "%.2f€", product.price)
            quantityText.text = product.quantity.toString()
            productImage.setImageResource(product.imageResId)

            increaseButton.setOnClickListener {
                product.quantity++
                quantityText.text = product.quantity.toString()
                notifyDataSetChanged() // Actualiza toda la lista, puede mejorarse usando notifyItemChanged(adapterPosition)
            }

            decreaseButton.setOnClickListener {
                if (product.quantity > 1) {
                    product.quantity--
                    quantityText.text = product.quantity.toString()
                    notifyDataSetChanged()
                }
            }

            deleteButton.setOnClickListener {
                productList.removeAt(adapterPosition)
                notifyItemRemoved(adapterPosition)
                notifyItemRangeChanged(adapterPosition, productList.size)
            }
        }
    }
}
