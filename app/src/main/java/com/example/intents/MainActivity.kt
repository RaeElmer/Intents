package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val logIn = findViewById<Button>(R.id.logIn)
        val userName = findViewById<EditText>(R.id.userName)
        val password = findViewById<EditText>(R.id.password)

        logIn.setOnClickListener {
            if (userName.text.toString()
                            .equals("Rae_Elmer") && password.text.toString().equals("Buyao123")
            ) {

                Toast.makeText(this, "Redirecting...", Toast.LENGTH_SHORT).show();
                val intent = Intent(
                        this@MainActivity,
                        MainActivity2::class.java
                ) // redirecting to LoginActivity.
                startActivity(intent)

            } else {
                Toast.makeText(this, "logIn Failed", Toast.LENGTH_SHORT).show();
            }
        }
    }
}