package practise

fun intDivision(x: String, y: String): Int =
    try {
        x.toInt() / y.toInt()
    } catch (ex: NumberFormatException) {
        println("Read values are not integers")
        0
    } catch (ex: ArithmeticException) {
        println("Exception: division by zero!")
        0
    }

fun printFifthCharacter(input: String): String =
    try {
        "The fifth character of the entered word is ${input[4]}"
    } catch (ex: StringIndexOutOfBoundsException) {
        "The input word is too short!"
    }

fun main() {
    val x = readLine()!!
    val y = readLine()!!
    println(intDivision(x, y))
}