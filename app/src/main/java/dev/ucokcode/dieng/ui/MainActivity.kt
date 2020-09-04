package dev.ucokcode.dieng.ui

import android.os.Bundle
import android.transition.ChangeBounds
import android.transition.TransitionManager
import android.view.View
import android.view.animation.AnimationUtils
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.google.android.material.bottomsheet.BottomSheetDialog
import dev.ucokcode.dieng.R
import dev.ucokcode.dieng.viewModel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animFadeIn = AnimationUtils.loadAnimation(applicationContext, R.anim.fade_in)
        handleView()

        btn_paket_wisata.setOnClickListener(this)
        menu_title.setOnClickListener(this)
        frame1.setOnClickListener(this)

        bg_gunung_dieng.startAnimation(animFadeIn)
    }

    override fun onBackPressed() {
        viewModel.setClick(false)
    }

    private fun handleView() {
        viewModel.run {
            getClick().observe(this@MainActivity, Observer<Boolean> {
                btn_paket_wisata.apply {
                    visibility = if (it) View.INVISIBLE else View.VISIBLE
                }
            })
            getBackgroundSize().observe(this@MainActivity, {
                val transition = ChangeBounds()
                transition.duration = 120
                TransitionManager.beginDelayedTransition(frame1, transition)
                frame1.apply {
                    requestLayout()
                    layoutParams.height = it
                }
            })
        }
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btn_paket_wisata -> viewModel.setClick()
            R.id.menu_title -> {
                val dialog = BottomSheetDialog(this)
                val menuDialog = layoutInflater.inflate(R.layout.menu, null)
                with(dialog) {
                    setContentView(menuDialog)
                    show()
                }
            }
        }
    }
}
