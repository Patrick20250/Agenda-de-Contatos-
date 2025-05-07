package sobrecargaDeMetodos

import android.provider.ContactsContract
import java.util.Enumeration


class Usuario{

    // propriedade variaveis e constates


    // metodos
    fun logar(email:String,senha: String){ //tudo que esta dentro dos () e chamado de Parametros
        println("Usuario logado com email: $email e senha: $senha")
    }

    // podemos usar o mesmo metodo porem com a ssinatura diferente essa assinatura seria os metodosEx:
    // Um usuario pdoe logar com e=-mail e senha e tambem pode logar com o numero de telefone

    fun logar(email:String,numeroTelefone: Int){
        println("Logando com o email: $email e com o telefone: $numeroTelefone")

    }

}

fun main() {
    val user = Usuario()
    user.logar(email = "patrick.test@gmail.com", senha = "@#!$134") // quando uma funcao tem parametro fun logar(emial:String,senha: String) voce tem que colocar o os objeto dentro dele
    user.logar(email = "lucas.test@gmail.com", numeroTelefone = 1144667788)
}