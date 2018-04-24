package epolicy.ajsmsig.co.id.epolicy.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.view.MenuItem
import android.widget.FrameLayout
import com.example.ahmad_r.epolicy.Fragment.FragmentBantuan
import com.example.ahmad_r.epolicy.Fragment.FragmentHome
import com.example.ahmad_r.epolicy.Fragment.FragmentKontak
import com.example.ahmad_r.epolicy.Fragment.Fragmentnab
import epolicy.ajsmsig.co.id.epolicy.R

class MainActivity : AppCompatActivity() {

    //lateinit var toolbar: ActionBar
    private var content:FrameLayout? = null



    /* private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->

         when(item.itemId){
             R.id.navigation_home ->{
                 //toolbar.title = "Home"
                 val FragmentHome = FragmentHome.newInstance()
                 openFragment(FragmentHome)
                 return@OnNavigationItemSelectedListener true
             }
             R.id.navigation_nab ->{
                 //toolbar.title = "NAB"
                 val Fragmentnab = Fragmentnab.newInstance()
                 openFragment(Fragmentnab)
                 return@OnNavigationItemSelectedListener true
             }
             R.id.navigation_kontak ->{
                 //toolbar.title = "Kontak"
                 val FragmentKontak = FragmentKontak.newInstance()
                 openFragment(FragmentKontak)
                 return@OnNavigationItemSelectedListener true
             }
             R.id.navigation_bantuan ->{
                 //toolbar.title = "Bantuan"
                 val FragmentBantuan = FragmentBantuan.newInstance()
                 openFragment(FragmentBantuan)
                 return@OnNavigationItemSelectedListener true
             }
         }
         false
     }

     private fun openFragment(fragment: Fragment) {
         val transaction = supportFragmentManager.beginTransaction()
         transaction.replace(R.id.container, fragment)
         transaction.addToBackStack(null)
         transaction.commit()
     }*/

    private val mOnNavigationItemSelectedListener = object : BottomNavigationView.OnNavigationItemSelectedListener {

        override fun onNavigationItemSelected(item: MenuItem): Boolean {

            when (item.itemId) {
                R.id.navigation_home -> {

                    val fragment = FragmentHome.Companion.newInstance()
                    addFragment(fragment)
                    return true
                }
                R.id.navigation_kontak -> {
                    val fragment = FragmentKontak()
                    addFragment(fragment)
                    return true
                }
                R.id.navigation_nab -> {
                    val fragment = Fragmentnab()
                    addFragment(fragment)
                    return true
                }
                R.id.navigation_bantuan ->{
                    val fragment = FragmentBantuan()
                    addFragment(fragment)
                    return true
                }

            }
            return false

        }

    }

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager
                .beginTransaction()
                .setCustomAnimations(R.anim.design_bottom_sheet_slide_in, R.anim.design_bottom_sheet_slide_out)
                .replace(R.id.content, fragment, fragment.javaClass.getSimpleName())
                .addToBackStack(fragment.javaClass.getSimpleName())
                .commit()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //BottomNavigation

        //toolbar = supportActionBar!!
        content = findViewById(R.id.content)
        val bottomNavigation:BottomNavigationView = findViewById(R.id.navigationView)
        bottomNavigation.setOnNavigationItemSelectedListener (mOnNavigationItemSelectedListener)

        val fragment = FragmentHome.Companion.newInstance()
        addFragment(fragment)

    }




}
