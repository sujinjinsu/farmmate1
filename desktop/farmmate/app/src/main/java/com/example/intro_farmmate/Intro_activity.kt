package com.example.intro_farmmate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class Introlactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        var handler = Handler()
        handler.postDelayed({
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        },5000)
    }
    override fun onPause(){
        super.onPause()
        finish()
    }
}
