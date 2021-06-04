package com.decagonhq.clads.ui.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.decagonhq.clads.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        /*Move to the home page after showing splash screen for X milliseconds*/
//        Handler().postDelayed(
//            {
//                val intent = Intent(this, MainActivity::class.java)
//                startActivity(intent)
//                /*Use finish to disable the page when back button is pressed from homePage*/
//                finish()
//            },
//            1000
//        )
        GlobalScope.launch {
            delay(1000L)
            withContext(Dispatchers.Main) {
                val intent = Intent(this@SplashScreenActivity, MainActivity::class.java)
                startActivity(intent)
            }
            /*Use finish to disable the page when back button is pressed from homePage*/
            finish()
        }
    }
}
