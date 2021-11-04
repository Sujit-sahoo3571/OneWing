package com.futurebrains.onewingv01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.futurebrains.onewingv01.ui.fragment.HomeFragment
import com.futurebrains.onewingv01.ui.fragment.LikeFragment
import com.futurebrains.onewingv01.ui.fragment.SearchFragment
import com.futurebrains.onewingv01.ui.fragment.ShopFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val homeFragment  = HomeFragment()
    private val searchFragment = SearchFragment()
    private val  likeFragment = LikeFragment()
    private val shopFragment = ShopFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(homeFragment)

        bottom_navigation.setOnNavigationItemSelectedListener {
            item ->
            when (item.itemId){
                R.id.nav_home -> replaceFragment(homeFragment)
                R.id.nav_search -> replaceFragment(searchFragment)
                R.id.nav_like -> replaceFragment(likeFragment)
                R.id.nav_shop -> replaceFragment(shopFragment)
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.commit()
    }
}