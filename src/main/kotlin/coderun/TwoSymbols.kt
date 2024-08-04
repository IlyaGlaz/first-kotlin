package coderun

fun main(args: Array<String>) {
    val input = readln()

    if (input.length == 2) {
        println(input)
        return
    }

    val chunked = input.toList()
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