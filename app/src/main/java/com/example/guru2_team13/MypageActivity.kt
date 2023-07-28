package com.example.guru2_team13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class MypageActivity : AppCompatActivity() {
    /*lateinit var textNick : TextView
    lateinit var btn1_Myp: ImageButton
    lateinit var btn2_Myp: ImageButton
    lateinit var btn3_Myp: ImageButton
    lateinit var btnLogout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mypage)

        textNick = findViewById(R.id.textNick_Myp)
        btn1_Myp = findViewById(R.id.btn1_Myp)
        btn2_Myp = findViewById(R.id.btn2_Myp)
        btn3_Myp = findViewById(R.id.btn3_Myp)
        btnLogout= findViewById(R.id.btnLogout_Myp)

        val id = intent.getStringExtra("id")

        val dbHelper = DBHelper(this)
        val db = dbHelper.readableDatabase
        val cursor = db.rawQuery("SELECT nick FROM users WHERE id=?", arrayOf(id))

        if (cursor.moveToFirst()) {
            var index = cursor.getColumnIndex("nick")
            val nickname = cursor.getString(index)
            textNick.text = "$nickname"
        }

        btn1_Myp.setOnClickListener {
            val intent = Intent(applicationContext, MyNewProductActivity::class.java)
            startActivity(intent)
        }

        btn2_Myp.setOnClickListener {
            val intent = Intent(applicationContext, MyRecipeActivity::class.java)
            startActivity(intent)
        }

        btn3_Myp.setOnClickListener {
            val intent = Intent(applicationContext, MyWriteRecipeActivity::class.java)
            startActivity(intent)
        }

        btnLogout.setOnClickListener {
            Toast.makeText(this@MypageActivity, "로그아웃 되었습니다.", Toast.LENGTH_SHORT).show()
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }*/
}