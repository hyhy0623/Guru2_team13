package com.example.guru2_team13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.ScrollView
import android.widget.TextView

class MyNewProductActivity : AppCompatActivity() {
    lateinit var rGroup1 : RadioGroup
    lateinit var rdoAll : RadioButton
    lateinit var rdoCU : RadioButton
    lateinit var rdoGS : RadioButton
    lateinit var rdoSE : RadioButton
    lateinit var imgProduct1 : ImageView
    lateinit var productName1 : TextView
    lateinit var heartCheck1 : CheckBox
    lateinit var imgProduct2 : ImageView
    lateinit var productName2 : TextView
    lateinit var heartCheck2 : CheckBox
    lateinit var imgProduct3 : ImageView
    lateinit var productName3 : TextView
    lateinit var heartCheck3 : CheckBox

    lateinit var box1: LinearLayout
    lateinit var box2: LinearLayout
    lateinit var box3: LinearLayout
    lateinit var box4: LinearLayout
    lateinit var box5: LinearLayout
    lateinit var box6: LinearLayout
    lateinit var box7: LinearLayout
    lateinit var box8: LinearLayout
    lateinit var box9: LinearLayout
    lateinit var box10: LinearLayout
    lateinit var box11: LinearLayout
    lateinit var box12: LinearLayout
    lateinit var box13: LinearLayout
    lateinit var box14: LinearLayout
    lateinit var box15: LinearLayout
    private var on: Boolean = false

    val newViewData = NewViewModel.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_new_product)


        rGroup1 = findViewById(R.id.rGroup1)
        rdoAll = findViewById(R.id.allBtn)
        rdoCU = findViewById(R.id.CUBtn)
        rdoGS = findViewById(R.id.GSBtn)
        rdoSE = findViewById(R.id.SEBtn)
        imgProduct1 = findViewById(R.id.productImage1)
        productName1 = findViewById(R.id.productName1)
        heartCheck1 = findViewById(R.id.heartCheck1)
        imgProduct2 = findViewById(R.id.productImage2)
        productName2 = findViewById(R.id.productName2)
        heartCheck2 = findViewById(R.id.heartCheck2)
        imgProduct3 = findViewById(R.id.productImage3)
        productName3 = findViewById(R.id.productName3)
        heartCheck3 = findViewById(R.id.heartCheck3)

        box1 = findViewById(R.id.box_new1)
        box2 = findViewById(R.id.box_new2)
        box3 = findViewById(R.id.box_new3)
        box4 = findViewById(R.id.box_new4)
        box5 = findViewById(R.id.box_new5)
        box6 = findViewById(R.id.box_new6)
        box7 = findViewById(R.id.box_new7)
        box8 = findViewById(R.id.box_new8)
        box9 = findViewById(R.id.box_new9)
        box10 = findViewById(R.id.box_new10)
        box11 = findViewById(R.id.box_new11)
        box12 = findViewById(R.id.box_new12)
        box13 = findViewById(R.id.box_new13)
        box14 = findViewById(R.id.box_new14)
        box15 = findViewById(R.id.box_new15)

        if (on == false) {
            // box 뷰들을 모두 안 보이게 설정
            val allBoxes = listOf(box1, box2, box3, box4, box5, box6, box7, box8, box9, box10, box11, box12, box13, box14, box15)
            for (box in allBoxes) {
                box.visibility = View.GONE
            }
            on = true
        }
        if (newViewData.Heart1Checked == true) {
            box1.visibility = View.VISIBLE
        }
        if (newViewData.Heart1Checked == true) {
            box1.visibility = View.VISIBLE
        }
        if (newViewData.Heart2Checked == true) {
            box2.visibility = View.VISIBLE
        }
        if (newViewData.Heart3Checked == true) {
            box3.visibility = View.VISIBLE
        }
        if (newViewData.Heart4Checked == true) {
            box4.visibility = View.VISIBLE
        }
        if (newViewData.Heart5Checked == true) {
            box5.visibility = View.VISIBLE
        }
        if (newViewData.Heart6Checked == true) {
            box6.visibility = View.VISIBLE
        }
        if (newViewData.Heart7Checked == true) {
            box7.visibility = View.VISIBLE
        }
        if (newViewData.Heart8Checked == true) {
            box8.visibility = View.VISIBLE
        }
        if (newViewData.Heart9Checked == true) {
            box9.visibility = View.VISIBLE
        }
        if (newViewData.Heart10Checked == true) {
            box10.visibility = View.VISIBLE
        }
        if (newViewData.Heart11Checked == true) {
            box11.visibility = View.VISIBLE
        }
        if (newViewData.Heart12Checked == true) {
            box12.visibility = View.VISIBLE
        }
        if (newViewData.Heart13Checked == true) {
            box13.visibility = View.VISIBLE
        }
        if (newViewData.Heart14Checked == true) {
            box14.visibility = View.VISIBLE
        }
        if (newViewData.Heart15Checked == true) {
            box15.visibility = View.VISIBLE
        }

        rGroup1.setOnCheckedChangeListener { radioGroup, i ->
            when (i) {
                R.id.allBtn -> {
                    // 스크롤 맨 위로 이동
                    findViewById<ScrollView>(R.id.scrollView_new).smoothScrollTo(0, 0)

                    if (newViewData.Heart1Checked == true) {
                        box1.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart2Checked == true) {
                        box2.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart3Checked == true) {
                        box3.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart4Checked == true) {
                        box4.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart5Checked == true) {
                        box5.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart6Checked == true) {
                        box6.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart7Checked == true) {
                        box7.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart8Checked == true) {
                        box8.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart9Checked == true) {
                        box9.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart10Checked == true) {
                        box10.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart11Checked == true) {
                        box11.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart12Checked == true) {
                        box12.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart13Checked == true) {
                        box13.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart14Checked == true) {
                        box14.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart15Checked == true) {
                        box15.visibility = View.VISIBLE
                    }
                }

                R.id.CUBtn -> {
                    findViewById<ScrollView>(R.id.scrollView_new).smoothScrollTo(0, 0)

                    if (newViewData.Heart1Checked == true) {
                        box1.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart4Checked == true) {
                        box4.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart7Checked == true) {
                        box7.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart10Checked == true) {
                        box10.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart13Checked == true) {
                        box13.visibility = View.VISIBLE
                    }
                    box2.visibility = View.GONE
                    box3.visibility = View.GONE
                    box5.visibility = View.GONE
                    box6.visibility = View.GONE
                    box8.visibility = View.GONE
                    box9.visibility = View.GONE
                    box11.visibility = View.GONE
                    box12.visibility = View.GONE
                    box14.visibility = View.GONE
                    box15.visibility = View.GONE
                }

                R.id.GSBtn -> {
                    findViewById<ScrollView>(R.id.scrollView_new).smoothScrollTo(0, 0)

                    if (newViewData.Heart2Checked == true) {
                        box2.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart5Checked == true) {
                        box5.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart8Checked == true) {
                        box8.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart11Checked == true) {
                        box11.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart14Checked == true) {
                        box14.visibility = View.VISIBLE
                    }
                    box1.visibility = View.GONE
                    box3.visibility = View.GONE
                    box4.visibility = View.GONE
                    box6.visibility = View.GONE
                    box7.visibility = View.GONE
                    box9.visibility = View.GONE
                    box10.visibility = View.GONE
                    box12.visibility = View.GONE
                    box13.visibility = View.GONE
                    box15.visibility = View.GONE
                }

                R.id.SEBtn -> {
                    findViewById<ScrollView>(R.id.scrollView_new).smoothScrollTo(0, 0)

                    if (newViewData.Heart3Checked == true) {
                        box3.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart6Checked == true) {
                        box6.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart9Checked == true) {
                        box9.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart12Checked == true) {
                        box12.visibility = View.VISIBLE
                    }
                    if (newViewData.Heart15Checked == true) {
                        box15.visibility = View.VISIBLE
                    }
                    box1.visibility = View.GONE
                    box2.visibility = View.GONE
                    box4.visibility = View.GONE
                    box5.visibility = View.GONE
                    box7.visibility = View.GONE
                    box8.visibility = View.GONE
                    box10.visibility = View.GONE
                    box11.visibility = View.GONE
                    box13.visibility = View.GONE
                    box14.visibility = View.GONE
                }
            }
        }

    /*
        // 찜 버튼 데이터 받아오기
        val buttonDataList = intent.getParcelableArrayListExtra<ButtonData>("button_data_list")


        if (buttonDataList != null) {
            box1.visibility = View.GONE
            box2.visibility = View.GONE
            box3.visibility = View.GONE
            box4.visibility = View.GONE
            box5.visibility = View.GONE
            box6.visibility = View.GONE
            box7.visibility = View.GONE
            box8.visibility = View.GONE
            box9.visibility = View.GONE
            box10.visibility = View.GONE
            box11.visibility = View.GONE
            box12.visibility = View.GONE
            box13.visibility = View.GONE
            box14.visibility = View.GONE
            box15.visibility = View.GONE
            for (buttonData in buttonDataList) {
                if (buttonData.isChecked) {
                    val buttonID = buttonData.buttonId
                     when  (buttonID) {
                         1 -> {
                            box1.visibility = View.VISIBLE
                         }
                         2 -> {
                             box2.visibility = View.VISIBLE
                         }
                         3 -> {
                             box3.visibility = View.VISIBLE
                         }
                         4 -> {
                             box4.visibility = View.VISIBLE
                         }
                         5 -> {
                             box5.visibility = View.VISIBLE
                         }
                         6 -> {
                             box6.visibility = View.VISIBLE
                         }
                         7 -> {
                             box7.visibility = View.VISIBLE
                         }
                         8 -> {
                             box8.visibility = View.VISIBLE
                         }
                         9 -> {
                             box9.visibility = View.VISIBLE
                         }
                         10 -> {
                             box10.visibility = View.VISIBLE
                         }
                         11 -> {
                             box11.visibility = View.VISIBLE
                         }
                         12 -> {
                             box12.visibility = View.VISIBLE
                         }
                         13 -> {
                             box13.visibility = View.VISIBLE
                         }
                         14 -> {
                             box14.visibility = View.VISIBLE
                         }
                         15 -> {
                             box15.visibility = View.VISIBLE
                         }
                     }

                }
            }
        }
        else {
            box1.visibility = View.GONE
            box2.visibility = View.GONE
            box3.visibility = View.GONE
            box4.visibility = View.GONE
            box5.visibility = View.GONE
            box6.visibility = View.GONE
            box7.visibility = View.GONE
            box8.visibility = View.GONE
            box9.visibility = View.GONE
            box10.visibility = View.GONE
            box11.visibility = View.GONE
            box12.visibility = View.GONE
            box13.visibility = View.GONE
            box14.visibility = View.GONE
            box15.visibility = View.GONE
        }*/

        /*rGroup1.setOnCheckedChangeListener { radioGroup, i ->
            when (i) {
                R.id.allBtn -> {
                    imgProduct1.setImageResource(R.drawable.cu4)
                    productName1.text = "#CU #더블초코맘모스빵 #고대"
                    imgProduct2.setImageResource(R.drawable.gs1)
                    productName2.text = "#GS #행운약과라떼 #유어스"
                    imgProduct3.setImageResource(R.drawable.gs3)
                    productName3.text = "#GS #솔티카라멜휘낭시에 #브레디크"
                }
                R.id.CUBtn -> {
                    imgProduct1.setImageResource(R.drawable.cu4)
                    productName1.text = "#CU #더블초코맘모스빵 #고대"
                }

                R.id.GSBtn -> {
                    imgProduct1.setImageResource(R.drawable.gs1)
                    productName1.text = "#GS #행운약과라떼 #유어스"
                    imgProduct2.setImageResource(R.drawable.gs3)
                    productName2.text = "#GS #솔티카라멜휘낭시에 #브레디크"
                }

                R.id.SEBtn -> {
                }
            }*/

    }
}