package com.example.guru2_team13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BoardDetail2 : AppCompatActivity() {
    lateinit var fab_menu: FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_detail2)

        fab_menu = findViewById(R.id.fab_menu)

        fab_menu.setOnClickListener {
            var intent = Intent(this, RecipeFragment::class.java)
            startActivity(intent)
        }
    }
}