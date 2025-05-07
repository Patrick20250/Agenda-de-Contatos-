package abstrataComcreta





/*Porpadroa toda classe em Kotlin são Final ou seja toda vez que voce for Herdar de uma classe pai voce tem que deixar
ela aberta com a palavra reservada 'open' antes da class

os metodos em Kotlin eles são Final ou seja para poder sobres crever o metodo precisamos utilizar o pen

Em Kotlin nos nao temos herança multipla*/



/* classe abstrata

para Utilixar uma classe abstrata coçocamos abstraxted antes da class  abstract class Animal()
* Uma classe abstrata ela por padrão já e aberta para Herança e ela não pode ser Instanciada no main
*
*
*
* */


/*Metodo abstrato
* Um metodo abstrato ele e um metodo sem corpo ex: abstract  fun dormir()  (sem implementação) que é declarado dentro da class abstrata
* ele obriga as todas as subclasses comcreta (nao abstrata) a implementa-lo
*
* */
abstract class  Animal(){ // class padrao
    // propriedades
    var cor: String = ""
    var tamanho: String = ""
    var peso: Double = 0.0


    // metodos em linha
    open fun correr()= println("Correndo como um ")

    // metodos normal
    abstract  fun dormir()
}



class Cachorro(): Animal(){ // classe Filha    // class comcreta

    fun latir() = println("Au AU AU")

    override fun dormir() {
        println("correndo como um")
    }
    override fun correr(){
        super.correr()
        println("cao de 4 Patas")

    }




}

class Passaro(): Animal(){ // classe Filha

    fun voar(){
        println("Voando")
    }


    override fun dormir() {
        println("correndo como um")
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
