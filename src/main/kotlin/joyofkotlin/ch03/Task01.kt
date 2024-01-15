package joyofkotlin.ch03

fun main() {
    val squareToTriple = compose(::square, ::triple)
    println(squareToTriple(10))
    val result = compose2({ it * 2 }, { it * 3 })(2)
    
    println(result)
}

fun square(n: Int) = n * 2

fun triple(n: Int) = n * 3

fun <T, U, V> compose(a: (U) -> V, b: (T) -> U): (T) -> V = { a(b(it)) }

fun compose2(a: (Int) -> Int, b: (Int) -> Int): (Int) -> Int = fun (c: Int) = b(a(c))
