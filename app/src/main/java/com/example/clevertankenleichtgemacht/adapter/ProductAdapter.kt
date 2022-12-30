package com.example.clevertankenleichtgemacht.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.net.toUri
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.RoundedCornersTransformation
import com.example.clevertankenleichtgemacht.HomeFragmentDirections
import com.example.clevertankenleichtgemacht.R
import com.example.clevertankenleichtgemacht.data.ProductKatalog

class ProductAdapter(emptyList: List<Any>) : RecyclerView.Adapter<ProductAdapter.ItemViewHolder>() {

    private var dataset = listOf<ProductKatalog>()

    // der ViewHolder weiß welche Teile des Layouts beim Recycling angepasst werden
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val imageView = view.findViewById<ImageView>(R.id.list_image)

        val card: ConstraintLayout = view.findViewById(R.id.card)


        val textView1: TextView = view.findViewById(R.id.tv1)

        val textView7: TextView = view.findViewById(R.id.tv7)



    }

    fun submitList(list: List<ProductKatalog>) {
        dataset = list
        notifyDataSetChanged()
    }

    // hier werden neue ViewHolder erstellt
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // das itemLayout wird gebaut
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.product_item, parent, false)

        // und in einem ViewHolder zurückgegeben
        return ItemViewHolder(adapterLayout)
    }

    // hier findet der Recyclingprozess statt
    // die vom ViewHolder bereitgestellten Parameter werden verändert
    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item: ProductKatalog = dataset[position]

        holder.card.setOnClickListener {
            holder.itemView.findNavController()
                .navigate(HomeFragmentDirections.actionHomeFragmentToDetailProductFragment(item.id))
        }


        holder.textView7.text = "Nummer: " + item.id
        holder.textView1.text = "Name : " + item.name
        //  holder.textView4.text = "Haarlänge: " + item.coat_lenght
        //   holder.textView5.text = "Fellfarbe: " + item.coat_color
        // holder.textView6.text = "Höhe: " + item.height
        // holder.textView8.text = "Beschreibung: " + item.detail_text

        val imgUri = item.image.toUri().buildUpon().scheme("https").build()

        holder.imageView.load(imgUri) {
            error(R.drawable.ic_round_broken_image_24)
            transformations(RoundedCornersTransformation(10f))
        }


    }

    // damit der LayoutManager weiß wie lang die Liste ist
    override fun getItemCount(): Int {
        return dataset.size
    }



}