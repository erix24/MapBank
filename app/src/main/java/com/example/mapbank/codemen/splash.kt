package com.example.mapbank.codemen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mapbank.R
import com.example.mapbank.codemen.login.LoginActivity

class splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val backgraund = object : Thread(){
            override fun run() {
                try {
                 Thread.sleep(5000)
                    val intent =Intent(baseContext, LoginActivity::class.java)
                    startActivity(intent)
                } catch (e:Exception){
                    e.printStackTrace()

                }
            }

        }
        backgraund.start()
    }
}
