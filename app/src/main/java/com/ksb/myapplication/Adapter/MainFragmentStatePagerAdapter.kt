package com.ksb.myapplication.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

import com.ksb.myapplication.FragmentPage.FirstFragment
import com.ksb.myapplication.FragmentPage.LastFragment
import com.ksb.myapplication.FragmentPage.SecondFragment
import com.ksb.myapplication.FragmentPage.ThirdFragment


class MainFragmentStatePagerAdapter(fm : FragmentManager, val fragmentCount : Int) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return FirstFragment()
            1 -> return SecondFragment()
            2 -> return ThirdFragment()
            3 -> return LastFragment()
            else -> {throw IllegalStateException("$position is illegal") }

        }
    }

    override fun getCount(): Int = fragmentCount // 자바에서는 { return fragmentCount }

}