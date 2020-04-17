package com.example.tp_textedit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //bind the edit text to the context
        editText = findViewById(R.id.editText)
    }

    fun onNavigationButtonClick(view: View) {
        //load the other "page"
        val intent = Intent(this, DisplayTextActivity::class.java)

        //val text = editText!!.text.toString()// !! is non null assertion, allow to avoid null text
        val text = editText.text.toString()

        //load the text to the constant "static" companion, as extra parameter
        intent.putExtra(Constants.INTENT_EXTRA_TEXT, if (text.isNullOrBlank()) null else text)

        //start the page
        startActivity(intent)
    }

}