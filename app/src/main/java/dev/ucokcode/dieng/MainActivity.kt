package dev.ucokcode.dieng

import android.os.Bundle
import android.transition.ChangeBounds
import android.transition.TransitionManager
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var mgunung: TextView
    private lateinit var igunung: ImageView
    private lateinit var mwisata: Button
    private lateinit var mframe: FrameLayout
    private lateinit var mlogo: LinearLayout
    private var isClicked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animFadeIn = AnimationUtils.loadAnimation(applicationContext, R.anim.fade_in)

        igunung = findViewById(R.id.bg_gunung_dieng)
        mwisata = findViewById(R.id.btn_paket_wisata)
        mgunung = findViewById(R.id.menu_title)
        mframe = findViewById(R.id.frame1)
        mlogo = findViewById(R.id.logo)

        mwisata.setOnClickListener(this)
        mgunung.setOnClickListener(this)
        mframe.setOnClickListener(this)

        igunung.startAnimation(animFadeIn)

    }

    fun handleClick(size: Int) {
        val transition = ChangeBounds()
        transition.duration = 120
        TransitionManager.beginDelayedTransition(frame1, transition)
        frame1.apply {
            requestLayout()
            layoutParams.height = size
        }
        mwisata.apply {
            visibility = if (isClicked == true) {
                View.VISIBLE
            } else View.INVISIBLE
            isClicked = !isClicked
        }
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.frame1 -> if (isClicked == true) {
                handleClick(800)
            }
            R.id.btn_paket_wisata -> handleClick(400)
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