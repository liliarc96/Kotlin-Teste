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
    var number = a ?: 0 // se a não for nulo atribui o valor, se for atribui o valor 0
    }
    
    //atribuições
    val maxValue = if(a>b) a else if(b>a) b else b // maxValue recebe a se a for maior que b, e recebe b se b for maior que a ou se os valores foram iguais
    val minValue = if(a>b){
        println("$b é menor que $a")
        b
    }else if(a<b){
        println("$a é menor que $b")
        a
    }else{
        println("Os dois valores são iguais")
        b
    }
    
    //when
    when(year){
        in -4000..475 -> {} //antiguidade
        in 476..1452 -> {} //medieval
        in 1453..1789 -> {} //moderna
        currentYear -> {} //ano atual
        else -> {}
    }
    
    when(){
        a>b -> {}
        a!=b && a>c -> {}
        b==0 -> {}
        else -> {}
    }
    
    //repetição, aceita (in, range, until, downTo, step)
    while(condição){
    }
    
    do{
    }while(condição)
    
    for(i in 0..20 step 2){
        println(i)
    }
}
