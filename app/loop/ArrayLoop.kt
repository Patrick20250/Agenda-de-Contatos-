package com.patrick.aulaudemy.com.patrick.aulaudemy.com.patrick.aulaudemy.loop


// while enquanto


fun main() {

/*

    var nomes = arrayOf("Flavio","Ana")
    nomes [0] =  "novo valor"
    println(nomes[0])

*/


//estruturas de repetição


  /*  var numero = 0
// tem como utilizar o in dentro de um while while (numero in 0..8)
    while (numero <=5) {

        println("Executado: $numero")
        numero ++

    }
*/
  /*  // Usnado for não e prepciso criar Variaveis de apoio voce coloca o nome dentro do colcheve e percorre os números dentro dela
    for (numero:Int in 0..5){ // usndo o for com o in

        println(numero)

    }*/

    // pára que imprima o indice junto com o objeto desejado colocamos a variavel dentro do colchet(()) criamos uma nova variavel pode ser qualquer nome
    // porem e melhor colocar o i for((i,postagen)in postagens).withIndex() e fazer a chamada do i
    // val nomes:String = arrayOf("Mario", "Joao") Sem especificar o tipo do Array

  /*  val postagens: Array<String> = arrayOf("Viagem a Roma", "Viagem para Salvador") // Especificando o tipo do array

    // par que voce imprima todos os valores dentro de um array chamamos a variavel que eta o array colocamos o in e chamamos o array novamente
    for ((i,postagen) in postagens.withIndex() ){
        println("Postou:$postagen, index: $i")

    }*/
    //Armazena notas de 5 alunos em um array.
    val notasAluno = arrayOf(7.5,5.5,3.8,10.0,9,8,)

    //Usar um loop for para exibir todas as notas.
    for (aluno in notasAluno){
        println(aluno)
    }



}