package com.patrick.aulaudemy.com.patrick.aulaudemy.com.patrick.aulaudemy.operadoresEvariaveisNulos

// Por padrão a variavel em Kotlin já vem com valor não nulo

// para que uma variavel receba valores nulos tem que colocar o ? depois do tipo da variavel

//Ex de String Nulas aqui ela pode receber um texto ou valores nulos


class Carro{

    val modelo: String? = null

    val cor: String? = null

    // para criar metodos usamos fun

    fun acelerar(){

        //***
    }



}


//Desafio criar uma classe de Pofessor que tem ou não aluno e uma classe aluno que pode ou não ter um professor.


fun main() {
    /* // para Instanciar a classe com as Variaveis nuilas temos que da um apelido para ela e colocar o : e fazer a chamada da Classe
    // no final da classe colocamos o ? para que ela não dé erro de compilação.

    var veiculo:Carro? = null
     veiculo = Carro()

    val corPadrao =veiculo?.cor?:  "base" // o perador elves ?:
    println(corPadrao)


    println("${veiculo?.cor} passando auqi") // Usamos a chamada segura ?  quando não validamos se ele é nulo


    if(veiculo!= null){ // Quando validamos o nulo não precisa da chamada segura ?
        println("${veiculo.cor} passando aqui 1")
        println("${veiculo.modelo} passando aqui 2")

        }
*/

/*
      */
    //Desafio
    //  Receba duas notas (valores Double?) de um aluno.
    val nota1: Double? = null
    val nota2: Double? = null

    if (nota1 != null && nota2 !=null) {
        // Calcule a média dessas notas apenas se ambas forem diferentes de nulo.
        var media = (nota1 + nota2) / 2

        println("Media: $media")
        // Verifique se a média é suficiente para aprovação (média >= 6.0).
        if (media >= 6.0) {

            // Mostre mensagens diferentes dependendo da situação:

            //Média válida e aprovado.
            println("Voce esta aprovado")
        } else {
           // Média válida e reprovado.
            println("Voce esta reprovado")

        }
    }else {
        // Uma ou ambas as notas são nulas.
        println("Uma ou ambas as notas sao nulas")
    }


}