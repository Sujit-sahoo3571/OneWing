package com.futurebrains.onewingv01.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.futurebrains.onewingv01.R
import com.futurebrains.onewingv01.model.CategoryItems

class CategoryItemAdapter(
    private val contex: Context?,
    private val categoryItems: ArrayList<CategoryItems>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val list = categoryItems

    companion object {
        const val VIEW_TYPE_ONE = 1
        const val VIEW_TYPE_TWO = 2
    }

    inner class View1ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var itemImage: ImageView
        lateinit var itemName: TextView
        lateinit var itemPrice: TextView

        init {
            itemImage = itemView.findViewById(R.id.iv_item_image1)
            itemName = itemView.findViewById(R.id.tv_item_name1)
            itemPrice = itemView.findViewById(R.id.tv_item_price1)
        }

        fun bind(position: Int) {
            val recyclerViewModel = list[position]
            itemName.text = recyclerViewModel.itemName
            itemPrice.text = recyclerViewModel.itemPrice.toString()
            itemImage.setImageResource(recyclerViewModel.imageUrl)

        }

    }

    inner class View2ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var itemImage: ImageView
        lateinit var itemName: TextView
        lateinit var itemPrice: TextView

        init {
            itemImage = itemView.findViewById(R.id.iv_item_image2)
            itemName = itemView.findViewById(R.id.tv_item_name2)
            itemPrice = itemView.findViewById(R.id.tv_item_price2)
        }

        fun bind(position: Int) {
            val recyclerViewModel = list[position]
            itemName.text = recyclerViewModel.itemName
            itemPrice.text = recyclerViewModel.itemPrice.toString()
            itemImage.setImageResource(recyclerViewModel.imageUrl)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == VIEW_TYPE_ONE) {
            return View1ViewHolder(
                LayoutInflater.from(contex).inflate(R.layout.cart_item, parent, false)
            )
        }
        return View2ViewHolder(
            LayoutInflater.from(contex).inflate(R.layout.cart_item2, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        if (list[position].viewType == VIEW_TYPE_ONE) {
            (holder as View1ViewHolder).bind(position)
        } else (holder as View2ViewHolder).bind(position)
    }

    override fun getItemCount(): Int = list.size

    override fun getItemViewType(position: Int): Int {
        return  list[position].viewType
    }
}