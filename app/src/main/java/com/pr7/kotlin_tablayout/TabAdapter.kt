package com.pr7.kotlin_tablayout

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabAdapter(fragmentManager: FragmentManager) :FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position){

            0->{return BlankFragment()}
            1->{return BlankFragment2()}
            2->{return BlankFragment()}
            else ->{return BlankFragment()}

        }

    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){

            0->return "Home"
            1->return "Order"
            2->return "Settings"
            else->return "Settings"
        }

        return super.getPageTitle(position)
    }
}