package dev.ucokcode.dieng

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import kotlin.concurrent.timerTask

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)
        val intent = Intent(this, MainActivity::class.java)

        Timer().schedule(timerTask {
            startActivity(intent)
            finish()
        }, 2000)
    }
}