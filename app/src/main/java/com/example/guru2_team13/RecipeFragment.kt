package com.example.guru2_team13

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.google.android.gms.maps.model.Marker
import com.google.android.material.floatingactionbutton.FloatingActionButton


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [RecipeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RecipeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    lateinit var fab_write: FloatingActionButton
    lateinit var recipeButton1: ImageButton
    lateinit var recipeButton2: ImageButton
    lateinit var recipeButton3: ImageButton
    lateinit var recipeButton4: ImageButton
    lateinit var recipeButton5: ImageButton
    lateinit var recipeButton6: ImageButton
    lateinit var recipeButton7: ImageButton
    lateinit var recipeButton8: ImageButton
    lateinit var searchButton_recipe: ImageButton

    lateinit var mark1: CheckBox
    lateinit var mark2: CheckBox
    lateinit var mark3: CheckBox
    lateinit var mark4: CheckBox
    lateinit var mark5: CheckBox
    lateinit var mark6: CheckBox
    lateinit var mark7: CheckBox
    lateinit var mark8: CheckBox

    //private lateinit var recipeViewModel: RecipeViewModel

    val recipeViewData = RecipeViewModel.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_recipe, container, false)

        mark1 = view.findViewById<CheckBox>(R.id.recipe_mark1)
        mark2 = view.findViewById<CheckBox>(R.id.recipe_mark2)
        mark3 = view.findViewById<CheckBox>(R.id.recipe_mark3)
        mark4 = view.findViewById<CheckBox>(R.id.recipe_mark4)
        mark5 = view.findViewById<CheckBox>(R.id.recipe_mark5)
        mark6 = view.findViewById<CheckBox>(R.id.recipe_mark6)
        mark7 = view.findViewById<CheckBox>(R.id.recipe_mark7)
        mark8 = view.findViewById<CheckBox>(R.id.recipe_mark8)

        // viewModel 인스턴스 초기화
        //recipeViewModel = ViewModelProvider(this).get(RecipeViewModel::class.java)


        // 프래그먼트가 다시 생성될 때 이전에 저장한 체크박스 상태를 가져와 적용
        /*savedInstanceState?.let {
            view.findViewById<CheckBox>(R.id.recipe_mark1).isChecked = it.getBoolean("mark1Checked", false)
            view.findViewById<CheckBox>(R.id.recipe_mark2).isChecked = it.getBoolean("mark2Checked", false)
            view.findViewById<CheckBox>(R.id.recipe_mark3).isChecked = it.getBoolean("mark3Checked", false)
            view.findViewById<CheckBox>(R.id.recipe_mark4).isChecked = it.getBoolean("mark4Checked", false)
            view.findViewById<CheckBox>(R.id.recipe_mark5).isChecked = it.getBoolean("mark5Checked", false)
            view.findViewById<CheckBox>(R.id.recipe_mark6).isChecked = it.getBoolean("mark6Checked", false)
            view.findViewById<CheckBox>(R.id.recipe_mark7).isChecked = it.getBoolean("mark7Checked", false)
            view.findViewById<CheckBox>(R.id.recipe_mark8).isChecked = it.getBoolean("mark8Checked", false)
        }*/
        /*
        view.findViewById<CheckBox>(R.id.recipe_mark1).isChecked = recipeViewModel.Mark1Checked
        view.findViewById<CheckBox>(R.id.recipe_mark2).isChecked = recipeViewModel.Mark2Checked
        view.findViewById<CheckBox>(R.id.recipe_mark3).isChecked = recipeViewModel.Mark3Checked
        view.findViewById<CheckBox>(R.id.recipe_mark4).isChecked = recipeViewModel.Mark4Checked
        view.findViewById<CheckBox>(R.id.recipe_mark5).isChecked = recipeViewModel.Mark5Checked
        view.findViewById<CheckBox>(R.id.recipe_mark6).isChecked = recipeViewModel.Mark6Checked
        view.findViewById<CheckBox>(R.id.recipe_mark7).isChecked = recipeViewModel.Mark7Checked
        view.findViewById<CheckBox>(R.id.recipe_mark8).isChecked = recipeViewModel.Mark8Checked*/

        fab_write = view.findViewById(com.example.guru2_team13.R.id.fab_write)
        recipeButton1 = view.findViewById(com.example.guru2_team13.R.id.recipeButton1)
        recipeButton2 = view.findViewById(com.example.guru2_team13.R.id.recipeButton2)
        recipeButton3 = view.findViewById(com.example.guru2_team13.R.id.recipeButton3)
        recipeButton4 = view.findViewById(com.example.guru2_team13.R.id.recipeButton4)
        recipeButton5 = view.findViewById(com.example.guru2_team13.R.id.recipeButton5)
        recipeButton6 = view.findViewById(com.example.guru2_team13.R.id.recipeButton6)
        recipeButton7 = view.findViewById(com.example.guru2_team13.R.id.recipeButton7)
        recipeButton8 = view.findViewById(com.example.guru2_team13.R.id.recipeButton8)
        searchButton_recipe = view.findViewById(com.example.guru2_team13.R.id.btnSearch_recipe)

        fab_write.setOnClickListener {
            var intent = Intent(activity, BoardWrite::class.java)
            startActivity(intent)
        }

        recipeButton1.setOnClickListener {
            var intent = Intent(activity, BoardDetail::class.java)
            startActivity(intent)
        }
        recipeButton2.setOnClickListener {
            var intent = Intent(activity, BoardDetail2::class.java)
            startActivity(intent)
        }
        recipeButton3.setOnClickListener {
            var intent = Intent(activity, BoardDetail3::class.java)
            startActivity(intent)
        }
        recipeButton4.setOnClickListener {
            var intent = Intent(activity, BoardDetail4::class.java)
            startActivity(intent)
        }
        recipeButton4.setOnClickListener {
            var intent = Intent(activity, BoardDetail4::class.java)
            startActivity(intent)
        }
        recipeButton5.setOnClickListener {
            var intent = Intent(activity, BoardDetail5::class.java)
            startActivity(intent)
        }
        recipeButton6.setOnClickListener {
            var intent = Intent(activity, BoardDetail6::class.java)
            startActivity(intent)
        }
        recipeButton7.setOnClickListener {
            var intent = Intent(activity, BoardDetail7::class.java)
            startActivity(intent)
        }
        recipeButton8.setOnClickListener {
            var intent = Intent(activity, BoardDetail8::class.java)
            startActivity(intent)
        }

        searchButton_recipe.setOnClickListener {
            // Toast.makeText(requireContext(), "기능 구현 예정입니다.", Toast.LENGTH_SHORT).show()
            var intent = Intent(activity, SearchList::class.java)
            startActivity(intent)
        }

        //Log.d("RecipeFragment", "Mark1Checked: ${recipeViewModel.Mark1Checked}")
        // 북마크 눌리면 true false 저장
        mark1?.setOnCheckedChangeListener { buttonView, isChecked ->
            recipeViewData.Mark1Checked = view?.findViewById<CheckBox>(R.id.recipe_mark1)?.isChecked ?: false
        }
        mark2?.setOnCheckedChangeListener { buttonView, isChecked ->
            recipeViewData.Mark2Checked = view?.findViewById<CheckBox>(R.id.recipe_mark2)?.isChecked ?: false
        }
        mark3?.setOnCheckedChangeListener { buttonView, isChecked ->
            recipeViewData.Mark3Checked = view?.findViewById<CheckBox>(R.id.recipe_mark3)?.isChecked ?: false
        }
        mark4?.setOnCheckedChangeListener { buttonView, isChecked ->
            recipeViewData.Mark4Checked = view?.findViewById<CheckBox>(R.id.recipe_mark4)?.isChecked ?: false
        }
        mark5?.setOnCheckedChangeListener { buttonView, isChecked ->
            recipeViewData.Mark5Checked = view?.findViewById<CheckBox>(R.id.recipe_mark5)?.isChecked ?: false
        }
        mark6?.setOnCheckedChangeListener { buttonView, isChecked ->
            recipeViewData.Mark6Checked = view?.findViewById<CheckBox>(R.id.recipe_mark6)?.isChecked ?: false
        }
        mark7?.setOnCheckedChangeListener { buttonView, isChecked ->
            recipeViewData.Mark7Checked = view?.findViewById<CheckBox>(R.id.recipe_mark7)?.isChecked ?: false
        }
        mark8?.setOnCheckedChangeListener { buttonView, isChecked ->
            recipeViewData.Mark8Checked = view?.findViewById<CheckBox>(R.id.recipe_mark8)?.isChecked ?: false
        }

        view?.findViewById<CheckBox>(R.id.recipe_mark1)?.isChecked = recipeViewData.Mark1Checked
        view?.findViewById<CheckBox>(R.id.recipe_mark2)?.isChecked = recipeViewData.Mark2Checked
        view?.findViewById<CheckBox>(R.id.recipe_mark3)?.isChecked = recipeViewData.Mark3Checked
        view?.findViewById<CheckBox>(R.id.recipe_mark4)?.isChecked = recipeViewData.Mark4Checked
        view?.findViewById<CheckBox>(R.id.recipe_mark5)?.isChecked = recipeViewData.Mark5Checked
        view?.findViewById<CheckBox>(R.id.recipe_mark6)?.isChecked = recipeViewData.Mark6Checked
        view?.findViewById<CheckBox>(R.id.recipe_mark7)?.isChecked = recipeViewData.Mark7Checked
        view?.findViewById<CheckBox>(R.id.recipe_mark8)?.isChecked = recipeViewData.Mark8Checked

        return view
    }
/*
    override fun onDestroyView() {
        // 프래그먼트가 소멸될 때 체크박스 상태를 ViewModel에 저장
        recipeViewModel.Mark1Checked = view?.findViewById<CheckBox>(R.id.recipe_mark1)?.isChecked ?: false
        recipeViewModel.Mark2Checked = view?.findViewById<CheckBox>(R.id.recipe_mark2)?.isChecked ?: false
        recipeViewModel.Mark3Checked = view?.findViewById<CheckBox>(R.id.recipe_mark3)?.isChecked ?: false
        recipeViewModel.Mark4Checked = view?.findViewById<CheckBox>(R.id.recipe_mark4)?.isChecked ?: false
        recipeViewModel.Mark5Checked = view?.findViewById<CheckBox>(R.id.recipe_mark5)?.isChecked ?: false
        recipeViewModel.Mark6Checked = view?.findViewById<CheckBox>(R.id.recipe_mark6)?.isChecked ?: false
        recipeViewModel.Mark7Checked = view?.findViewById<CheckBox>(R.id.recipe_mark7)?.isChecked ?: false
        recipeViewModel.Mark8Checked = view?.findViewById<CheckBox>(R.id.recipe_mark8)?.isChecked ?: false

        super.onDestroyView()
    }

    private fun saveCheckboxStateToDB(checkboxId: Int, isChecked:Boolean) {

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        // 상태를 저장할 데이터를 Bundle에 넣는다
        outState.putBoolean("mark1Checked", view?.findViewById<CheckBox>(R.id.recipe_mark1)?.isChecked ?: false)
        outState.putBoolean("mark2Checked", view?.findViewById<CheckBox>(R.id.recipe_mark2)?.isChecked ?: false)
        outState.putBoolean("mark3Checked", view?.findViewById<CheckBox>(R.id.recipe_mark3)?.isChecked ?: false)
        outState.putBoolean("mark4Checked", view?.findViewById<CheckBox>(R.id.recipe_mark4)?.isChecked ?: false)
        outState.putBoolean("mark5Checked", view?.findViewById<CheckBox>(R.id.recipe_mark5)?.isChecked ?: false)
        outState.putBoolean("mark6Checked", view?.findViewById<CheckBox>(R.id.recipe_mark6)?.isChecked ?: false)
        outState.putBoolean("mark7Checked", view?.findViewById<CheckBox>(R.id.recipe_mark7)?.isChecked ?: false)
        outState.putBoolean("mark8Checked", view?.findViewById<CheckBox>(R.id.recipe_mark8)?.isChecked ?: false)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        // 이전에 저장한 체크박스 상태를 복원한다.
        savedInstanceState?.let {
            view?.findViewById<CheckBox>(R.id.recipe_mark1)?.isChecked = it.getBoolean("mark1Checked", false)
            view?.findViewById<CheckBox>(R.id.recipe_mark2)?.isChecked = it.getBoolean("mark2Checked", false)
            view?.findViewById<CheckBox>(R.id.recipe_mark3)?.isChecked = it.getBoolean("mark3Checked", false)
            view?.findViewById<CheckBox>(R.id.recipe_mark4)?.isChecked = it.getBoolean("mark4Checked", false)
            view?.findViewById<CheckBox>(R.id.recipe_mark5)?.isChecked = it.getBoolean("mark5Checked", false)
            view?.findViewById<CheckBox>(R.id.recipe_mark6)?.isChecked = it.getBoolean("mark6Checked", false)
            view?.findViewById<CheckBox>(R.id.recipe_mark7)?.isChecked = it.getBoolean("mark7Checked", false)
            view?.findViewById<CheckBox>(R.id.recipe_mark8)?.isChecked = it.getBoolean("mark8Checked", false)
        }
    }*/

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment RecipeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RecipeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}