package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.Toast

 class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val myclick = findViewById<Button>(R.id.button)
        myclick.setOnClickListener {
            Toast.makeText(this,"my event",Toast.LENGTH_SHORT).show()
        }
        Toast.makeText(this,"my app",Toast.LENGTH_SHORT).show()
        myclick.setOnLongClickListener(){
            Toast.makeText(this,"my long event",Toast.LENGTH_SHORT).show()
            true
        }

    }


}