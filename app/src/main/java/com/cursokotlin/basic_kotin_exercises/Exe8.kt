package com.cursokotlin.basic_kotin_exercises

fun main()
{
    var iphone3000 = MobilePhone("iOS", "Apple", "3000")
    var redminote4 = MobilePhone("Android", "Xiaomi", "Redmi Note 4")
    var galaxys20ultra = MobilePhone("Android", "Samsung", "Galaxy S20 Ultra")
}

class MobilePhone constructor(osName : String, brand : String, model : String)
{
    init {
        println("Novo objeto MobilePhone criado da empresa: $brand, modelo: $model e Sistema Operacional: $osName ")
    }
}