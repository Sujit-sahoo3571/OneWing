package com.futurebrains.onewingv01.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.futurebrains.onewingv01.R
import com.futurebrains.onewingv01.model.CategoryItems

class CategoryItemAdapter(private  val contex: Context? , private val categoryItems: List<CategoryItems>): RecyclerView.Adapter<CategoryItemAdapter.CategoryViewHolder>() {
    private val list = categoryItems

    class CategoryViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        lateinit var itemImage : ImageView
        init {
            itemImage = itemView.findViewById(R.id.iv_item_images)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
       return CategoryViewHolder(LayoutInflater.from(contex).inflate(R.layout.cart_item, parent, false ))
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
      holder.itemImage.setImageResource(list[position].imageUrl)
    }

    override fun getItemCount(): Int = list.size
}