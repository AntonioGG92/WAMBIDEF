package com.example.wambishop

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.wambishop.R.*

/**
 * Loads Register Activity for user registration.
 */
class RegisterActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_register)



        val volverinicio = findViewById<Button>(id.boton_volver_login);

        volverinicio.setOnClickListener{
            val intent = Intent(this@RegisterActivity, MainActivity ::class.java)
            startActivity(intent)
        }


    }



}
