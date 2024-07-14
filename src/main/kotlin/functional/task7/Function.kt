package functional.task7

fun main() {
    println(partiallyAppliedFirst(2, curryToFun)(20))
}

val curryToFun: (Int) -> (Int) -> Int = { x -> { y ->  x - y } }

fun <A, B, C> partiallyAppliedFirst(first: A, func: (A) -> (B) -> C ): (B) -> C = func(first)