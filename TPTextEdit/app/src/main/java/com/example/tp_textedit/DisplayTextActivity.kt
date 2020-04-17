package com.example.tp_textedit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayTextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_text)

        //get the companion object and add it to the display
        val text = intent.getStringExtra(Constants.INTENT_EXTRA_TEXT)

        //display text, with elvis operator (null safety) https://kotlinlang.org/docs/reference/null-safety.html
        //https://kotlinlang.org/docs/reference/keyword-reference.html
        // take right if left is null
        val displayText = text ?: getString(R.string.editText_default)

        //bind the text to the textview element
        findViewById<TextView>(R.id.textView)!!.text = displayText
    }
}
