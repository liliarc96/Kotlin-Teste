const val MIN = 0
const val MAX = 100

fun main() {
    var umaVariavel:Int = 22
    val numeros = listOf(1,3,5,7,9,11)
    println(12 in numeros)
    umaVariavel = umaVariavel + 4
    println(umaVariavel)
    println(12 in 0..100)
    
    //bingo
    val bingo = listOf(23,76,1,9,10,45)
    var numero = (1..99).random()
    println(numero)
    println(numero in bingo)
    
    //funções de ordem superior
    val x = calculate(12,4,::sum) //12 + 4
    val y = calculate(12,4){a,b-> a*b} // 12*4
}
