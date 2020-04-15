package com.example.myapplication.model

import java.math.RoundingMode

class RestaurantCalculator {

    fun calculateTip(checkAmount: Double, tipPercent: Int): TipCalculation {
        val tipAmt = (checkAmount * (tipPercent.toDouble()) / 100)
            .toBigDecimal()
            .setScale(2,RoundingMode.HALF_UP)
            .toDouble()
        val total = checkAmount + tipAmt
        return TipCalculation(checkAmount, tipPercent, tipAmt, total)
    }
}