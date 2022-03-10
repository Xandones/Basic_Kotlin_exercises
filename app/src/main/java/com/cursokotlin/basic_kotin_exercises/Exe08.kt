package com.cursokotlin.basic_kotin_exercises

fun main()
{
    var iphone3000 = MobilePhone1("iOS", "Apple", "3000")
    var redminote4 = MobilePhone1("Android", "Xiaomi", "Redmi Note 4")
    var galaxys20ultra = MobilePhone1("Android", "Samsung", "Galaxy S20 Ultra")
}

class MobilePhone1 constructor(osName : String, brand : String, model : String)
{
    init {
        println("Novo objeto MobilePhone1 criado da empresa: $brand, modelo: $model e Sistema Operacional: $osName ")
    }
}