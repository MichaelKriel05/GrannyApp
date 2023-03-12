package com.example.grannyapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class UserData
{
        var aName = ArrayList<String>()
        var aPassword = ArrayList<String>()

        fun AddOldUsers() {
            aName.add("Michael")
            aPassword.add("1234")
        }

        fun AddNewUser(Name: String, Password: String) {
            aName.add(Name)
            aPassword.add(Password)
        }

        fun checkUser(Name: String, Password: String): Boolean {
            var bLoop = false
            for (i in 0..aName.size) {
                if ((aPassword[i].equals(Password)) && (aName[i].equals(Name))) {
                    bLoop = true
                }
            }
            return bLoop
        }
}

