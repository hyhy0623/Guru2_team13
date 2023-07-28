package com.example.guru2_team13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    lateinit var btnMypage : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // 하단 탭이 눌렸을 때 화면을 전환하기 위해선 이벤트 처리하기 위해 BottomNavigationView 객체 생성
        var bnv_main = findViewById(R.id.bnv_main) as BottomNavigationView

        bnv_main.itemIconTintList = null

        val id = intent.getStringExtra("id")

        //supportFragmentManager.beginTransaction().replace(R.id.fl_container, mypageFragment).commit()

        // OnNavigationItemSelectedListener를 통해 탭 아이템 선택 시 이벤트를 처리
        // main_menu_bottom.xml 에서 설정했던 각 아이템들의 id를 통해 알맞은 프래그먼트로 변경하게 한다.
        bnv_main.run { setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.home_bar -> {
                    // 다른 프래그먼트 화면으로 이동하는 기능
                    val homeFragment = HomeFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fl_container, homeFragment).commit()
                }
                R.id.new_bar -> {
                    val newFragment = NewFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fl_container, newFragment).commit()
                }
                R.id.recipe_bar -> {
                    val recipeFragment = RecipeFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fl_container, recipeFragment).commit()
                }
                R.id.mypage_bar -> {
                    val mypageFragment = MypageFragment()

                    val bundle = Bundle()
                    bundle.putString("id", id)
                    mypageFragment.arguments = bundle

                    supportFragmentManager.beginTransaction().replace(R.id.fl_container, mypageFragment).commit()

                }
            }
            true
        }
            selectedItemId = R.id.home_bar
        }
        /*btnMypage = findViewById(R.id.btnMypage_home)

        btnMypage.setOnClickListener {
            val intent = Intent(applicationContext, MypageActivity::class.java)
            startActivity(intent)
        }*/
    }
}