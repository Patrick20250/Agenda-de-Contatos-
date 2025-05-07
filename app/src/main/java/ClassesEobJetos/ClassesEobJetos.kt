package ClassesEobJetos




// quando voce coloca na chamada val jogador a constante não pode ser mudade mas o objeto pode ser mudado

class Jogador{
    var Kart:String = ""
    var pneu: String = ""
    var planador: String = ""




    fun acelerar(aceleracao :Int=0) = println("Acelerando na velocidade: $aceleracao Km")




    fun retornarPoder(): String =  "Fogo azul"


}


fun main() {

    val jogador = Jogador()
    jogador.Kart = "Droagonoide"
    jogador.acelerar(60)
    println(jogador.Kart)

    val poder =jogador.retornarPoder()
    println(poder)


}