package com.example.guru2_team13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
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

        rGroup1.setOnCheckedChangeListener { radioGroup, i ->
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
            }
        }
    }
}