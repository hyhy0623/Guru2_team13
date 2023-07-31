package com.example.guru2_team13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import com.google.android.material.floatingactionbutton.FloatingActionButton

class BoardWrite : AppCompatActivity() {
    lateinit var write_button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_write)

        write_button = findViewById(R.id.write_button)

        write_button.setOnClickListener {
            Toast.makeText(this, "기능 구현 예정입니다.", Toast.LENGTH_SHORT).show()
        }
    }
}