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
    
    fun calculate(n1:Int,n2:Int,operation:(Int,Int)->Int):Int{
        val result = operation(n1,n2)
        return result
    }
    
    fun sum(a1:Int,a2:Int) = a1.plus(a2)
    
    //funções & extensões
    fun String.randomCapitalizedLetter() = this[(0..this.length-1).random()].toUpperCase()
    
    //estruturas de controle
    if(umaVariavel > 0){
        println("$umaVariavel é maior que zero!")
    }else if(umaVariavel = 0){
        println("$umaVariavel é igual que zero!")
    }else{
        println("$umaVariavel é menor que zero!")
    }
    
    when{
        case1 -> {}
        case2 -> {}
        case3 -> {}
        else -> {}
    }
    
    val a:Int? = null
    var number = a ?: 0
    
    https://www.casasbahia.com.br/monitor-led-21-5-aoc-full-hd-22b1h-com-conexao-hdmi-e-base-ajustavel-13937084/p/13937084?utm_medium=Cpc&utm_source=GP_PLA&IdSku=13937084&idLojista=10037&utm_campaign=elte_smart-shopping&gclid=EAIaIQobChMInOC7pPDB8QIV4xmtBh1BhwRmEAQYEyABEgI95vD_BwE
}
