package com.example.calculator

sealed class CalculatorOperation (val symbol :String){
    object add : CalculatorOperation("+")
    object subtract: CalculatorOperation("-")
    object multiply: CalculatorOperation("x")
    object divide: CalculatorOperation("/")
}