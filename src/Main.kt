fun main(){
    calculadora()
}

fun calculadora(){

    var i:Int = 0
    while(i == 0) {

        println("•Qual tipo de operação será realizada? \n•Caso quera sair da calculadora digite s")
        var op = readln()
        if (op == "+") {
            soma()
        } else if (op =="-"){
            sub()
        } else if (op =="/"){
            divi()
        } else if (op =="*"){
            mult()
        } else if (op =="s"){
            println("\n•Você esta saindo da calculadora, obrigado!")
            i += 1
        }
    }
}

fun soma(){
    println("\n•Digite os valores a serem somados")
    val a = readln().toDouble()
    val b = readln().toDouble()

    println("\n•A soma de ${a} e ${b} é igual a ${a+b}")
}

fun sub(){
    println("\n•Digite os valores a serem subtraidos")
    val a = readln().toDouble()
    val b = readln().toDouble()

    println("\n•A subtração de ${a} e ${b} é igual a ${a-b}")
}

fun divi(){
    println("\n•Digite os valores a serem dividos")
    val a = readln().toDouble()
    val b = readln().toDouble()

    println("\nA divisão de ${a} e ${b} é igual a ${a/b}")
}

fun mult(){
    println("\n•Digite os valores a serem multiplicados")
    val a = readln().toDouble()
    val b = readln().toDouble()

    println("\n•A multiplicação de ${a} e ${b} é igual a ${a*b}")
}