package com.example.tp_login

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get the "cache" aka sharedpreferences
        //https://medium.com/@appmattus/caching-made-simple-on-android-d6e024e3726b
        var cache = applicationContext.getSharedPreferences("logins", Context.MODE_PRIVATE);

        //if the cache already contain an email and pswd, navigate to next page
        if (cache.contains("email") && cache.contains("password"))
        {
            var intent = Intent(this, SecondActivity::class.java);
            startActivity(intent);
        }


    }

    //login with another identity
    fun login(view: View)
    {
        //get the "cache"
        var logins = applicationContext.getSharedPreferences("logins", Context.MODE_PRIVATE)

        /*
        TODO : check if its a valid email
        */
        //collect the inputs and put them in the cache
        logins.edit().putString("email", email.text.toString()).apply()
        logins.edit().putString("password", password.text.toString()).apply()

        //navigate to another page
        var intent = Intent(this, SecondActivity::class.java);
        startActivity(intent);
    }
}
