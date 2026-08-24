fun main() {
    println(celsiusParaFahrenheit(30.0))

}

//1 Atividade
fun percorrerArray(){

    val numero = 10

    if (numero % 2 == 0) {
        println("O número é par")
    } else {
        println("O número é ímpar")
    }
}

//2 Atividade
fun validacao(){
    val numero = -90

    if (numero > 0) {
        println("O numero é positivo")
    }else if (numero < 0){
        println("Numero é negativo")
    } else{
        println("Numero é Zero")
    }
}

//3 Atividade
fun idade(){
    val idade = 48

    if (idade < 12){
        println("Menor de Idade")
    }else if (idade > 12 && idade < 17){
        println("Adolecente")
    }else if (idade >= 18 && idade <= 59){
        println("Adulto")
    }else if (idade >= 60){
        println("Idoso")
    }

}

//4 Atividade
fun tabuada(){
    val numero = 10
    var i = 0

    while (i <= 10){
        println("$numero + $i = ${numero + i}")
        i++
    }
}

//5 Atividade
fun tabuadaArray(){
    val numeros = arrayOf(1, 2, 3, 4)

    var i = 0
    var soma = 0

    while (i < numeros.size){
        soma += numeros[1]
        i++
    }

    println("Soma: $soma")
}

//6
fun maiorNumero(){
    val numeros = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)

    var maior = 1
    var i = 0

    while (i < numeros.size){
        if (numeros[i] > maior){
            maior = numeros[i]
            println("$maior")
        }
        i++
    }

}

//7
fun contagemNumero(){
    val numeros = arrayOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)

    var maior = 10
    var i = 0

    while (i < numeros.size){
        if (numeros[i] < maior){
            maior = numeros[i]
            println("$maior")
        }
        i++
    }

}

//8
fun calculadoraPares() {
    val numeros = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var i = 0
    var soma = 0

    while (i < numeros.size) {

        if (numeros[i] % 2 == 0) {
            soma += numeros[i]
        }

        i++
    }

    println("Soma dos pares: $soma")
}

//9
fun dobro(numero: Int): Int {
    return numero * 2
}

//10
fun media(nota1: Double, nota2: Double, nota3: Double): Double {
    return (nota1 + nota2 + nota3) / 3
}

//11
fun celsiusParaFahrenheit(celsius: Double): Double {
    return celsius * 1.8 + 32
}