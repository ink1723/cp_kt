package com.example.cp_kt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home_page.*

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        btn_to_passport.setOnClickListener {
            startActivity(Intent(this,passport::class.java))
        }
        btn_to_realName.setOnClickListener {
            startActivity(Intent(this,realName::class.java))
        }
    }
}