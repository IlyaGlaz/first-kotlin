package functional.task3

import java.math.BigInteger

fun main() {
//    (0..<10).forEach { print("${fib(it)} ") }

    println(fibonacci(10_000))
}

// Bad
fun fib(n: Int): Int =
    if (n == 0 || n == 1)
        1
    else
        fib(n - 1) + fib(n - 2)

// Good
fun fibonacci(n: Int): BigInteger {
    tailrec
    fun fibonacci(n: BigInteger, first: BigInteger, second: BigInteger): BigInteger {
        return when {
            n == BigInteger.ZERO -> BigInteger.ONE
            n == BigInteger.ONE -> first + second
            else -> fibonacci(n - BigInteger.valueOf(1L), second, first + second)
        }
    }
    return fibonacci(
        BigInteger.valueOf(n.toLong()),
        BigInteger.ZERO, BigInteger.ONE
    )
}