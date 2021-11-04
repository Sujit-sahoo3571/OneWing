package com.futurebrains.onewingv01.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.futurebrains.onewingv01.R
import com.futurebrains.onewingv01.model.AllCategory
import com.futurebrains.onewingv01.model.CategoryItems

class HomeRecyclerAdapter(val context: Context?, val allCategory: ArrayList<AllCategory>) :
    RecyclerView.Adapter<HomeRecyclerAdapter.HomeViewHolder>() {

    private val list = allCategory

    class HomeViewHolder(items: View) : RecyclerView.ViewHolder(items) {
        lateinit var subTitle: TextView
        lateinit var itemRecycler: RecyclerView

        init {
            subTitle = items.findViewById(R.id.tv_home_subcategory)
            itemRecycler = items.findViewById(R.id.rv_sub_home)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(
            LayoutInflater.from(context).inflate(R.layout.home_row, parent, false)
        )
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.subTitle.text = list[position].categoryTitle
        setSubHomeItems(holder.itemRecycler, list[position].categoryItems)
    }

    override fun getItemCount(): Int = list.size

    private fun setSubHomeItems(recyclerView: RecyclerView, categoryItems: ArrayList<CategoryItems>) {
        val itemRecyclerAdapter = CategoryItemAdapter(context,
            categoryItems
        )
        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        recyclerView.adapter = itemRecyclerAdapter
    }
}