package construtor

// construtor Primario
// o constructor ele e o pcional voce pode so colocar o () e ele vai ter o mesom resultado
 class User (

    // propriedades
    var nome:String = "",
    var sobreNome:String = ""
){ //Construtor primario



    // o init e inicializado depois do construtor
    // ele tambem funciona sem o construtor
 init { // inicializar

        println("Objeto inicializado")

 }

    // no Construtor secundario voce e obrigado a chamar a propriedade do  construtor Primario e colocar o dis depois do ()


    constructor(nome: String):this(nome, sobreNome = ""){// construtor Secundario
        println("Construtor secundario")
    }

}

fun main() {
    val user1 = User(nome = "lucas",sobreNome = "Silva" )
    val user2 = User(nome = "Felipe")



}