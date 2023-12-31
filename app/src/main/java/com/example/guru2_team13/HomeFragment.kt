package com.example.guru2_team13

import android.R.id.edit
import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.core.content.ContextCompat.startActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import me.relex.circleindicator.CircleIndicator3


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    /*
    private lateinit var viewPager2: ViewPager2
    private lateinit var circleIndicator: CircleIndicator3*/
    //private val adapter by lazy { ViewPagerAdapter(supportFragmentManager) }
    private lateinit var mViewPager: ViewPager2
    private lateinit var mIndicator: CircleIndicator3
    private lateinit var fab: View
    lateinit var recipe_Btn: Button
    lateinit var CU_Btn: Button
    lateinit var GS_Btn: Button
    lateinit var SE_Btn: Button
    lateinit var recipe1 : ImageButton
    lateinit var recipe2 : ImageButton
    lateinit var recipe3 : ImageButton
    lateinit var recipe4 : ImageButton

    private val autoSlideHandler = Handler()
    private val autoSlideRunnable = object : Runnable {

        override fun run() {
            val currentItem = mViewPager.currentItem
            val nextItem = if (currentItem == mViewPager.adapter?.itemCount?.minus(1)) 0 else currentItem + 1
            mViewPager.setCurrentItem(nextItem, true)
            startAutoSlide() // 3초 타이머를 다시 시작합니다.
        }
    }

    private fun showTab(tabId: Int) {
        // BottomNavigationView에서 탭을 보여주는 함수
        // 예: 탭에 해당하는 동작 수행
    }

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

        val view = inflater.inflate(R.layout.fragment_home, container, false)

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

        val bottomNavigationView: BottomNavigationView = requireActivity().findViewById(R.id.bnv_main)
        /*
        val viewPagerAd = rootView.findViewById(R.id.viewPager_ad)
        val adImages = getAdImages() // 광고에 사용할 이미지들을 가져오는 메서드
        val adapter = AdsPagerAdapter(requireContext(), adImages)
        viewPager2.adapter = adapter

        // CircleIndicator와 ViewPager2를 연결
        circleIndicator = rootView.findViewById(R.id.indicator)
        circleIndicator.setViewPager(viewPager2)*/

        fab = view.findViewById(R.id.fab)
        recipe_Btn = view.findViewById(R.id.recipe_Btn)
        CU_Btn = view.findViewById(R.id.CU_Btn)
        GS_Btn = view.findViewById(R.id.GS_Btn)
        SE_Btn = view.findViewById(R.id.SE_Btn)

        recipe1 = view.findViewById(R.id.recipeButton1)
        recipe2 = view.findViewById(R.id.recipeButton2)
        recipe3 = view.findViewById(R.id.recipeButton3)
        recipe4 = view.findViewById(R.id.recipeButton4)

        // 레시피 사진 클릭시 상세 페이지로 이동
        recipe1.setOnClickListener{
            val intent = Intent(getActivity(), BoardDetail::class.java)
            startActivity(intent)
        }
        recipe2.setOnClickListener{
            val intent = Intent(getActivity(), BoardDetail2::class.java)
            startActivity(intent)
        }
        recipe3.setOnClickListener{
            val intent = Intent(getActivity(), BoardDetail3::class.java)
            startActivity(intent)
        }
        recipe4.setOnClickListener{
            val intent = Intent(getActivity(), BoardDetail4::class.java)
            startActivity(intent)
        }

        // 초기 탭으로 Home 탭을 선택
        // bottomNavigationView.selectedItemId = R.id.home_bar

        fab.setOnClickListener {
            val intent = Intent(getActivity(), MapActivity::class.java)
            startActivity(intent)
        }
        recipe_Btn.setOnClickListener {
            bottomNavigationView.selectedItemId = R.id.recipe_bar

            val recipeFragment = RecipeFragment()
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.fl_container, recipeFragment)
            //transaction.addToBackStack(null) // 이전 프래그먼트를 백스택에 추가
            transaction.commit()

//            val recipeFragment = RecipeFragment()
//            parentFragmentManager.beginTransaction().replace(R.id.fl_container, recipeFragment).commit()

//            var intent = Intent(activity, BoardList::class.java)
//            startActivity(intent)
        }
        CU_Btn.setOnClickListener {
            bottomNavigationView.selectedItemId = R.id.new_bar

            val newFragment = NewFragment()
            val bundle = Bundle() // 번들을 통해 값 전달
            bundle.putString("cuBtn", "1")

            val transaction = parentFragmentManager.beginTransaction()
            newFragment.setArguments(bundle)
            transaction.replace(R.id.fl_container, newFragment)
            //transaction.addToBackStack(null) // 이전 프래그먼트를 백스택에 추가
            transaction.commit()

//            var intent = Intent(activity, NewCU::class.java)
//            startActivity(intent)
        }
        GS_Btn.setOnClickListener {
            bottomNavigationView.selectedItemId = R.id.new_bar

            val newFragment = NewFragment()
            val bundle = Bundle() // 번들을 통해 값 전달
            bundle.putString("gsBtn", "2")

            val transaction = parentFragmentManager.beginTransaction()
            newFragment.setArguments(bundle)
            transaction.replace(R.id.fl_container, newFragment)
            //transaction.addToBackStack(null) // 이전 프래그먼트를 백스택에 추가
            transaction.commit()

//            var intent = Intent(activity, NewGS::class.java)
//            startActivity(intent)
        }
        SE_Btn.setOnClickListener {
            bottomNavigationView.selectedItemId = R.id.new_bar

            val newFragment = NewFragment()
            val bundle = Bundle() // 번들을 통해 값 전달
            bundle.putString("seBtn", "3")

            val transaction = parentFragmentManager.beginTransaction()
            newFragment.setArguments(bundle)
            transaction.replace(R.id.fl_container, newFragment)
            //transaction.addToBackStack(null) // 이전 프래그먼트를 백스택에 추가
            transaction.commit()

//            var intent = Intent(activity, NewSeven::class.java)
//            startActivity(intent)
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mViewPager = view.findViewById(R.id.viewPager_ad) // Get ViewPager2 view
        mViewPager.adapter = ViewPagerAdapter(requireActivity()) // Attach the adapter with our ViewPagerAdapter passing the host activity

        mIndicator = view.findViewById(R.id.indicator)
        mIndicator.setViewPager(mViewPager)

        startAutoSlide() // 자동 슬라이드 시작
    }

    private fun startAutoSlide() {
        // 이전에 실행되었던 autoSlideRunnable을 제거합니다.
        autoSlideHandler.removeCallbacks(autoSlideRunnable)
        // 3초마다 자동 슬라이드하도록 핸들러를 설정합니다.
        autoSlideHandler.postDelayed(autoSlideRunnable, 2800)
    }

    private fun stopAutoSlide() {
        // 자동 슬라이드를 중지합니다.
        autoSlideHandler.removeCallbacks(autoSlideRunnable)
    }

    override fun onPause() {
        super.onPause()
        stopAutoSlide() // Fragment가 일시정지되면 자동 슬라이드를 중지합니다.
    }

    override fun onResume() {
        super.onResume()
        startAutoSlide() // Fragment가 재개되면 자동 슬라이드를 다시 시작합니다.
    }
    /*
        val tabLayout = view.findViewById<TabLayout>(R.id.tabs)
        TabLayoutMediator(tabLayout, mViewPager) { tab, position ->
            tab.text = (mViewPager.adapter as ViewPagerAdapter).getFragmentName(position) // Sets tabs names as mentioned in ViewPagerAdapter fragmentNames array, this can be implemented in many different ways.
        }.attach()*/

    /*
    // 광고에 사용할 이미지들을 가져오는 메서드 (이미지들을 Drawable 형태로 반환)
    private fun getAdImages(): List<Drawable> {
        // 이미지들을 Drawable로 변환하여 리스트에 추가하는 로직을 구현하세요.
        // 예를 들면: ContextCompat.getDrawable(requireContext(), R.drawable.ad_image1)
        val adImages = ArrayList<Drawable>()
        // adImages.add(...)
        // adImages.add(...)
        // adImages.add(...)
        return adImages
    }*/
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