package com.example.guru2_team13

import androidx.lifecycle.ViewModel

class RecipeViewModel private constructor() {
    var Mark1Checked: Boolean = false
    var Mark2Checked: Boolean = false
    var Mark3Checked: Boolean = false
    var Mark4Checked: Boolean = false
    var Mark5Checked: Boolean = false
    var Mark6Checked: Boolean = false
    var Mark7Checked: Boolean = false
    var Mark8Checked: Boolean = false

    companion object {
        // 싱글톤 인스턴스를 저장할 변수
        private var instance: RecipeViewModel? = null

        // 싱글톤 인스턴스를 반환하는 메서드
        fun getInstance(): RecipeViewModel {
            // 이미 인스턴스가 생성되었다면 그것을 반환하고,
            // 생성되지 않았다면 새로운 인스턴스를 생성하여 반환
            return instance ?: synchronized(this) {
                instance ?: RecipeViewModel().also { instance = it }
                /*
                val newInstance = RecipeViewModel()
                instance = newInstance
                newInstance*/
            }
        }
    }
}