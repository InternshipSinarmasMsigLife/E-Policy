package com.example.ahmad_r.epolicy.Fragment

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import epolicy.ajsmsig.co.id.epolicy.R

/**
 * Created by Ahmad_R on 04/04/2018.
 */
class FragmentBantuan : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, contentbantuan: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater!!.inflate(R.layout.fragment_bantuan, contentbantuan, false)


        var viewPager = view.findViewById<ViewPager>(R.id.pager)
        /*setupViewPager(viewPager!!)*/

        var tabLayout = view.findViewById<TabLayout>(R.id.simpletabLayout)
        tabLayout!!.setupWithViewPager(viewPager)

        return view


    }

   /* private fun setupViewPager(viewPager: ViewPager){
        val adapter = ViewPagerAdapter()
        adapter.addFragment(FragmentPanduan(),"Panduan")
        adapter.addFragment(FragmentIstilah(),"Istilah")
        adapter.addFragment(FragmentFAQ(),"FAQ")
        viewPager.adapter = adapter
    }*/

    internal inner class ViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {
        private val mFragmentList = ArrayList<Fragment>()
        private val mFragmentTitleList = ArrayList<String>()

        override fun getItem(position: Int): Fragment {
            return mFragmentList[position]
        }

        override fun getCount(): Int {
        return mFragmentList.size
        }

        fun addFragment(fragment: Fragment, title: String){
            mFragmentList.add(fragment)
            mFragmentTitleList.add(title)
        }

        override fun getPageTitle(position: Int): CharSequence {
            return mFragmentTitleList[position]
        }

    }


    /*private fun addFragment(fragment: Fragment) {
        activity.supportFragmentManager
                .beginTransaction()
                .setCustomAnimations(R.anim.design_bottom_sheet_slide_in, R.anim.design_bottom_sheet_slide_out)
                .replace(R.id.content, fragment, fragment.javaClass.getSimpleName())
                .addToBackStack(fragment.javaClass.getSimpleName())
                .commit()
    }*/

         companion object {
        fun newInstance(): FragmentBantuan = FragmentBantuan()
     //   private var contentbantuan: FrameLayout? = null
    }


}