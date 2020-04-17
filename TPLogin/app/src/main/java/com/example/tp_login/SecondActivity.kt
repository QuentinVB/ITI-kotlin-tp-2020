package com.example.tp_login

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //retrieve the cache
        var logins = applicationContext.getSharedPreferences("logins", Context.MODE_PRIVATE);

        email.text = logins.getString("email", "");
        password.text = logins.getString("password", "");
    }
}