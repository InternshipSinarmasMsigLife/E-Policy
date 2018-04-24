package epolicy.ajsmsig.co.id.epolicy.model

import android.app.Fragment
import android.app.FragmentManager
import com.example.ahmad_r.epolicy.Fragment.FragmentFAQ
import com.example.ahmad_r.epolicy.Fragment.FragmentIstilah
import com.example.ahmad_r.epolicy.Fragment.FragmentKontak
import com.example.ahmad_r.epolicy.Fragment.FragmentPanduan

/**
 * Created by Ahmad_R on 18/04/2018.
 */
abstract class PagerAdapter(fm : FragmentManager) :FragmentManager() {

/*    fun getItem(position: Int): Fragment? = when(position){
        0 -> FragmentPanduan.newInstance()
        1 -> FragmentFAQ.newInstance()
        2 -> FragmentIstilah.newInstance()
        else -> null
    }*/

    fun getPageTitle(position: Int): CharSequence = when(position){
        0 -> "Panduan"
        1 -> "FAQ"
        2 -> "Istilah"
        else -> ""
    }

    fun getCount(): Int = 3

}