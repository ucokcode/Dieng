/*
 * *
 *  * Created by Harapan Pardamean on 9/11/20 9:38 PM
 *  * Copyright (c) 2020 . All rights reserved.
 *  * Last modified 9/11/20 3:49 AM
 *  
 */

package dev.ucokcode.dieng

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("dev.ucokcode.dieng", appContext.packageName)
    }
}