package funcoes

fun main(){
   val p1 = subtrair()
    println(p1)
    val p2 = divisao()
    println(p2)
    val p3 = nomes()
    println(p3)
}

fun subtrair() =  println(10-8)  // para fazer funcoes em Line sem retorno


fun divisao():Int = 20/2 // fazendo inline em funcao com retorno não é preciso colocar o return ela esimplificada dessa maneira

fun nomes():String = "AA"


