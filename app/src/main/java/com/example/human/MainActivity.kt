package com.example.human

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var human = Human("たろう", 25)
        human.say()
        var human2 = Human("じろう", 23)
        human.say()
        var human3 = Human(hobby = "命")
        human2.think()
        var human4 = Human(hobby = "地球")
        human3.think()


    }

}
