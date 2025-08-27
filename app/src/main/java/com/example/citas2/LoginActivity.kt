package com.example.citas2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val registrarse: Button = findViewById(R.id.registrarse)

        registrarse.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        val recuperar: Button = findViewById(R.id.recuperarContraseña)

        recuperar.setOnClickListener {
            val intent = Intent(this, RecuperationActivity::class.java)
            startActivity(intent)
        }
    }
}