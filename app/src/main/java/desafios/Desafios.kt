package com.patrick.aulaudemy.desafios



fun main(){
    //Desafio 1
    //Crie uma variável nome do tipo String com seu nome.
    val nome: String= "Lucas"
    //Crie uma variável idade do tipo Int com sua idade.
    var idade: Int = 16
    //Crie uma variável altura do tipo Double com sua altura.
    val altura: Double = 1.70
    //Modifique a idade (use var) e exiba novamente a mensagem com a nova idade.
    idade = 29
   // Exiba os dados no formato: Nome: [nome], Idade: [idade], Altura: [altura].
    println("nome $nome idade: $idade altura:$altura")


    //Desafio 2
    //Crie duas variáveis, a e b, e atribua valores inteiros a elas.
    val a:Int = 10
    val b:Int=20

    //Calcule e imprima:
    println("soma de: ${a + b}")
    println("subtracao de: ${a - b}")
    println("multiplicacao de: ${a * b}")
    println("divisao de: ${a / b}")
    println("resto da divisao de: ${a % b}")
    //Compare se a é maior que b e exiba a resposta (verdadeira ou falsa).
    println("Comparacao de maior: ${a >= b}")
    println("Comparacao de igualdade: ${a == b}")

    //Desafio 3

   // Crie uma variável nota do tipo Double.

    val nota: Float = 1.0F


    if (nota >=7.0){
        println("Aprovado $nota")

    }else if (nota >=5.0 && nota <7.0){
        println("Recuperacao: $nota")
    }else{
        println("reprovado:$nota")
    }

    //Ainda não sei mecher com o readLine()


    //Crie um array de 5 números inteiros (por exemplo, de 10 a 50).

    val numero: Array<Int> = arrayOf(10,20,30,40,50)
    var somaTotal = 0

    //Use um loop for para imprimir todos os valores do array.

   for (item in numero){
        //Calcule a soma de todos os elementos e imprima o resultado.
      somaTotal +=item

    }
    println("numero:$somaTotal ")



//Crie uma variável contador com valor 1.
    var contador:Int = 1
    //Crie uma variável soma e acumule a soma dos números de 1 até 10 dentro do loop.
    var soma:Int = 0


    //Use um loop while para imprimir os números de 1 até 10.
    while (contador <=10){

       println(contador)

        soma +=contador
        contador ++


    }
    println(soma)




    //Desafio: Analisando Números de um Array

    //Crie um array de 8 números inteiros (você escolhe os números).

    val numeros: Array<Int> = arrayOf(1,2,3,4,5,6,7,8)
    var acumulaNumeroPares= 0
    var acumulaNumerosImpares = 0

    for (acumulo in numeros  ){

        if (acumulo %2 ==0 ){
         acumulaNumeroPares += acumulo
        }else {
         acumulaNumerosImpares += acumulo
        }

    }

    println("numero Pares: $acumulaNumeroPares")
    println("numeros Impares: $acumulaNumerosImpares")





    val iteiros: Array<Int> = arrayOf(1,-2,-3,0,-6,0,-8,9,-10)
    var somaNumeroPositivos = 0
    var acumulaSomaDosNumerosNegativos = 0
    var contaZeroExisteNoArray = 0


    for (i in iteiros){
        println("resultado do arrai:$i")
        if(i >0){
            somaNumeroPositivos += i
        }else if (i <0){
            acumulaSomaDosNumerosNegativos +=i
        }else {
            contaZeroExisteNoArray +=1
        }
    }
    println(" Positivos ${somaNumeroPositivos}")
    println(" Negativos ${acumulaSomaDosNumerosNegativos}")
    println(" quantidade de Zeros ${contaZeroExisteNoArray}")


    val tentativas=0

    /*while (chute!= numeroSecreto){
        tentativas + 1

    }*/


}