package functional.task4

typealias IntToInt = (Int) -> Int

fun main() {
    println(curryAsHighOrder(::square)(::triple)(2))
}

fun square(n: Int) = n * n
fun triple(n: Int) = n * 3

val curryAsHighOrder: (IntToInt) -> (IntToInt) -> IntToInt = { f -> { g -> { x -> f(g(x)) } } }