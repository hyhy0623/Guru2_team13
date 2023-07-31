package com.example.guru2_team13

import android.R.attr.data
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MypageFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    lateinit var btn1_Myp: ImageButton
    lateinit var btn2_Myp: ImageButton
    lateinit var btn3_Myp: ImageButton
    lateinit var btnLogout: Button
    lateinit var dbHelper: DBHelper
    lateinit var textNick : TextView

    //private var _binding: MypageFragmentBinding?=null
    /*private var _binding:MypageFragmentBinding? = null
    private val binding get() = _binding!!*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)

            //textNick = view.findViewById(R.id.textNick_Myp)

        }
    }

    /*override fun onAttach(context: Context) {
        super.onAttach(context)

        // DBHelper 객체를 생성할 때 액티비티의 Context를 전달
        //dbHelper = DBHelper(context)
    }*/
    fun setData(id: String?) {
        textNick.text = id
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_mypage, container, false)

        // 프래그먼트 내에서 뒤로가기 버튼 이벤트를 소비
        view.isFocusableInTouchMode = true
        view.requestFocus()
        view.setOnKeyListener { _, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_BACK && event.action == KeyEvent.ACTION_UP) {
                // 뒤로가기 버튼 이벤트를 소비하여 뒤로가지 않음
                true
            } else {
                false
            }
        }

        btn1_Myp = view.findViewById(R.id.btn1_Myp)
        btn2_Myp = view.findViewById(R.id.btn2_Myp)
        btn3_Myp = view.findViewById(R.id.btn3_Myp)
        btnLogout= view.findViewById(R.id.btnLogout_Myp)
        textNick = view.findViewById(R.id.textNick_Myp)
        dbHelper = DBHelper(requireContext())
        //textNick.text = arguments?.getString("id")

        // id HomeActivity에서 받아오기
        val id = arguments?.getString("id")

        // id를 이용하여 닉네임 받고 적용
        if (id != null) {
            val db = dbHelper.readableDatabase
            val cursor = db.rawQuery("SELECT nick FROM users WHERE id=?", arrayOf(id))

            if (cursor.moveToFirst()) {
                var index = cursor.getColumnIndex("nick")
                val nickname = cursor.getString(index)
                textNick.text = "${nickname.trim()}님, 환영합니다!"
            }
        }
        else {
            textNick.text = "회원님"
        }

        // 버튼 클릭하여 activity 이동
        btn1_Myp.setOnClickListener {
            val intent = Intent(getActivity(), MyNewProductActivity::class.java)
            startActivity(intent)
        }

        btn2_Myp.setOnClickListener {
            val intent = Intent(getActivity(), MyRecipeActivity::class.java)
            startActivity(intent)
        }

        btn3_Myp.setOnClickListener {
            val intent = Intent(getActivity(), MyWriteRecipeActivity::class.java)
            startActivity(intent)
        }

        btnLogout.setOnClickListener {
            Toast.makeText(requireContext(), "로그아웃 되었습니다.", Toast.LENGTH_SHORT).show()
            val intent = Intent(getActivity(), MainActivity::class.java)
            startActivity(intent)
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /*
        textNick = view.findViewById(R.id.textNick_Myp)

        val bundle = arguments
        textNick.text = bundle?.getString("id")*/
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}