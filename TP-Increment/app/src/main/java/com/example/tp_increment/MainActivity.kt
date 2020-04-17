package com.example.tp_increment

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun add(view : View)
    {
        var Content = textView.text.toString().toInt();
        Content++;

        /*
        textView.text = textView.text.toString().toInt() > 0 ?  (textView.text.toString().toInt() + 1).toString() : "toto";
        * */
        textView.text = Content.toString();

    }
    fun sub(view : View)
    {
        var Content = textView.text.toString().toInt();
        if(Content >0)
        {
            Content--;
        }
        /*
       when (textView.text.toString().toInt() ) {
   0 -> 0
   x > 0 -> x - 1
   else -> throw ...
}
       * */
        textView.text = Content.toString();
    }
}
