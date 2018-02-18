package com.usingspinnercontrol.week6

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //bind objects
        val btnSettings = findViewById<Button>(R.id.btnSettings)

        btnSettings.setOnClickListener(View.OnClickListener {
            //Intent used to send info between activities
            val intent = Intent(this, Main2Activity::class.java)
            //
            startActivity(intent)
        })

        val spin = findViewById<Spinner>(R.id.spinner)
        val txtFullName = findViewById<EditText>(R.id.txtFullName)
        val txtEmail = findViewById<EditText>(R.id.txtEmail)
        val txtShow = findViewById<TextView>(R.id.txtShow)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val list = arrayOf ("Nano Drone", "Mini Drone", "Quad Drone", "Delivery Drone")
        val adapter1 = ArrayAdapter <String> (this, android.R.layout.simple_list_item_multiple_choice, list)
        android.R.layout.simple_spinner_item
        android.R.layout.simple_spinner_item
        spin.adapter = adapter1
        btnSubmit.setOnClickListener {
            when (spin.selectedItem.toString()){
                "Nano Drone" -> txtShow.text = "Name: ${txtFullName.text.toString()} Email ${txtEmail.text.toString()} The drone you selected is: Nano Drone"
                "Mini Drone" -> txtShow.text = "Name: ${txtFullName.text.toString()} Email ${txtEmail.text.toString()} The drone you selected is: Mini Drone"
                "Quad Drone" -> txtShow.text = "Name: ${txtFullName.text.toString()} Email ${txtEmail.text.toString()} The drone you selected is: Quad Drone"
                "Delivery Drone" -> txtShow.text = "Name: ${txtFullName.text.toString()} Email ${txtEmail.text.toString()} The drone you selected is: Delivery Drone"
            }
            hideKeyboard()
        }
    }
    //function to hide keyboard
    //import android.content.Context
    //import android.view.inputmethod.InputMethodManager
    fun hideKeyboard() {
        try {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        } catch (e: Exception) {
            //ToDo: handle exception
        }
    }
}
