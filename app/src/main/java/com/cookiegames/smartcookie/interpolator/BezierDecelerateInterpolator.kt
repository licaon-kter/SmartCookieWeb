package com.cookiegames.smartcookie.interpolator

import androidx.core.view.animation.PathInterpolatorCompat
import android.view.animation.Interpolator

/**
 * Bezier decelerate curve similar to iOS.
 * On Kitkat and below, it reverts to a
 * decelerate interpolator.
 */
class BezierDecelerateInterpolator : Interpolator {

    companion object {
        private val PATH_INTERPOLATOR: Interpolator = androidx.core.view.animation.PathInterpolatorCompat.create(0.25f, 0.1f, 0.25f, 1f)
    }

    override fun getInterpolation(input: Float): Float {
        return PATH_INTERPOLATOR.getInterpolation(input)
    }

}