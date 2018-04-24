package epolicy.ajsmsig.co.id.epolicy.Activity

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import epolicy.ajsmsig.co.id.epolicy.R
import epolicy.ajsmsig.co.id.epolicy.remote.ApiUtils
import epolicy.ajsmsig.co.id.epolicy.remote.UserService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import epolicy.ajsmsig.co.id.epolicy.R.string.username
import kotlinx.android.synthetic.main.activity_register.*
import okhttp3.ResponseBody
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException
import epolicy.ajsmsig.co.id.epolicy.R.string.username
import epolicy.ajsmsig.co.id.epolicy.model.ResObj
/*import jdk.nashorn.internal.runtime.ECMAErrors.getMessage
import epolicy.ajsmsig.co.id.epolicy.model.ResObj
import sun.security.jgss.GSSUtil.login*/






class LoginActivity : AppCompatActivity() {

companion object {
    var userService = ApiUtils().getUserService()
}



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btnlogin = findViewById<Button>(R.id.btnlogin)
        var btnregister = findViewById<Button>(R.id.btnregister)
        val etusername = findViewById<EditText>(R.id.etusername)
        val etpasswordL = findViewById<EditText>(R.id.etpasswordL)

        btnlogin.setOnClickListener(View.OnClickListener {
            val username = etusername.getText().toString()
            val password = etpasswordL.getText().toString()
            if (validateLogin(username, password)) {
                /*doLogin(username, password)*/
                val intent = Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
        })


        btnregister.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.data = Uri.parse("https://epolicy.sinarmasmsiglife.co.id/mobile/login.htm")
            startActivity(intent)

        }

    }
    private fun validateLogin(username: String?, password: String?): Boolean {
        if (username == null || username.trim { it <= ' ' }.length == 0) {
            toast("Username is required", Toast.LENGTH_SHORT)
            return false
        }
        if (password == null || password.trim { it <= ' ' }.length == 0) {
            toast("Password is required", Toast.LENGTH_SHORT)
            return false
        }
        return true
    }

    /*private fun doLogin(username: String, password: String){
        val call = userService.login(username,password)
            call.enqueue(object : Callback<ResObj> {
            override fun onResponse(call: Call<ResObj>, response: Response<ResObj>) {
                if (response.isSuccessful) {
                    val resObj = response.body()
                    if (resObj?.message == "true") {
                        val intent = Intent(this@LoginActivity, MainActivity::class.java)
                        intent.putExtra("username", username)
                        startActivity(intent)

                    } else {
                        Toast.makeText(this@LoginActivity, "The username or password is incorrect", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(this@LoginActivity, "Error! Please try again!", Toast.LENGTH_SHORT).show()
                }

            }
            override fun onFailure(call: Call<ResObj>?, t: Throwable?) {
                Toast.makeText(this@LoginActivity, t!!.message, Toast.LENGTH_SHORT).show()
            }
        })
        }
*/
    private fun doLogin(u: String, p: String) {
        val call = userService.login(u, p)
        call.enqueue(object : Callback<ResObj> {
            override fun onResponse(call: Call<ResObj>, response: Response<ResObj>) {
                if (response.isSuccessful) {
                    val resObj = response.body()
                    if (resObj!!.message == "true") {
                        //login start main activity
                        val intent = Intent(this@LoginActivity, MainActivity::class.java)
                        intent.putExtra("username", username)
                        startActivity(intent)

                    } else {
                        Toast.makeText(this@LoginActivity, "The username or password is incorrect", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(this@LoginActivity, "Error! Please try again!", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<ResObj>, t: Throwable) {
                Toast.makeText(this@LoginActivity, t.message, Toast.LENGTH_SHORT).show()
            }
        })
    }


    fun toast(message: String, length:Int = Toast.LENGTH_LONG)
    {
        Toast.makeText(this,message,length).show()
    }


}


