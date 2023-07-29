package com.example.guru2_team13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MyRecipeActivity : AppCompatActivity() {
    lateinit var recipeButton1: ImageButton
    lateinit var recipeButton3: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_recipe)

        recipeButton1 = findViewById(R.id.recipeButton1)
        recipeButton3 = findViewById(R.id.recipeButton3)

        recipeButton1.setOnClickListener {
            var intent = Intent(this, BoardDetail::class.java)
            startActivity(intent)
        }
        recipeButton3.setOnClickListener {
            var intent = Intent(this, BoardDetail2::class.java)
            startActivity(intent)
        }
    }
}