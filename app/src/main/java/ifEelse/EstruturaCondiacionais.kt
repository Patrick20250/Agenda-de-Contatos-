package com.patrick.aulaudemy.com.patrick.aulaudemy.com.patrick.aulaudemy.ifEelse

// if se  else if se nao se else se nao when quando
// in dentro de





//Condição

fun main() {
    /*   val notaAluno:Int = 5
       val condicao = notaAluno >= 6



       val opcao:Int? = 4
       if (opcao ==1) {
           println("Digite seu CPF")

       }else if(opcao ==2 ){
           println("Digite RG")
       }else if(opcao ==3){
           println("Digite Cnpj ")
       }else{
           println("Voce nao digitou nada")
       }



    val opcao: Int? = 1
    if (opcao in 1..3) {  //Para validar um intervalo colocamos o ...
        println("Digite opcoes selecionadas 1 a 3")

    }else if(opcao in 4..6){
        println("Opcao selecionada de 4 a 6")
    }

     */

    // when seignifica  ( o valor a testar). para testar o valor colocamos o ->
   /* val opcao: Int? = 10
    when(opcao){
       1-> println("Cartoa de credito")
        2->println("Cartao de debito")
        3->println("Conta Poupanca")
        in 1..4 ->println("Saldo")
       else-> println("Nenhuma opcao selecionada")

     *//*   else -> { // os dois trecho de codigop estão corretos
            if (opcao !in 1..4) {
            println("Nenhuma opcao selecionada")
        } }
*//*
    }
*/

  /*  Descrição:
    Você vai criar um programa que:*/

    //Recebe a idade de uma pessoa.
    val idadePessao:Int = 9



    //Verifica em qual faixa etária ela se encontra, com base nas seguintes regras:


   /* if (idadePessao in 0.. 9){
        println("bebe:$idadePessao")

    }else if(idadePessao in 1..12){
        println("Crianca:$idadePessao")
    }else if(idadePessao in 13 .. 17){
        println("Adolecente:$idadePessao")
    }else if (idadePessao in 18 ..59){
        println("Adulto:$idadePessao")

    }else if (idadePessao >=60){
        println("Idoso:$idadePessao")
    }else{
        println("idade: :$idadePessao Invalida")
    }
*/


    //Desafio when

    when(idadePessao){
        in 0..9 -> println("bebe:$idadePessao")
        in 1..12->  println("crianca:$idadePessao")
        in 13..17->  println("Adolecente:$idadePessao")
        in 18..59->  println("Adulto:$idadePessao")
        else-> println("Idoso:$idadePessao")
        /*else-> {
            if (idadePessao >=60){
            println("Idoso:$idadePessao")}
        }*/
    }



}
