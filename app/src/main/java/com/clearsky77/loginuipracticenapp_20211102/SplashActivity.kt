package com.clearsky77.loginuipracticenapp_20211102

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val myHandler = Handler(Looper.getMainLooper())

        myHandler.postDelayed({ //Runnable
            val myIntent = Intent(this, MainActivity :: class.java)
            startActivity(myIntent) // 인텐트로 얹어주고
            finish() // 이 splash는 없앤다
            // 그렇지 않으면 뒤로 버튼 누르면 나타난다.
        },2500)

    }
}