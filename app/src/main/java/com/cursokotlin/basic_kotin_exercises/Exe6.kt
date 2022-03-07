package com.cursokotlin.exe5kotlin

fun main()
{
    /*
    Função para regular o nível de  humidade de um local.

    Function to set the humidity level in a place.
     */
    var umidade = "Úmido"
    var nivel_Umidade = 80

    while (umidade == "Úmido")
    {
        nivel_Umidade -= 5
        println("Nível de umidade diminúido para $nivel_Umidade")
        if (nivel_Umidade < 60)
        {
            println("Está confortável agora.")
            umidade = "confortável"
        }
    }
}