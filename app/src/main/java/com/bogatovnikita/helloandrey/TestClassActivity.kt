package com.bogatovnikita.helloandrey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TestClassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_class)
        var user = User(1)
        user.name = "Nikita"
        user.lastname = "Bogatov"
        user.age = 30

        val nameTv = findViewById<TextView>(R.id.name_tv)
        nameTv.text = "Имя " + user.name

        val lastnameTv = findViewById<TextView>(R.id.lastname_tv)
        lastnameTv.text = "Фамилия " + user.lastname

        val ageTv = findViewById<TextView>(R.id.age_tv)
        ageTv.text = "Возраст " + user.age.toString()

        var userSecond = user.copy()

        val countTv = findViewById<TextView>(R.id.count_tv)
        for (i in 1..10) countTv.text = countTv.text.toString() + i.toString()

        val countSecondTv = findViewById<TextView>(R.id.count_second_tv)
        for (i in 100 downTo 1 step 2) countSecondTv.text =
            countSecondTv.text.toString() + i.toString()
    }
}