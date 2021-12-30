package com.rihsi.dyno.undraw

import android.graphics.Color

class ColorChooser(var color: String) {

    fun getColor(): Int {
        return Color.parseColor(color)
    }
}
