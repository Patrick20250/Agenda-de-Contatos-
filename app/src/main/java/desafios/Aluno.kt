package com.patrick.aulaudemy.Aluno


fun main() {

    val nomeDoAluno: String?=""
    var nomedoCurso: String = "ADS"

    val ola = if (!nomeDoAluno .isNullOrBlank()) {

       "Bem-Vindo: ${nomeDoAluno} ao curso ${nomedoCurso}"
    } else {
        "Bem vindo, Aluno ${nomeDoAluno} desconhecido ao curso ${nomedoCurso}"

    }
    println(ola)


    val media = calculaMedia(9.5F, 10.0F)
    imprimeSituacao(media)


   InformacoesDeAluno(nome = "")
    println("---------------------------------------")
  InformacoesDeAluno(nome = "Janaina", curso = "PHP", idade = 28)

    println("---------------------------------------")
    InformacoesDeAluno(idade = 24, nome = "lucicleide",curso = "Java")


    val aluna= Alunos()

    println(aluna.apresentarAluno())
    aluna.verificaMaiorIdade(20) // quando faz a chamada da função que voce pode colocar o valor nela não precisa chamar o println pois ela não retorna nada

}

fun calculaMedia(notaAluno1: Float, notaAluno2:
Float): Float {
    return (notaAluno1 + notaAluno2) / 2
}


fun imprimeSituacao(media: Float) {


    when {
        (media >= 7) -> println("Aluno Aprovado com media de: $media")
        (media > 5 && media < 7) -> println("Aluno Recuperacao com a media de: $media")
        else -> println("Aluno Reprovado com a media de: $media")
    }
}


fun InformacoesDeAluno(
    nome: String,
    curso: String = "Kotlin basico",
    idade: Int = 18
) {


    println("Aluno: $nome")

    println("curso: $curso")

    println("idade: $idade")

}




class Alunos() {
    var nome: String = "patrick"
    val idadae:Int = 0
    var cursos:String = "Programacao"


    fun apresentarAluno(): String{
        return "ola! meu nome e $nome, tenho $idadae de idade faz anos que estou cursando $cursos"
    }


    fun verificaMaiorIdade(idade: Int){
        when{
            (idade >=18)-> println("Sou Maior de Idade")
            else ->println("Sou menor de Idade")
        }
    }
}