package com.example.guru2_team13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BoardList : AppCompatActivity() {
    lateinit var fab_write: FloatingActionButton
    lateinit var recipeButton1: ImageButton
    lateinit var recipeButton3: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_list)

        fab_write = findViewById(R.id.fab_write)
        recipeButton1 = findViewById(R.id.recipeButton1)
        recipeButton3 = findViewById(R.id.recipeButton3)

        fab_write.setOnClickListener {
            var intent = Intent(this, BoardWrite::class.java)
            startActivity(intent)
        }
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