package com.cursokotlin.basic_kotin_exercises

fun main()
{
    /*
    Esta função exibe os números de 100 até zero em contagem regressiva.

    This function shows the numbers from 100 to zero in a countdown.
     */
    var x = 100
    while (x >= 0)
    {
        print("$x ")
        x -= 2
    }
}