package com.example.ahmad_r.epolicy.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import epolicy.ajsmsig.co.id.epolicy.R
/**
 * Created by Ahmad_R on 04/04/2018.
 */
class FragmentHome : Fragment(){

    companion object {
        fun newInstance(): FragmentHome {
            var fragmentHome = FragmentHome()
            var args = Bundle()
            fragmentHome.arguments = args
            return fragmentHome
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var rootView = inflater.inflate(R.layout.fragment_home, container, false)
        return rootView
    }

}