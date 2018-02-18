package com.usingspinnercontrol.week6

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //bind objects
        val btnMainMenu = findViewById<Button>(R.id.btnMainMenu)

        btnMainMenu.setOnClickListener(View.OnClickListener {
            //Intent used to send info between activities
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        })

    }
}
