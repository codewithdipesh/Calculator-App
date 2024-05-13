package com.example.calculator

data class CalculateState(
    val number1: String ="",
    val number2: String ="",
    val operation: CalculatorOperation? =null
)