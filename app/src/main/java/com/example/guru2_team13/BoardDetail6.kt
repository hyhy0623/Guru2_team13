package com.example.guru2_team13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox

class BoardDetail6 : AppCompatActivity() {

    val recipeViewData = RecipeViewModel.getInstance()

    lateinit var mark: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board_detail6)

        mark = findViewById<CheckBox>(R.id.mark_6)

        // 체크 박스 받아오기
        if (recipeViewData.Mark6Checked == true) {
            mark.isChecked = true
            mark.isEnabled = false
        }
        else {
            mark.isChecked = false
            mark.isEnabled = false
        }
    }
}