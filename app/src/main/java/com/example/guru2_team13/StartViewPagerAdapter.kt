package com.example.guru2_team13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class StartViewPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    private val fragments = arrayOf(
        Start1Fragment(), // First fragment to be displayed within the pager tab number 1
        Start2Fragment(),
        Start3Fragment(),
        Start4Fragment()
    )

    private val mFragmentNames = arrayOf(
        "First Start Tab",
        "Second Start Tab",
        "Third Start Tab",
        "Forth Start Tab"
    )

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

    fun getFragmentName(position: Int): String {
        return mFragmentNames[position]
    }
}