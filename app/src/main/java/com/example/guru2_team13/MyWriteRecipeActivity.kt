package com.example.guru2_team13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MyWriteRecipeActivity : AppCompatActivity() {
    lateinit var recipeButton1: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_write_recipe)

        recipeButton1 = findViewById(R.id.recipeButton1)

        recipeButton1.setOnClickListener {
            var intent = Intent(this, BoardDetail::class.java)
            startActivity(intent)
        }
    }
}