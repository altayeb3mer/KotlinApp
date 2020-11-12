package com.example.kotlinapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val  s:String = "Hi There"
//        val list: List<String> = ArrayList();
//        list.plus(s)
//        for (j in 0..5){
////            print("mmm")
//            Toast.makeText(applicationContext,""+j+" Hello Kotlin Developer",Toast.LENGTH_LONG).show()
//        }
        val  txt:TextView = findViewById(R.id.txt)
        txt.text = "Hello Kotlin ^-^"
        txt.setOnClickListener{
            val intent = Intent(applicationContext,Maps::class.java)
            startActivity(intent)
        }

    }

}