package com.fati.technoformat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        btn_login.setOnClickListener {

            Toast.makeText(this, "welcome", Toast.LENGTH_LONG).show()


            startActivity(Intent(this, MainActivity2::class.java))
        }
    }
}