package com.example.myapplication.viewmodel

import com.example.myapplication.model.RestaurantCalculator
import com.example.myapplication.model.TipCalculation

class CalculatorViewModel(private val calculation: RestaurantCalculator = RestaurantCalculator()) {
    var inputCheckAmount = ""
    var inputTip = ""
    var tipCalculation = TipCalculation()

    fun calculateTip() { // on click of fab icon
        val checkamt = inputCheckAmount.toDoubleOrNull()
        val tipPercent = inputTip.toIntOrNull()
        if (tipPercent != null && checkamt != null) {
            tipCalculation = calculation.calculateTip(checkamt, tipPercent)
        }
    }
}