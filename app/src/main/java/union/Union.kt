package union

// OKolin não permite fazer union com array simples. para isso usamos o listOf

// quando é usado a funcao uniom ele não repete o mesmo valor caso ele seja igual Ex letra maiúscula e letra minúscula da lista se nas duas listas tiver o numero 1 ele so chama um unico número 1 caso ela seja iguais se for for ela chama os dois id que so muda o objeto nome
fun main(){
// Fazendo uniao de Listas
    val numero1 = listOf<Int>(1,5,7,9,20,8)
    val numero2 =listOf<Int>(20,70,80,1,4,5,6,7,9,8)

    val marcaDecarroCaixaAlta = listOf(Carro(1,"Ford") , Carro(2 ,"Toyota"))
    val marcaDecarroCaixaBaixa = listOf(Carro(1,"ford"),Carro(2 ,"toyota"))

    val  result = marcaDecarroCaixaAlta union marcaDecarroCaixaBaixa.toMutableList()

   println(result)
    /*
        val resultado = numero1.union(numero2) // tantofa fazer um uniom assim mas estruturado para o union menos estruturado a saida vai ser a mesma
        println(resultado)

        val uniao = numero1 union numero2 // tanto faz usar o union desse jeito pois a saida e a mesma
        println(uniao)


        // usando o forEach
        uniao.forEach { println(it) }

    */


}

data class Carro(val id:Int, val marca: String){}


//quando voce uma lista fora de uma data clas e faz achamada mesmo que o id seja igual mas o objeto não ele vai retornar apenas a diferencia enquanto a outra não

/*

Ex:
val marcaDecarroCaixaAlta = listOf(1,"Ford",2 ,"Toyota")
val marcaDecarroCaixaBaixa = listOf(1,"ford",2 ,"toyota")

val result = marcaDecarroCaixaAlta union marcaDecarroCaixaBaixa.toMutableList()

println(result)


o Kotlin vê isso como:

List<Any> = [Int, String, Int, String] ele compara valor a valor, e não como pares id + marca

Resultado:

1 == 1 -> duplicado (mantém só um)
"Ford" != "ford" -> adiciona os dois
2 == 2 -> duplicado (mantém só um)
"Toyota" != "toyota" -> adiciona os dois

Resultado Final:

[1, Ford, 2, Toyota, ford, toyota]

Para resolver mos esse proplema usamos a data class para representar os pares id + marca


*/
