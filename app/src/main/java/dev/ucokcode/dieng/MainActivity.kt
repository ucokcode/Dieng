package dev.ucokcode.dieng

import android.os.Bundle
import android.transition.ChangeBounds
import android.transition.TransitionManager
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var mgunung: TextView
    private lateinit var igunung: ImageView
    private lateinit var mwisata: Button
    private lateinit var mframe: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animFadeIn = AnimationUtils.loadAnimation(applicationContext, R.anim.fade_in)

        igunung = findViewById(R.id.bg_gunung_dieng)
        mwisata = findViewById(R.id.btn_paket_wisata)
        mgunung = findViewById(R.id.menu_title)
        mframe = findViewById(R.id.frame1)

        mwisata.setOnClickListener(this)
        mgunung.setOnClickListener(this)
        mframe.setOnClickListener(this)

        igunung.startAnimation(animFadeIn)

    }

    override fun onClick(view: View) {
        val handlerTranstion: (ViewGroup, Int) -> Unit = { v, size ->
            val transition = ChangeBounds()
            transition.duration = 120
            TransitionManager.beginDelayedTransition(v, transition)
            v.apply {
                requestLayout()
                layoutParams.height = size
            }
        }
        when (view.id) {
            R.id.frame1 -> {
                mwisata.apply {
                    if (visibility == View.INVISIBLE) {
                        handlerTranstion(mframe, 800)
                        visibility = View.VISIBLE
                    }
                }
            }
            R.id.btn_paket_wisata -> {
                handlerTranstion(mframe, 400)
                mwisata.visibility = View.INVISIBLE
            }
            R.id.menu_title -> {
                val dialog = BottomSheetDialog(this)
                val menu_dialog = layoutInflater.inflate(R.layout.menu, null)
                with(dialog) {
                    setContentView(menu_dialog)
                    show()
                }
            }
        }
    }
}