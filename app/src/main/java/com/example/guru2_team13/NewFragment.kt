package com.example.guru2_team13

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.ScrollView
import android.widget.TextView
import androidx.compose.material.ButtonColors

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
    lateinit var heartCheck6 : CheckBox
    lateinit var heartCheck7 : CheckBox
    lateinit var heartCheck8 : CheckBox
    lateinit var heartCheck9 : CheckBox
    lateinit var heartCheck10 : CheckBox
    lateinit var heartCheck11 : CheckBox
    lateinit var heartCheck12 : CheckBox
    lateinit var heartCheck13 : CheckBox
    lateinit var heartCheck14 : CheckBox
    lateinit var heartCheck15 : CheckBox


    // 찜 버튼 데이터 리스트
    val buttonDataList = mutableListOf<ButtonData>()


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
        heartCheck6 = view.findViewById(R.id.heartCheck6)
        heartCheck7 = view.findViewById(R.id.heartCheck7)
        heartCheck8 = view.findViewById(R.id.heartCheck8)
        heartCheck9 = view.findViewById(R.id.heartCheck9)
        heartCheck10 = view.findViewById(R.id.heartCheck10)
        heartCheck11 = view.findViewById(R.id.heartCheck11)
        heartCheck12 = view.findViewById(R.id.heartCheck12)
        heartCheck13 = view.findViewById(R.id.heartCheck13)
        heartCheck14 = view.findViewById(R.id.heartCheck14)
        heartCheck15 = view.findViewById(R.id.heartCheck15)


        // 찜 버튼 데이터 전송
        if (heartCheck1.isChecked == false){
            heartCheck1.setOnCheckedChangeListener { buttonView, isChecked ->
                //sendDataToHomeActivity(heartCheck1.isChecked)
                buttonDataList.add(ButtonData(1, "찜1", heartCheck1.isChecked))
            }
        }

        if (heartCheck2.isChecked == false){
            heartCheck2.setOnCheckedChangeListener { buttonView, isChecked ->
                //sendDataToHomeActivity(heartCheck1.isChecked)
                buttonDataList.add(ButtonData(2, "찜2", heartCheck2.isChecked))
            }
        }

        if (heartCheck3.isChecked == false){
            heartCheck3.setOnCheckedChangeListener { buttonView, isChecked ->
                //sendDataToHomeActivity(heartCheck1.isChecked)
                buttonDataList.add(ButtonData(3, "찜3", heartCheck3.isChecked))
            }
        }

        heartCheck4.setOnCheckedChangeListener { buttonView, isChecked ->
            //sendDataToHomeActivity(heartCheck1.isChecked)
            buttonDataList.add(ButtonData(4, "찜4", heartCheck4.isChecked))
        }
        heartCheck5.setOnCheckedChangeListener { buttonView, isChecked ->
            //sendDataToHomeActivity(heartCheck1.isChecked)
            buttonDataList.add(ButtonData(5, "찜5", heartCheck5.isChecked))
        }
        heartCheck6.setOnCheckedChangeListener { buttonView, isChecked ->
            //sendDataToHomeActivity(heartCheck1.isChecked)
            buttonDataList.add(ButtonData(6, "찜6", heartCheck6.isChecked))
        }
        heartCheck7.setOnCheckedChangeListener { buttonView, isChecked ->
            //sendDataToHomeActivity(heartCheck1.isChecked)
            buttonDataList.add(ButtonData(7, "찜7", heartCheck7.isChecked))
        }
        heartCheck8.setOnCheckedChangeListener { buttonView, isChecked ->
            //sendDataToHomeActivity(heartCheck1.isChecked)
            buttonDataList.add(ButtonData(8, "찜8", heartCheck8.isChecked))
        }
        heartCheck9.setOnCheckedChangeListener { buttonView, isChecked ->
            //sendDataToHomeActivity(heartCheck1.isChecked)
            buttonDataList.add(ButtonData(9, "찜9", heartCheck9.isChecked))
        }
        heartCheck10.setOnCheckedChangeListener { buttonView, isChecked ->
            //sendDataToHomeActivity(heartCheck1.isChecked)
            buttonDataList.add(ButtonData(10, "찜10", heartCheck10.isChecked))
        }
        heartCheck11.setOnCheckedChangeListener { buttonView, isChecked ->
            //sendDataToHomeActivity(heartCheck1.isChecked)
            buttonDataList.add(ButtonData(11, "찜11", heartCheck11.isChecked))
        }
        heartCheck12.setOnCheckedChangeListener { buttonView, isChecked ->
            //sendDataToHomeActivity(heartCheck1.isChecked)
            buttonDataList.add(ButtonData(12, "찜12", heartCheck12.isChecked))
        }
        heartCheck13.setOnCheckedChangeListener { buttonView, isChecked ->
            //sendDataToHomeActivity(heartCheck1.isChecked)
            buttonDataList.add(ButtonData(13, "찜13", heartCheck13.isChecked))
        }
        heartCheck14.setOnCheckedChangeListener { buttonView, isChecked ->
            //sendDataToHomeActivity(heartCheck1.isChecked)
            buttonDataList.add(ButtonData(14, "찜14", heartCheck14.isChecked))
        }
        heartCheck15.setOnCheckedChangeListener { buttonView, isChecked ->
            //sendDataToHomeActivity(heartCheck1.isChecked)
            buttonDataList.add(ButtonData(15, "찜15", heartCheck15.isChecked))
        }


        //sendDataToMyNewActivity(buttonDataList)

        // 편의점 구분 라이도 버튼
        rGroup1.setOnCheckedChangeListener { radioGroup, i ->
            when (i) {
                R.id.allBtn -> {
                    // 스크롤 맨 위로 이동
                    view.findViewById<ScrollView>(R.id.scrollView_new).smoothScrollTo(0, 0)

                    // 모든 편의점 신제품 보이기
                    view.findViewById<LinearLayout>(R.id.box_new1).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new2).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new3).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new4).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new5).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new6).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new7).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new8).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new9).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new10).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new11).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new12).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new13).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new14).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new15).visibility = View.VISIBLE
                    /*
                    imgProduct1.setImageResource(R.drawable.cu1)
                    productName1.text = "#CU #뉴불어묵삼각 #3XL"
                    imgProduct2.setImageResource(R.drawable.gs1)
                    productName2.text = "#GS #행운약과라떼 #유어스"
                    imgProduct3.setImageResource(R.drawable.se3)
                    productName3.text = "#세븐일레븐 #멸치아몬드 #바프"
                    imgProduct4.setImageResource(R.drawable.gs3)
                    productName4.text = "#GS #솔티카라멜휘낭시에 #브레디크"
                    imgProduct5.setImageResource(R.drawable.cu4)
                    productName5.text = "#CU #더블초코맘모스빵 #고대"*/
                }
                R.id.CUBtn -> {
                    view.findViewById<ScrollView>(R.id.scrollView_new).smoothScrollTo(0, 0)

                    //cu 제외 나머지 편의점 신제품 숨김
                    view.findViewById<LinearLayout>(R.id.box_new2).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new3).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new5).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new6).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new8).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new9).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new11).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new12).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new14).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new15).visibility = View.GONE

                    // cu 신제품만 보이기
                    view.findViewById<LinearLayout>(R.id.box_new1).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new4).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new7).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new10).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new13).visibility = View.VISIBLE
                    /*heartCheck1.isChecked = false
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
                    productName5.text = "#CU #통통소시지모닝머핀 #KIA"*/
                }

                R.id.GSBtn -> {
                    view.findViewById<ScrollView>(R.id.scrollView_new).smoothScrollTo(0, 0)

                    view.findViewById<LinearLayout>(R.id.box_new1).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new3).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new4).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new6).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new7).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new9).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new10).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new12).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new13).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new15).visibility = View.GONE

                    view.findViewById<LinearLayout>(R.id.box_new2).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new5).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new8).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new11).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new14).visibility = View.VISIBLE
                    /*heartCheck1.isChecked = false
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
                    productName5.text = "#GS #양념치킨도시락 #페리카나"*/
                }

                R.id.SEBtn -> {
                    view.findViewById<ScrollView>(R.id.scrollView_new).smoothScrollTo(0, 0)

                    view.findViewById<LinearLayout>(R.id.box_new1).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new2).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new4).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new5).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new7).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new8).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new10).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new11).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new13).visibility = View.GONE
                    view.findViewById<LinearLayout>(R.id.box_new14).visibility = View.GONE

                    view.findViewById<LinearLayout>(R.id.box_new3).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new6).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new9).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new12).visibility = View.VISIBLE
                    view.findViewById<LinearLayout>(R.id.box_new15).visibility = View.VISIBLE
                    /*heartCheck1.isChecked = false
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
                    productName5.text = "#세븐일레븐 #와일드크래미틈새소스 #한성"*/
                }
            }
        }

        return view
    }

    private fun sendDataToMyNewActivity(buttonDataList: List<ButtonData>) {
        val intent = Intent(requireActivity(), MyNewProductActivity::class.java)
        intent.putExtra("button_data_list", ArrayList(buttonDataList))
        requireActivity().intent = intent
    }

    override fun onPause() {
        super.onPause()

        sendDataToMyNewActivity(buttonDataList)
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