package funcoes




fun main(){

   val retorno = somar()
    println(retorno * 2)

    val nome1 = nome()
    println("ola $nome1 tudo bem com voce?")

}

//Com retorno ou sem retorno
// funcao sem retorno ela apenas executa
// funcao com retorno ela espera um retorno de seu tipo  esse retorno voce coloca apos os parenteses

// por padrao a função retorna Unit
fun somar(): Int{
return 12
}


fun nome(): String{
    return "Patrick"
}
