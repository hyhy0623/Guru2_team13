package com.example.guru2_team13

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    lateinit var btnLogin: ImageButton
    lateinit var editTextId: EditText
    lateinit var editTextPassword: EditText
    lateinit var btnRegister: Button
    var DB:DBHelper?=null
    /*val fragmentManager = supportFragmentManager
    lateinit var transaction: FragmentTransaction*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin = findViewById(R.id.btnLogin)
        editTextId = findViewById(R.id.editTextId)
        editTextPassword = findViewById(R.id.editTextPassword)
        btnRegister = findViewById(R.id.btnRegister)
        DB = DBHelper(this)

        /*transaction = fragmentManager.beginTransaction()
        transaction.add(R.id.fl_container, MypageFragment())
        transaction.commit()*/
        /*
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)*/

        val mypageFragment = MypageFragment()

        // 로그인 버튼 클릭
        btnLogin!!.setOnClickListener {
            val user = editTextId!!.text.toString()
            val pass = editTextPassword!!.text.toString()
            /*
            transaction = fragmentManager.beginTransaction()
            val bundle = Bundle()*/

            // 빈칸 제출시 Toast
            if (user == "" || pass == "") Toast.makeText(
                this@MainActivity,
                "아이디와 비밀번호를 모두 입력해주세요.",
                Toast.LENGTH_SHORT
            ).show()
            else {
                val checkUserpass = DB!!.checkUserpass(user, pass)
                // id 와 password 일치시
                if (checkUserpass == true) {
                    Toast.makeText(this@MainActivity, "로그인 되었습니다.", Toast.LENGTH_SHORT).show()

                    /*val nextIntent = Intent(this, HomeActivity::class.java)
                    nextIntent.putExtra("id", user)
                    startActivity(nextIntent)*/
                    /*val mypageFragment = MypageFragment()
                    val bundle = Bundle()
                    bundle.putString("id", user)
                    mypageFragment.arguments = bundle*/
                    /*
                    bundle.putString("id", user)
                    transaction.replace(R.id.fl_container, MypageFragment().apply { arguments = bundle })
                    transaction.commit()*/

                    /*
                    val bundle = Bundle()
                    bundle.putString("id", user)

                    mypageFragment.arguments = bundle
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.add(R.id.fl_container, mypageFragment)
                    transaction.commit()*/

                    val intent = Intent(this, HomeActivity::class.java)
                    intent.putExtra("id", user)
                    startActivity(intent)
                }
                else {
                    Toast.makeText(this@MainActivity, "회원정보가 존재하지 않습니다.", Toast.LENGTH_SHORT).show()
                }
            }
        }
        // 회원가입 버튼 클릭시
        btnRegister.setOnClickListener {
            val loginIntent = Intent(this@MainActivity, RegisterActivity::class.java)
            startActivity(loginIntent)
        }
    }
}