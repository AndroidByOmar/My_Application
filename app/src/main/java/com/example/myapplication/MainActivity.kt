package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.TextView
import android.widget.Toast

 class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val myclick = findViewById<Button>(R.id.button)
        val textView=findViewById<TextView>(R.id.textView)
        val txt=findViewById<TextView>(R.id.txt22)
        myclick.setOnClickListener {
           // Toast.makeText(this,"my event",Toast.LENGTH_SHORT).show()
            var mem=txt.text.toString()
            textView.text=mem.toString()
        }
        Toast.makeText(this,"my app",Toast.LENGTH_SHORT).show()
        myclick.setOnLongClickListener(){
            Toast.makeText(this,"my long event",Toast.LENGTH_SHORT).show()
            true
        }

    }//End fun of Oncreate


}