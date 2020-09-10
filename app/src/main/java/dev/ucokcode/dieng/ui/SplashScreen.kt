/*
 * *
 *  * Created by Harapan Pardamean on 9/11/20 12:25 AM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 9/11/20 12:24 AM
 *
 */

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