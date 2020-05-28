package com.example.loginform

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val email = findViewById(R.id.txtemail) as EditText
        val pass = findViewById(R.id.txtpass) as EditText
        val loginClick = findViewById(R.id.btnLogin) as Button
        loginClick.setOnClickListener {

        //read value from EditText to a String variable
            val ema: String = email.text.toString()
            val pwd: String = pass.text.toString()
            //check if the EditText have values or not
            if (ema.trim().length == 0) {
                Toast.makeText(applicationContext, "Email field cannot be empty",
                    Toast.LENGTH_SHORT).show()
            }
            if (pwd.trim().length == 0) {
                Toast.makeText(applicationContext, "Password field cannot be empty", Toast.LENGTH_SHORT).show()
            }
            if (ema.equals("chris@gmail.com")&&(pwd.equals("12345"))){
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            } else{
                Toast.makeText(applicationContext, "Wrong Email or Password!!",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }
}


