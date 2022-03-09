package com.cursokotlin.basic_kotin_exercises

fun main()
{
    var redminote4 = MobilePhone("Android", "Xiaomi", "Redmi Note 4")
    redminote4.chargeBattery(30)
}

class MobilePhone(osName: String, brand: String, model: String){

    private var battery = 0

    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }

    fun chargeBattery(chargedBy: Int){
        println("Battery was at $battery and is at ${battery+chargedBy} now")
        battery += chargedBy
    }
}