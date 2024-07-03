package functional.task1

fun main() {
    println(compose(::square, ::triple)(10))
}

fun square(n: Int) = n * n
fun triple(n: Int) = n * 3

fun compose(f: (Int) -> Int, g: (Int) -> Int): (Int) -> Int = { x -> f(g(x))}