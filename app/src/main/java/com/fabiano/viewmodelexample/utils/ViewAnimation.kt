package com.fabiano.viewmodelexample.utils

import android.content.Context
import android.os.Handler
import android.util.TypedValue
import android.view.View
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.core.view.isVisible
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo

object ViewAnimation {
    var baseDurationAnime: Long = 1100

    fun slideInRight(view: View, delay: Long = 0, duration: Long = baseDurationAnime) {
        view.isVisible = false
        Handler().postDelayed({
            YoYo.with(Techniques.SlideInRight)
                .duration(duration)
                .interpolate(AccelerateDecelerateInterpolator())
                .onStart {
                    view.visibility = View.VISIBLE
                }
                .playOn(view)
        }, delay)
    }

    fun slideInLeft(view: View, delay: Long = 0, duration: Long = baseDurationAnime) {
        view.isVisible = false
        Handler().postDelayed({
            YoYo.with(Techniques.SlideInLeft)
                .duration(duration)
                .interpolate(AccelerateDecelerateInterpolator())
                .onStart {
                    view.visibility = View.VISIBLE
                }
                .playOn(view)
        }, delay)
    }

    fun fadeInUp(view: View, delay: Long = 0, durationAnimation: Long = baseDurationAnime) {
        view.visibility = View.INVISIBLE
        Handler().postDelayed({
            YoYo.with(Techniques.FadeInUp)
                .duration(durationAnimation)
                .interpolate(AccelerateDecelerateInterpolator())
                .onStart {
                    view.visibility = View.VISIBLE
                }
                .playOn(view)
        }, delay)
    }


    fun fadeInDown(view: View, delay: Long = 0, durationAnimation: Long = baseDurationAnime) {
        view.visibility = View.INVISIBLE
        Handler().postDelayed({
            YoYo.with(Techniques.FadeInDown)
                .duration(durationAnimation)
                .interpolate(AccelerateDecelerateInterpolator())
                .onStart {
                    view.visibility = View.VISIBLE
                }
                .playOn(view)
        }, delay)
    }
}