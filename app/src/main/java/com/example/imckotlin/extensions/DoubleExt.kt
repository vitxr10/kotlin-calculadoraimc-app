package com.example.imckotlin.extensions

class DoubleExt {
    fun Double.format(digits: Int) = java.lang.String.format("%.${digits}f", this)
}