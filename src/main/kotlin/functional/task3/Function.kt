package functional.task3

fun main() {
    println(curry(2)(10))

    val of2 = curry(2)
    println(of2)
}

val curry: (Int) -> (Int) -> Int = { x -> { y -> x - y } }