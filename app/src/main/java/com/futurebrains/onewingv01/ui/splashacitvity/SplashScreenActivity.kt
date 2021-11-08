package com.futurebrains.onewingv01.ui.splashacitvity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.futurebrains.onewingv01.MainActivity
import com.futurebrains.onewingv01.R
import com.futurebrains.onewingv01.databinding.ActivitySplashScreenBinding

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {

    lateinit var binding: ActivitySplashScreenBinding
    val SPLASH_TIMER : Long= 5000
//    lateinit var topanimation : Animation
//    lateinit var bottomanimation : Animation


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

       val topanimation = AnimationUtils.loadAnimation(this, R.anim.top_animation)
       val bottomanimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        binding.splashImage.animation = topanimation
        binding.spalshDesc.animation = bottomanimation
        binding.splashTitle.animation = bottomanimation

        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIMER)

    }
}