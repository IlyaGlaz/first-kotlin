package functional.task8

fun main() {
    println(partiallyAppliedSecond(20, curryToFun)(4))
}

val curryToFun: (Int) -> (Int) -> Int = { x -> { y -> x - y } }

fun <A, B, C> partiallyAppliedSecond(second: B, func: (A) -> (B) -> C): (A) -> C = { first -> func(first)(second) }