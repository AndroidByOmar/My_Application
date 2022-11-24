package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val myNewEvent = findViewById<Button>(R.id.button)
        val button = findViewById<Button>(R.id.button2)
        val textView=findViewById<TextView>(R.id.textView)
        val txt=findViewById<TextView>(R.id.txt22)
        myNewEvent.setOnClickListener {
           // Toast.makeText(this,"my event",Toast.LENGTH_SHORT).show()
            val mem=txt.text.toString()
            textView.text=mem
        }
        Toast.makeText(this,"my app",Toast.LENGTH_SHORT).show()
        myNewEvent.setOnLongClickListener{
            Toast.makeText(this,"my long event",Toast.LENGTH_SHORT).show()
            true
        }
  // add timepicker
        button.setOnClickListener {
            val intint= Intent(this,SecandActivity::class.java)
            startActivity(intint)
        }

    }//End fun of create_Home


}