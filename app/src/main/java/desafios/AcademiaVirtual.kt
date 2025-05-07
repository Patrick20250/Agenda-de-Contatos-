package desafios

import funcoes.nome

class Aluno( // constutor Primario
    val nome: String,
    val idade: Int,
    val peso: Double,
    val altura: Double,
    val objetivo: String?
) {

    //inicializar com Boas vindas
    init {
        println("Ola nome: $nome bem vindo(a)  idade:$idade anos")
    }

    // Metodos / funcao com retornos


    fun calculaImc(): Double {
        return peso / (altura * altura)
    }

    fun situacaoImc(): String {
        return when {
            calculaImc() < 18.5 -> "Magreza"
            calculaImc() in 18.5..24.9 -> "Normal"
            calculaImc() in 25.0..29.9 -> "Sobrepeso"
            calculaImc() in 30.0..34.9 -> "Obesidade grau I"
            calculaImc() in 35.0..39.9 -> "Obesidade grau II"
            else -> "Obesidade grau III"
        }
    }


    //funcao sem retorno
    fun exibirResumo() {
        println("Aluno: $nome| idade: $idade | peso: $peso | Altura: $altura")

        if (objetivo != null) {
            println("Objetivo:${objetivo}")
        } else {
            println("Objetivo nao definido")
        }
    }

    // sobrecarga do metodo de treicino (com ou sem equipamento
    fun registrarTreino(tipo: String, maquina: String, duracao: Int) {
        println("$nome fez o treino $tipo na maquina $maquina por $duracao minutos.")
    }

    fun registrarTreino(tipo: String, duracao: Int) {
        println("$nome fez o treino do tipo $tipo com duracao de $duracao minutos.")
    }

    inline fun recomendarTreino() {
        when (objetivo) {
            "ganhar massa" -> println("Utilizar exercicios compostos e isolados, com foco em movimentos que permitam a carga agressiva")
            "emagrecer" -> println("Utilizar exercicios fisico que visa aumentar o gasto calorico e reduzir gordura corporal")
            else -> println("objetivo nao encontrado")
        }

    }
}

// Função fora da classe
    fun maiorPeso(peso: DoubleArray): Double {
        return peso.maxOrNull() ?: 0.0
    }

// Função global simples
fun registrarTreino(tipo: String = "Cardio", duracao: Int) {
    println("Treino registrado: $tipo por $duracao minutos.")
}


fun main() {

    println("===Cadastro de Aluno===")
    println("Nome:")
    val nome = readLine() ?: "Desconhecido"

    println("idade:")
    val idade = readLine()?.toIntOrNull()?: 0

    println("Peso (kg):")
    val peso = readLine()?.toDoubleOrNull()?: 0.0

    print("Altura (m): ")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0

    print("Objetivo (ganhar massa / emagrecer): ")
    val objetivo = readLine()

    val aluno = Aluno(nome, idade, peso, altura, objetivo)

    println("\n===== Resumo do Aluno =====")
    aluno.exibirResumo()
    println("IMC: ${aluno.calculaImc()} | Situaçao: ${aluno.situacaoImc()}")
    aluno.recomendarTreino()

    if (aluno.idade >= 18 && aluno.calculaImc() > 25) {
        println(" Recomenda-se consultar um nutricionista.")
    }

    println("\n=== Simulando sessoes de treino ===")
    var sessoes = 0
    while (sessoes < 5) { // menos sessões para teste
        println("Sessao de treino #${sessoes + 1}")
        aluno.registrarTreino("cardio", "esteira", 30)
        sessoes++
    }

}