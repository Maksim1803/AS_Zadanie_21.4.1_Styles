package com.example.zadanie2141_styles

import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val textView = TextView(ContextThemeWrapper(this, R.style.ButtonStyle))
        textView.text = "Goodbye World"


        textView.setOnClickListener {

        val textView2 = TextView(ContextThemeWrapper(this, R.style.ButtonStyle2))
        textView2.text = "Bye World"

        }
    }
        fun onClickToast(view: View) {
            Toast.makeText(this, "Я буду android-разработчиком!", Toast.LENGTH_SHORT).show()
        }
    }
