package com.example.grannyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var loginBtn : Button = findViewById(R.id.Button)
        var registerBtn : Button = findViewById(R.id.Register)
        var txtName : EditText = findViewById(R.id.txtName)
        var txtPassword : EditText = findViewById(R.id.txtPassword)

        loginBtn.setOnClickListener()
        {
            UserData().AddOldUsers()
            var AllowIn:Boolean = UserData().checkUser(txtName.text.toString(),
                txtPassword.text.toString())
            if(AllowIn)
            {
                val intent = Intent(this, Welcome::class.java)
            }
        }
        registerBtn.setOnClickListener()
        {
            setContentView(R.layout.register)
        }
    }
}