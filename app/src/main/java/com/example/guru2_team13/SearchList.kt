package com.example.guru2_team13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ListView
import android.widget.Toast

data class Item(val id: Int, val name: String, val description: String)

val dataList = mutableListOf<Item>()

fun searchItems(query: String): List<Item> {
    return dataList.filter { item ->
        item.name.contains(query, ignoreCase = true)
    }
}

class SearchList : AppCompatActivity() {
    private lateinit var dataList: List<Item>
    private var filteredDataList: MutableList<Item> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_list)

        dataList = mutableListOf(
            Item(1, "마크정식", "마크정식 존맛탱구리"),
            Item(2, "불닭장칼국수", "불닭장칼국수 만드는 법"),
            Item(3, "딸기수박에이드", "딸기수박에이드"),
            Item(4, "불닭짜파게티", "짜파구리보다 더 맛있는 불닭짜파게티"),
            Item(5, "소치콘볶이", "소치콘볶이 뭔지 아는 사람"),
            Item(6, "돼지게티", "돼지게티 먹고 돼지되자"),
            Item(7, "밀키스에이드", "밀키스에이드 내가 먹어봄 욤뇸"),
            Item(8, "헤이즐넛바나나", "헤이즐넛바나나")
        )

        // 초기에는 필터링되지 않은 전체 데이터를 보여줌
        filteredDataList.addAll(dataList)

        // 검색 버튼 클릭 시 동작
        val searchButton: ImageButton = findViewById(R.id.searchButton)
        val searchEditText: EditText = findViewById(R.id.searchEditText)
        val listView: ListView = findViewById(R.id.listView)

        // EditText의 텍스트 변경 이벤트를 감지하여 리스트 뷰 업데이트
        searchEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                val searchQuery = s.toString().trim()

                // 검색어가 비어있으면 모든 데이터를 보여줌
                if (searchQuery.isEmpty()) {
                    filteredDataList.clear()
                    filteredDataList.addAll(dataList)
                } else {
                    // 검색어가 비어있지 않으면 해당 문자열로 데이터 필터링
                    filteredDataList.clear()
                    for (item in dataList) {
                        if (item.name.contains(searchQuery, ignoreCase = true)) {
                            filteredDataList.add(item)
                        }
                    }
                }
                // 리스트 뷰 업데이트
                val adapter = ArrayAdapter(
                    this@SearchList,
                    android.R.layout.simple_list_item_1,
                    filteredDataList.map { it.name }
                )
                listView.adapter = adapter
            }
        })

        // 리스트 뷰 아이템 클릭 이벤트 처리
        listView.setOnItemClickListener { parent, view, position, id ->
            // 클릭된 아이템의 데이터 가져오기
            val selectedItem = filteredDataList[position]

            // 특정 아이템 ID에 따라 다른 액티비티로 이동
            when (selectedItem.id) {
                1 -> {
                    val intent = Intent(this, BoardDetail::class.java)
                    startActivity(intent)
                }

                2 -> {
                    val intent = Intent(this, BoardDetail2::class.java)
                    startActivity(intent)
                }

                3 -> {
                    val intent = Intent(this, BoardDetail3::class.java)
                    startActivity(intent)
                }

                4 -> {
                    val intent = Intent(this, BoardDetail4::class.java)
                    startActivity(intent)
                }
                5 -> {
                    val intent = Intent(this, BoardDetail5::class.java)
                    startActivity(intent)
                }

                6 -> {
                    val intent = Intent(this, BoardDetail6::class.java)
                    startActivity(intent)
                }

                7 -> {
                    val intent = Intent(this, BoardDetail7::class.java)
                    startActivity(intent)
                }

                8 -> {
                    val intent = Intent(this, BoardDetail8::class.java)
                    startActivity(intent)
                }

                else -> {
                    // 처리하지 않은 다른 아이템 ID에 대한 예외 처리
                    Toast.makeText(this, "없는 검색어 입니다.", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}