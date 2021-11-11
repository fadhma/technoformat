package com.fati.technoformat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar?.hide()
        btn_student.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }
        btn_log.setOnClickListener {
            startActivity(Intent(this, MainActivity4::class.java))
        }

    }
}