package com.example.grannyapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.File

class RegisterActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register)

        var txtRegName : EditText = findViewById(R.id.txtRegName)
        var txtRegUsername : EditText = findViewById(R.id.txtRegUsername)
        var txtRegPassword : EditText = findViewById(R.id.txtRegPassword)
        var txtRegRepassword : EditText = findViewById(R.id.txtRegRepassword)
        var btnSubmit : Button = findViewById(R.id.btnRegSubmit)

        btnSubmit.setOnClickListener()
        {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}