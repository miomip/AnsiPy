import Colors
fun main(args: Array<String>) {
    Colors()
    val resetColor = Colors().resetColor
    val j = 1
    println("Code: u001b[48;5;number m")
    for(j in 0..239){
        val code = 1 * 16 + j
            val out = "\u001b[48;5;" + code + "m" + " "
            val jOut = 16 + j
            print("$out$jOut $resetColor")
    }
    println()
    println()
    println()
    println("Code: u001b[number m")
    for(j in 0..91){
        val code = 1 * 16 + j
        val out = "\u001b[" + code + "m" + " "
        val jOut = 16 + j
        print("$out$jOut $resetColor")
    }
    println()
    println()
    println("Program arguments: ${args.joinToString()}")
}