package dev.ucokcode.dieng.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.ucokcode.dieng.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)

        val intent = Intent(applicationContext, MainActivity::class.java)

        startActivity(intent)
        finish()
    }
}