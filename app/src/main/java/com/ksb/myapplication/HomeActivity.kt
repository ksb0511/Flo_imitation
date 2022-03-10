package com.ksb.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import com.ksb.myapplication.Adapter.MainFragmentStatePagerAdapter

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

//        configureBottomNavigation()

    }

//    private fun configureBottomNavigation(){
//
//        vp_ac_main_frag_pager.adapter = MainFragmentStatePagerAdapter(supportFragmentManager, 5)
//
//        tl_ac_main_bottom_menu.setupWithViewPager(vp_ac_main_frag_pager)
//
//        val bottomNaviLayout: View = this.layoutInflater.inflate(R.layout.bottom_navigation_tab, null, false)
//
//        tl_ac_main_bottom_menu.getTabAt(0)!!.customView = bottomNaviLayout.findViewById(R.id.btn_bottom_navi_home_tab) as RelativeLayout
//        tl_ac_main_bottom_menu.getTabAt(1)!!.customView = bottomNaviLayout.findViewById(R.id.btn_bottom_navi_search_tab) as RelativeLayout
//        tl_ac_main_bottom_menu.getTabAt(2)!!.customView = bottomNaviLayout.findViewById(R.id.btn_bottom_navi_add_tab) as RelativeLayout
//        tl_ac_main_bottom_menu.getTabAt(4)!!.customView = bottomNaviLayout.findViewById(R.id.btn_bottom_navi_my_page_tab) as RelativeLayout
//
//
//
//
//    }
}