package com.clearsky77.loginuipracticenapp_20211102

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            val txtId = txtId.text.toString()
            val txtPw = txtPassword.text.toString()

            if(txtId == "admin" && txtPw == "qwer") {
                Toast.makeText(this,"로그인에 성공하였습니다.", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "로그인에 실패하였습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}