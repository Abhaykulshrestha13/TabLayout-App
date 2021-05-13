package com.a13hay.tablayoutapp

import android.content.Context
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.PagerAdapter

class MyAdapter : FragmentPagerAdapter {
    lateinit var mycontext:Context
    var totalTabs:Int = 0
    constructor(context: Context, supportFragmentManager: FragmentManager, tabCount: Int) : super(supportFragmentManager){
        mycontext = context
        totalTabs = tabCount
    }

    override fun getCount(): Int {
        return totalTabs
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return Image1Fragment()
            1 -> return Image2Fragment()
            2 -> return Image3Fragment()
        }
        return Image1Fragment()
    }

}
