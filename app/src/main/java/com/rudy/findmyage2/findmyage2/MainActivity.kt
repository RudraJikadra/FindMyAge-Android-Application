package com.rudy.findmyage2.findmyage2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bAge.setOnClickListener {
            try {
                val yearOfBirth: Int = etDOB.text.toString().toInt()
                val currentYear: Int = Calendar.getInstance().get(Calendar.YEAR)
                val myAge: Int = currentYear - yearOfBirth
                tvAge.text = "You are $myAge years old!!"
            }catch(ex:Exception)
            {
                tvAge.text = "You have to put your date of birth!"
            }
        }
    }
}
