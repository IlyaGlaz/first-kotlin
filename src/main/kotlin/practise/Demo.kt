package practise

import java.util.*
import kotlin.math.max

fun main(args: Array<String>) {
//    val backToTheWall = readLine()!!.split(", ").map { it }.toMutableList()
//    val returnedWatchman = readLine()!!
//    // do not touch the lines above
//    // write your code here
//
//    println(backToTheWall.also { it.add(returnedWatchman) }.joinToString())
//
//    println(fun(): Int { return 22 }())
//    anonymous()

//    println(mult(2, 3))

    // Create a mutable list to store the input numbers
    val numberList = mutableListOf<Int>()

    // Use a scanner to read the user input
    val scanner = Scanner(System.`in`)

    // TODO: Extract the integers from the input and add them to the mutable list
    numberList.addAll(scanner.nextLine().split(" ").map { it.toInt() })

    numberList.sort()

    println(numberList.joinToString(" "))
}

fun generate(functionName: String): (Int) -> Int =
    when (functionName) {
        "identity" -> { num: Int -> num }
        "half" -> { num: Int -> num / 2 }
        else -> { _ -> 0 }
    }

val anonymous = fun(): Int { return 22 }

val lambda: (Int, Int) -> Int = { a, b -> max(a, b) }

val mult: (Long, Long) -> Long = { a, b -> (a..b).reduce { f, s -> f * s } }