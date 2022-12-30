package com.example.clevertankenleichtgemacht.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.clevertankenleichtgemacht.R
import com.example.clevertankenleichtgemacht.data.Product
import com.example.clevertankenleichtgemacht.ui.HomeFragmentDirections


class ProductAdapter() : RecyclerView.Adapter<ProductAdapter.ItemViewHolder>() {

    private var dataset = listOf<Product>()

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.productOel)
        val card: CardView = view.findViewById(R.id.news_card)
    }

    fun submitList(list: List<Product>) {
        dataset = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.product_item, parent, false)

        return ItemViewHolder(itemLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item: Product = dataset[position]


        holder.image.setImageResource(item.detailProductImageResourceId)

        holder.card.setOnClickListener {
            holder.itemView.findNavController()
                .navigate(HomeFragmentDirections.actionHomeFragmentToDetailProductFragment(item.id))
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}
