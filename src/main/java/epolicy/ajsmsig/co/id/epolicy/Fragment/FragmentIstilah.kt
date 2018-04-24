package com.example.ahmad_r.epolicy.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import epolicy.ajsmsig.co.id.epolicy.R

/**
 * Created by Ahmad_R on 06/04/2018.
 */
class FragmentIstilah : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
            inflater.inflate(R.layout.fragment_istilah, container, false)

    companion object {
        fun newInstance(): FragmentIstilah = FragmentIstilah()

    }
}