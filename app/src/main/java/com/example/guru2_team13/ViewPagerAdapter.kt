package com.example.guru2_team13

import android.os.Looper
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    private val mFragments = arrayOf(
        Ad1Fragment(), // First fragment to be displayed within the pager tab number 1
        Ad2Fragment(),
        Ad3Fragment(),
        Ad4Fragment(),
        Ad5Fragment()
    )

    private val mFragmentNames = arrayOf(
        "First Tab",
        "Second Tab",
        "Third Tab",
        "Forth Tab",
        "Fifth Tab"
    )

    override fun getItemCount(): Int {
        return mFragments.size // Number of fragments displayed
    }

    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    override fun createFragment(position: Int): Fragment {
        return mFragments[position]
    }

    fun getFragmentName(position: Int): String {
        return mFragmentNames[position]
    }
}


