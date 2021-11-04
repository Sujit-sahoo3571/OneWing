package com.futurebrains.onewingv01.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.futurebrains.onewingv01.R
import com.futurebrains.onewingv01.adapter.HomeRecyclerAdapter
import com.futurebrains.onewingv01.model.AllCategory
import com.futurebrains.onewingv01.model.CategoryItems

class HomeFragment : Fragment() {

    private lateinit var homeRecyclerView : RecyclerView
    private lateinit var homeRecyclerAdapter: HomeRecyclerAdapter
    val allCategory: ArrayList<AllCategory> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val categoryItemList : ArrayList<CategoryItems> = ArrayList()
        categoryItemList.add(CategoryItems(1, R.drawable.food1))
        categoryItemList.add(CategoryItems(1, R.drawable.food1))
        categoryItemList.add(CategoryItems(1, R.drawable.food1))
        categoryItemList.add(CategoryItems(1, R.drawable.food1))
        categoryItemList.add(CategoryItems(1, R.drawable.food1))
        categoryItemList.add(CategoryItems(1, R.drawable.food1))


        val categoryItemList1 : ArrayList<CategoryItems> = ArrayList()
        categoryItemList1.add(CategoryItems(2, R.drawable.food2))
        categoryItemList1.add(CategoryItems(2, R.drawable.food2))
        categoryItemList1.add(CategoryItems(2, R.drawable.food2))
        categoryItemList1.add(CategoryItems(2, R.drawable.food2))
        categoryItemList1.add(CategoryItems(2, R.drawable.food2))
        categoryItemList1.add(CategoryItems(2, R.drawable.food2))


        val categoryItemList2 : ArrayList<CategoryItems> = ArrayList()
        categoryItemList2.add(CategoryItems(3, R.drawable.food3))
        categoryItemList2.add(CategoryItems(3, R.drawable.food3))
        categoryItemList2.add(CategoryItems(3, R.drawable.food3))
        categoryItemList2.add(CategoryItems(3, R.drawable.food3))
        categoryItemList2.add(CategoryItems(3, R.drawable.food3))
        categoryItemList2.add(CategoryItems(3, R.drawable.food3))


        val categoryItemList3 : ArrayList<CategoryItems> = ArrayList()
        categoryItemList3.add(CategoryItems(4, R.drawable.food4))
        categoryItemList3.add(CategoryItems(4, R.drawable.food4))
        categoryItemList3.add(CategoryItems(4, R.drawable.food4))
        categoryItemList3.add(CategoryItems(4, R.drawable.food4))
        categoryItemList3.add(CategoryItems(4, R.drawable.food4))
        categoryItemList3.add(CategoryItems(4, R.drawable.food4))

        allCategory.add(AllCategory("shopping Now ", categoryItemList))
        allCategory.add(AllCategory("shopping Now ", categoryItemList1))
        allCategory.add(AllCategory("shopping Now ", categoryItemList2))
        allCategory.add(AllCategory("shopping Now ", categoryItemList3))
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home, container, false)

        homeRecyclerView = view.findViewById(R.id.rv_main_home)
        val linearlayout = LinearLayoutManager(context)
        homeRecyclerView.layoutManager = linearlayout
        homeRecyclerAdapter = HomeRecyclerAdapter(context, allCategory  )
        homeRecyclerView.adapter = homeRecyclerAdapter

        return  view
    }



}