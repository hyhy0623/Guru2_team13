package com.example.guru2_team13

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [NewFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NewFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

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
    lateinit var imgProduct4 : ImageView
    lateinit var productName4 : TextView
    lateinit var heartCheck4 : CheckBox
    lateinit var imgProduct5 : ImageView
    lateinit var productName5 : TextView
    lateinit var heartCheck5 : CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_new, container, false)

        rGroup1 = view.findViewById(R.id.rGroup1)
        rdoAll = view.findViewById(R.id.allBtn)
        rdoCU = view.findViewById(R.id.CUBtn)
        rdoGS = view.findViewById(R.id.GSBtn)
        rdoSE = view.findViewById(R.id.SEBtn)
        imgProduct1 = view.findViewById(R.id.productImage1)
        productName1 = view.findViewById(R.id.productName1)
        heartCheck1 = view.findViewById(R.id.heartCheck1)
        imgProduct2 = view.findViewById(R.id.productImage2)
        productName2 = view.findViewById(R.id.productName2)
        heartCheck2 = view.findViewById(R.id.heartCheck2)
        imgProduct3 = view.findViewById(R.id.productImage3)
        productName3 = view.findViewById(R.id.productName3)
        heartCheck3 = view.findViewById(R.id.heartCheck3)
        imgProduct4 = view.findViewById(R.id.productImage4)
        productName4 = view.findViewById(R.id.productName4)
        heartCheck4 = view.findViewById(R.id.heartCheck4)
        imgProduct5 = view.findViewById(R.id.productImage5)
        productName5 = view.findViewById(R.id.productName5)
        heartCheck5 = view.findViewById(R.id.heartCheck5)

        rGroup1.setOnCheckedChangeListener { radioGroup, i ->
            when (i) {
                R.id.allBtn -> {
                    heartCheck1.isChecked = false
                    heartCheck2.isChecked = false
                    heartCheck3.isChecked = false
                    heartCheck4.isChecked = false
                    heartCheck5.isChecked = false
                    imgProduct1.setImageResource(R.drawable.cu1)
                    productName1.text = "#CU #뉴불어묵삼각 #3XL"
                    imgProduct2.setImageResource(R.drawable.gs1)
                    productName2.text = "#GS #행운약과라떼 #유어스"
                    imgProduct3.setImageResource(R.drawable.se3)
                    productName3.text = "#세븐일레븐 #멸치아몬드 #바프"
                    imgProduct4.setImageResource(R.drawable.gs3)
                    productName4.text = "#GS #솔티카라멜휘낭시에 #브레디크"
                    imgProduct5.setImageResource(R.drawable.cu4)
                    productName5.text = "#CU #더블초코맘모스빵 #고대"
                }
                R.id.CUBtn -> {
                    heartCheck1.isChecked = false
                    heartCheck2.isChecked = false
                    heartCheck3.isChecked = false
                    heartCheck4.isChecked = false
                    heartCheck5.isChecked = false
                    imgProduct1.setImageResource(R.drawable.cu1)
                    productName1.text = "#CU #뉴불어묵삼각 #3XL"
                    imgProduct2.setImageResource(R.drawable.cu2)
                    productName2.text = "#CU #포슬감자샌드 #꽃카"
                    imgProduct3.setImageResource(R.drawable.cu3)
                    productName3.text = "#CU #청양파스타 #이열치열"
                    imgProduct4.setImageResource(R.drawable.cu4)
                    productName4.text = "#CU #더블초코맘모스빵 #고대"
                    imgProduct5.setImageResource(R.drawable.cu5)
                    productName5.text = "#CU #통통소시지모닝머핀 #KIA"
                }

                R.id.GSBtn -> {
                    heartCheck1.isChecked = false
                    heartCheck2.isChecked = false
                    heartCheck3.isChecked = false
                    heartCheck4.isChecked = false
                    heartCheck5.isChecked = false
                    imgProduct1.setImageResource(R.drawable.gs1)
                    productName1.text = "#GS #행운약과라떼 #유어스"
                    imgProduct2.setImageResource(R.drawable.gs2)
                    productName2.text = "#GS #하이면순두부짬뽕 #삼립"
                    imgProduct3.setImageResource(R.drawable.gs3)
                    productName3.text = "#GS #솔티카라멜휘낭시에 #브레디크"
                    imgProduct4.setImageResource(R.drawable.gs4)
                    productName4.text = "#GS #생크림도넛(레몬크림) #매일우유"
                    imgProduct5.setImageResource(R.drawable.gs5)
                    productName5.text = "#GS #양념치킨도시락 #페리카나"
                }

                R.id.SEBtn -> {
                    heartCheck1.isChecked = false
                    heartCheck2.isChecked = false
                    heartCheck3.isChecked = false
                    heartCheck4.isChecked = false
                    heartCheck5.isChecked = false
                    imgProduct1.setImageResource(R.drawable.se1)
                    productName1.text = "#세븐일레븐 #숯불후랑크 #씨제이"
                    imgProduct2.setImageResource(R.drawable.se2)
                    productName2.text = "#세븐일레븐 #더미식메밀비빔 #하림"
                    imgProduct3.setImageResource(R.drawable.se3)
                    productName3.text = "#세븐일레븐 #멸치아몬드 #바프"
                    imgProduct4.setImageResource(R.drawable.se4)
                    productName4.text = "#세븐일레븐 #포테이토칩 #농심"
                    imgProduct5.setImageResource(R.drawable.se5)
                    productName5.text = "#세븐일레븐 #와일드크래미틈새소스 #한성"
                }
            }
        }

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment NewFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            NewFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}