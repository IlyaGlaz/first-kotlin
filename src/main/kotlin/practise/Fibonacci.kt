package practise

fun main() {
    println((0..<7).map { fib(it) }.joinToString(","))
}

fun fib(n: Int): Int =
    when (n) {
        0 -> 0
        1 -> 1
        else -> fib(n - 1) + fib(n - 2)
    }
