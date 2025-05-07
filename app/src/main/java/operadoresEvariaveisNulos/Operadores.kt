package com.patrick.aulaudemy.com.patrick.aulaudemy.com.patrick.aulaudemy.operadoresEvariaveisNulos


//operadores aritimeticos e nuilos


// Precedencia de operadores
/*

1) parênteses
2) Multiplicação e divisão
3) Subtração e adição
*/



fun main(){
/*
*//*
    val n1: Int = 10
    val n2: Int= 20*//*
    //val resultado = (2 + 2) * 2 // quando uim valor esta dentro de um colchete ele tem uma priodade aqui primeiro faz a soma depois a multiplicação
    //val resultado = 2 + 2 * 2 // quando não usamos os colchetes ele multiplica depois faz asoma



*//*
    val resultado= 10.75F==10.75F || 10.95F !=10.95F

     println(!resultado)
*//*



    // se Voce quer que as duas seja verdadeira utilçiza o && "e"
    // se voce quer que uma seja verdadeira usa o || "ou"
    // o perador de negação "!" ele nega indenpendente do resultado pois o não se sobre sai encima do sim. ele é usando dentro da chamada da variavel usado dentro de if
val idadePessoa =25
val compraPessoa = 500

val resultado = idadePessoa >=25  || compraPessoa >= 500


println("Voce ganhou o desconto ${!resultado}") // chamando o operador de negação*/

//Recebe dois números inteiros.
    val numer1:Int = 40

    val numero2:Int = 60


   // Mostra a soma, subtração, multiplicação, divisão e o resto da divisão desses números.
    println("soma: ${ numer1 + numero2 }")
    println("subtracao: ${ numer1  -  numero2 }")
    println("multiplicacoa: ${ numer1 * numero2 }")
    println("Divisao: ${ numer1  / numero2 }")
    println("Resto da divisao: ${ numer1  %  numero2 }")



    //Compara se os números são iguais, diferentes, maior ou menor.

    println("${numer1 == numero2}")

    //Usa lógica para verificar condições como:




    println("Ambos sao positivos ${numer1 >0 && numero2 >0}")
    println("  Algum deles 2 multiplo de 5? ${numer1 %5 ==0 || numero2 %5 == 0 }")
    println("  Algum deles 2 multiplo de 5? ${numer1 %2 ==0 || numero2 %2 ==0}")

}