package com.example.guru2_team13

class NewViewModel private constructor() {
    var Heart1Checked: Boolean = false
    var Heart2Checked: Boolean = false
    var Heart3Checked: Boolean = false
    var Heart4Checked: Boolean = false
    var Heart5Checked: Boolean = false
    var Heart6Checked: Boolean = false
    var Heart7Checked: Boolean = false
    var Heart8Checked: Boolean = false
    var Heart9Checked: Boolean = false
    var Heart10Checked: Boolean = false
    var Heart11Checked: Boolean = false
    var Heart12Checked: Boolean = false
    var Heart13Checked: Boolean = false
    var Heart14Checked: Boolean = false
    var Heart15Checked: Boolean = false

    companion object {
        // 싱글톤 인스턴스를 저장할 변수
        private var instance: NewViewModel? = null

        // 싱글톤 인스턴스를 반환하는 메서드
        fun getInstance(): NewViewModel {
            // 이미 인스턴스가 생성되었다면 그것을 반환하고,
            // 생성되지 않았다면 새로운 인스턴스를 생성하여 반환
            return instance ?: synchronized(this) {
                instance ?: NewViewModel().also { instance = it }
                /*
                val newInstance = RecipeViewModel()
                instance = newInstance
                newInstance*/
            }
        }
    }
}