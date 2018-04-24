package epolicy.ajsmsig.co.id.epolicy.Activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import epolicy.ajsmsig.co.id.epolicy.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

            finish()
        }, TIME_OUT.toLong())
    }

    companion object {

        // Splash screen timer
        private val TIME_OUT = 3000
    }

}
