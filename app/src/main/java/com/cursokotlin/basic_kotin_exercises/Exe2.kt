package com.cursokotlin.basic_kotin_exercises

fun main()
{
    var idade = 1

    /*
    Exercício para informar o que o usuário pode fazer com cada idade.
    Como as preposições if/else if/else são mutuamente exclusivas deve-se colocar cada uma em ordem decrescente.

    Exercise to inform what the user can do which each age.
    Since the prepositions if/else if/else are mutually exclusive you should put them in descending order.
     */
    if (idade >= 21)
    {
    println("Você atingiu a maioridade plena")
    }
    else if (idade >= 18)
    {
        println("Você pode beber")
    }
    else if (idade >= 16)
    {
        println("Você pode votar")
    }
    else
    {
        println("Você é menor de idade")
    }
}