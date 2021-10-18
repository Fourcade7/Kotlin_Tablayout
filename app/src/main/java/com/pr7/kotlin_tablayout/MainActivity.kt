package com.pr7.kotlin_tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager.adapter=TabAdapter(supportFragmentManager)
        tablayout.setupWithViewPager(viewpager)

        tablayout.getTabAt(0)?.setIcon(R.drawable.ic_baseline_backup_24)
        tablayout.getTabAt(1)?.setIcon(R.drawable.ic_baseline_favorite_border_24)
        tablayout.getTabAt(2)?.setIcon(R.drawable.ic_baseline_home_24)


    }
}