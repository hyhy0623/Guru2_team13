package com.example.guru2_team13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import me.relex.circleindicator.CircleIndicator3

class StartActivity : AppCompatActivity() {
    lateinit var startButton: Button
    lateinit var viewPagerStart: ViewPager2
    lateinit var indicatorStart: CircleIndicator3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        /*
        startButton = findViewById(R.id.btnStart)

        startButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }*/

        viewPagerStart = findViewById(R.id.viewPager_start) // Get ViewPager2 view
        viewPagerStart.adapter = StartViewPagerAdapter(this) // Attach the adapter with our ViewPagerAdapter passing the host activity

        indicatorStart = findViewById(R.id.indicator_start)
        indicatorStart.setViewPager(viewPagerStart)

    }
}