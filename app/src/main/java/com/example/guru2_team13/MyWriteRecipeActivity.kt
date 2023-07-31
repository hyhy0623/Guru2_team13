package com.example.guru2_team13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.ImageButton

class MyWriteRecipeActivity : AppCompatActivity() {
    lateinit var recipeButton1: ImageButton

    val recipeViewData = RecipeViewModel.getInstance()
    lateinit var m_1: CheckBox
    lateinit var m_2: CheckBox
    lateinit var m_3: CheckBox
    lateinit var m_4: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_write_recipe)

        recipeButton1 = findViewById(R.id.recipeButton1)

        m_1 = findViewById(R.id.m_1)
        m_2 =findViewById(R.id.m_2)
        m_3 = findViewById(R.id.m_3)
        m_4 = findViewById(R.id.m_4)

        recipeButton1.setOnClickListener {
            var intent = Intent(this, BoardDetail::class.java)
            startActivity(intent)
        }

        // 체크 박스 받아오기
        if (recipeViewData.Mark1Checked == true) {
            m_1.isChecked = true
            m_1.isEnabled = false
        }
        else {
            m_1.isChecked = false
            m_1.isEnabled = false
        }
        if (recipeViewData.Mark2Checked == true) {
            m_2.isChecked = true
            m_2.isEnabled = false
        }
        else {
            m_2.isChecked = false
            m_2.isEnabled = false
        }
        if (recipeViewData.Mark7Checked == true) {
            m_3.isChecked = true
            m_3.isEnabled = false
        }
        else {
            m_3.isChecked = false
            m_3.isEnabled = false
        }
        if (recipeViewData.Mark8Checked == true) {
            m_4.isChecked = true
            m_4.isEnabled = false
        }
        else {
            m_4.isChecked = false
            m_4.isEnabled = false
        }
    }
}