package joyofkotlin.ch03

fun main() {
    println(add(2)(6))
}

val add: (Int) -> (Int) -> Int = {a -> {b -> a + b}}
