package com.example.lesson3humanclass

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("田中", 20, "サッカー")
        human.say()
        human.think()

        val human2 = Human("佐藤", 30, "読書")
        human2.say()
        human2.think()
    }
}
