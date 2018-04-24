package com.example.ahmad_r.epolicy.Fragment

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import epolicy.ajsmsig.co.id.epolicy.R

/**
 * Created by Ahmad_R on 06/04/2018.
 */
class FragmentPanduan : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
      var view =  inflater.inflate(R.layout.fragment_panduan, container, false)

        var tabLayout = view.findViewById<TabLayout>(R.id.simpletabLayout)

        var viewPager = view.findViewById<ViewPager>(R.id.pager)

       /* tabLayout.addTab((tabLayout.newTab().setText("Panduan")))
        tabLayout.addTab((tabLayout.newTab().setText("Kontak")))
        tabLayout.addTab((tabLayout.newTab().setText("FAQ")))
*/
        return view
    }
    companion object {
        fun newInstance(): FragmentPanduan = FragmentPanduan()

    }

}