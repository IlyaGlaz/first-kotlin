package functional.task2

fun main() {
    println(Factorial.factorial(3))
}

object Factorial {
    val factorial: (Int) -> Int by lazy {
        { n ->
            if (n == 0) 1 else n * factorial(n - 1)
        }
    }
}