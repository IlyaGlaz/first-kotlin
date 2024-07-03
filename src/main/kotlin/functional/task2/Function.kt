package functional.task2

fun main() {
    println(compose(::square, ::triple)(10))
}

fun square(n: Int) = n * n
fun triple(n: Int) = n * 3

fun <T, R, E> compose(f: (R) -> E, g: (T) -> R): (T) -> E = { x -> f(g(x)) }