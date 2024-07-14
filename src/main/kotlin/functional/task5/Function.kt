package functional.task5

fun main() {
    println(curryPolymorph<Int, Int, Int>()(::square)(::triple)(2))
}

fun square(n: Int) = n * n
fun triple(n: Int) = n * 3

fun <T, R, E> curryPolymorph(): ((R) -> E) -> ((T) -> R) -> (T) -> E = {f -> { g -> { x -> f(g(x)) } } }