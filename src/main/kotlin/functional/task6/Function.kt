package functional.task6

fun main() {
    println(reverseCurryPolymorph<Int, Int, Int>()(::square)(::triple)(2))
}

fun square(n: Int) = n * n
fun triple(n: Int) = n * 3

fun <T, R, E> reverseCurryPolymorph(): ((T) -> R) -> ((R) -> E) -> (T) -> E = {f -> { g -> { x -> g(f(x)) } } }