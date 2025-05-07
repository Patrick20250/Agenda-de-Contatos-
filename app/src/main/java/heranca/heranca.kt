package heranca

import emcapsulamento.Carro


/*Porpadroa toda classe em Kotlin são Final ou seja toda vez que voce for Herdar de uma classe pai voce tem que deixar
ela aberta com a palavra reservada 'open' antes da class

os metodos em Kotlin eles são Final ou seja para poder sobres crever o metodo precisamos utilizar o pen

Em Kotlin nos nao temos herança multipla


*/

open class  Animal{
    // propriedades
    var cor: String = ""
    var tamanho: String = ""
    var peso: Double = 0.0


    // metodos em linha
    open fun correr()= println("Correndo como um ")

    // metodos normal
    fun dormir(){

        println("ZzZzZzZzZzZzZzZzZzZ")
    }
}


class Cachorro(): Animal(){ // classe Filha

    fun latir() = println("Au AU AU")

    override fun correr(){
        super.correr()
        println("cao de 4 Patas")

    }


}

class Passaro(): Animal(){ // classe Filha

    fun voar(){
        println("Voando")
    }

    override fun correr() {
        super.correr()
      println("passaro de  2 patas")}

}

fun main() {


    val cao = Cachorro()
    cao.dormir()
    cao.latir()
    cao.correr()

    println("===============")

    val passarinho = Passaro()
    passarinho.correr()
    passarinho.voar()





}



/*
so brescrevendo um metodo usamos o override*/
