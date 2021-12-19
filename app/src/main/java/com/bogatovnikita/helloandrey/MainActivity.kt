package com.bogatovnikita.helloandrey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sayHello = findViewById<MaterialButton>(R.id.say_hello)
        sayHello.setOnClickListener {

        }
    }
}