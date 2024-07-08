package functional.task6

fun main() {

}

fun square(n: Int) = n * n
fun triple(n: Int) = n * 3

fun <T, R, E> reverseCurryPolymorph(): ((T) -> R) -> ((R) -> E) -> (T) -> E = {f -> { g -> { x -> g(f(x)) } } }