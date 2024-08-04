package practise

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

//    println(solution(listOf("Hey", "May", "Тesss", "Hey")))
//    "AD AS AD AU AS  AU".toList()
//        .windowed(2).forEach(::println)

    val chunked = "AD".toList()
        .windowed(2) { list -> list.joinToString(separator = "").replace(" ", "") }
        .filter { it.length > 1 }

    val result = chunked.groupingBy { it }.eachCount().toList().sortedWith { (key1, value1), (key2, value2) ->
        when {
            value1 != value2 -> value2.compareTo(value1)
            else -> key2.compareTo(key1)
        }
    }

    println(result[0].first)
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

fun solution(products: List<String>): Int {
    val symbol = "T"

    for ((index, elem) in products.withIndex()) {
        if (elem.startsWith(symbol) && index % 2 == 1) {
            return index
        }
    }
    return 0
}

