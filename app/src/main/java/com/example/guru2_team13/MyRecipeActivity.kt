package com.example.guru2_team13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.ImageButton
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MyRecipeActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ImageAdapter

    val recipeViewData = RecipeViewModel.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_recipe)

        recyclerView = findViewById(R.id.recyclerView)

        val spanCount = 2 // 그리드 열 개수
        val layoutManager = GridLayoutManager(this, spanCount)
        recyclerView.layoutManager = layoutManager
        adapter = ImageAdapter()
        recyclerView.adapter = adapter
        // 마이 레시피 프래그먼트 받아옴
        //val fragment = supportFragmentManager.findFragmentById(R.id.fragment_recipe)

        // 변수에 저장
        //val fragmentMyrecipe = fragment?.view

        // 북마크 가져옴
        /*val mark1 = fragmentMyrecipe?.findViewById<CheckBox>(R.id.recipe_mark1)
        val mark2 = fragmentMyrecipe?.findViewById<CheckBox>(R.id.recipe_mark2)
        val mark3 = fragmentMyrecipe?.findViewById<CheckBox>(R.id.recipe_mark3)
        val mark4 = fragmentMyrecipe?.findViewById<CheckBox>(R.id.recipe_mark4)
        val mark5 = fragmentMyrecipe?.findViewById<CheckBox>(R.id.recipe_mark5)
        val mark6 = fragmentMyrecipe?.findViewById<CheckBox>(R.id.recipe_mark6)
        val mark7 = fragmentMyrecipe?.findViewById<CheckBox>(R.id.recipe_mark7)
        val mark8 = fragmentMyrecipe?.findViewById<CheckBox>(R.id.recipe_mark8)*/

        // 체크 박스 받아오기
        if (recipeViewData.Mark1Checked == true) {
            adapter.addItem(Recipe("마크정식", "recipe1"))
        }
        if (recipeViewData.Mark2Checked == true) {
            adapter.addItem(Recipe("불닭장칼국수", "recipe2"))
        }
        if (recipeViewData.Mark3Checked == true) {
            adapter.addItem(Recipe("딸기수박에이드", "recipe3"))
        }
        if (recipeViewData.Mark4Checked == true) {
            adapter.addItem(Recipe("불닭짜파게티", "recipe4"))
        }
        if (recipeViewData.Mark5Checked == true) {
            adapter.addItem(Recipe("소치콘볶이", "recipe5"))
        }
        if (recipeViewData.Mark6Checked == true) {
            adapter.addItem(Recipe("돼지게티", "recipe6"))
        }
        if (recipeViewData.Mark7Checked == true) {
            adapter.addItem(Recipe("밀키스에이드", "recipe7"))
        }
        if (recipeViewData.Mark8Checked == true) {
            adapter.addItem(Recipe("헤이즐넛바나나", "recipe8"))
        }

        // 리사이클러뷰 업데이트
        adapter.notifyDataSetChanged()
        /*
        //DB에서 체크박스 상태 정보를 불러옴
        val checkboxStateMap = loadCheckboxStateFromDB()

        recipeButton1 = findViewById(R.id.recipeButton1)
        recipeButton3 = findViewById(R.id.recipeButton3)

        recipeButton1.setOnClickListener {
            var intent = Intent(this, BoardDetail::class.java)
            startActivity(intent)
        }
        recipeButton3.setOnClickListener {
            var intent = Intent(this, BoardDetail2::class.java)
            startActivity(intent)
        }*/
    }

    override fun onResume() {
        super.onResume()
    }


    private fun loadCheckboxStateFromDB(): Map<Int, Boolean> {
        // TODO: SQLite DB에서 체크박스 상태를 불러오는 코드 작성
        // Map<Int, Boolean> 형태로 체크박스 ID와 상태를 반환합니다.
        // 예시: mapOf(1 to true, 2 to false, 3 to true, ...)
        return mapOf()
    }
}