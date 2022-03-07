package com.cursokotlin.exe5kotlin

fun main()
{
    /*
    Função que conta de 1 até 10000 e exibe 'IT'S BIGGER THAN 9000!' a partir de 9001.

    Function that counts from 1 until 10000 and shows 'IT'S BIGGER THAN 9000!' from 9001.
     */
    for (num in 1..10000) {
        print("$num ")
        if (num > 9000)
           println("IT'S BIGGER THAN 9000!")
    }
}