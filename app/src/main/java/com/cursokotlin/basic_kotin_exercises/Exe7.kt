package com.cursokotlin.basic_kotin_exercises

fun main()
{
    val a = 8.0
    val b = 2.0
    println("A média entre $a e $b é ${average(a,b)}")
}

/*
    Função que soma 2 valores
    Function that adds 2 values.
 */
fun addUp(a : Double, b: Double) : Double
{
    return a + b
}

/*
    Função que calcula a média entre 2 valores.
    Function that calculates the average between 2 values.
 */
fun average(a : Double, b: Double) : Double
{
    return (addUp(a,b) / 2)
}