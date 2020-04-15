package com.example.myapplication.model

import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class RestaurantCalTest {
    lateinit var calculator: RestaurantCalculator

    @Before
    fun setup() {
        calculator = RestaurantCalculator()
    }

    @Test
    fun testCalculatorTip() {
        val baseTipCal = TipCalculation(checkAmount = 10.00)
        val testVal = listOf(baseTipCal.copy(tipPercentage = 15,tipAmount = 1.5,grandTotal = 11.50),
            baseTipCal.copy(tipPercentage = 18,tipAmount = 1.8,grandTotal = 11.80) )
//        val checkInput = 10.00
//        val tipPercent = 25
        testVal.forEach{
//            val expectedResult = TipCalculation(
//                checkInput,
//                tipPercent,
//                tipAmount = 2.50,
//                grandTotal = 12.50
//            )
            assertEquals(it, calculator.calculateTip(it.checkAmount, it.tipPercentage))
        }


    }
}