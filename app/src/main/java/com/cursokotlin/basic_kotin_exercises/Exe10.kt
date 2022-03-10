package com.cursokotlin.basic_kotin_exercises

fun main()
{
    // Declares an Array List and poulates it with 5 Double type numbers
    val numericArrayList = ArrayList<Double>()
    numericArrayList.add(2.0)
    numericArrayList.add(2.5)
    numericArrayList.add(4.0)
    numericArrayList.add(4.5)
    numericArrayList.add(6.0)

    // Calculates the average of the 5 members and shows the result
    var average : Double = 0.0
    for (i in numericArrayList)
    {
        average += i
    }
    println("The array is $numericArrayList")
    println("The average of the members of the Array List is ${average/numericArrayList.size}")
}