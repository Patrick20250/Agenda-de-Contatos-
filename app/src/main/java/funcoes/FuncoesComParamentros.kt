package funcoes

import com.patrick.aulaudemy.com.patrick.aulaudemy.com.patrick.aulaudemy.funcoes.somar


fun main(){
somar(10,5)

    // para metodo nomeado e quando voce coloca o nome do parametro Ex;
    somar(numero1 = 10 , numero2 = 20)

}




// Caso não queria colocar um valor direto no parametro so colocar um valor padrão 0 ou seja um parameto opcinal  , Ex: fun somar(numero1: Int = 0, numero2:Int= 0)
 fun somar(numero1: Int , numero2:Int = 0){ // Parâmetro: é uma variável especial usada para receber valores dentro da função.
//Toda função pode ter parâmetros, e esses parâmetros viram variáveis locais dentro da função.
   println(numero1 + numero2)






}




// Parametros abrigatorio  fun somar(numero1: Int) aqui voce e obrigado a colocar o valor
//Parametro opcinal fun somar(numero1: Int=0) aqui voce coloca se voce qioser o valor