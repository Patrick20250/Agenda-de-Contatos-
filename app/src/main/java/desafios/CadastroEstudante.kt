package desafios

import kotlin.io.println

fun main(){
    //Crie uma variável para o nome de um aluno.
    val nomeAluno: String ="Patrick"
    // Crie duas variáveis para as notas do aluno.

    val notaP1: Float = 10.0F
    val notaP2: Float = 3.0F
    //Calcule a média das duas notas.
    val media: Float = notaP1 + notaP2 / 2

//Se a média for maior ou igual a 7 → escreva "Aprovado"
    if(media>7){

        println("Aluno:$nomeAluno Sua nota da 1 prova foi: $notaP1 e Sua nota da 2 prova foi: $notaP2  esta Aprovado")
    }else if (media >=5 && media<7 ){
        println("Aluno:$nomeAluno Sua nota da 1 prova foi: $notaP1 e Sua nota da 2 prova foi: $notaP2    voce esta em Recuperacao")
    }else {
        println("Aluno:${nomeAluno} reprovado voce nao a media sua nota foi:  $notaP1 e  $notaP2 ")
    }




}

