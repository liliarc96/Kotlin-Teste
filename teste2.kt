fun main() {
    println("TABUADA DE 1:")
    for(i in 1..10 step 1){
        println("1 x "+i+" = "+i)        
    }
    println("---------------------")
    println("\nTABUADA DE 2:")
    var x:Int = 1
    for(i in 2..20 step 2){
        println("2 x "+x+" = "+i)
        x+=1
    }
    println("---------------------")
    
    for(i in 10 downTo 0){
        println(i)
    }
    
    for(i in 0 until 10){
        println(i)
    }
    println("---------------------")
    var text = "kotlin"
    for(letter in text){
        println(letter)
    }
    println("---------------------")
    text.forEach{ letter->
        println(letter)
    }
}
