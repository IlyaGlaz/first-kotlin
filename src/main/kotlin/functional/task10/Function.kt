package functional.task10

fun main() {
    println(convertToCurry(tupleFunc)(2)(3))
}

val tupleFunc: (Int, Int) -> Int = { x, y -> x * y }

fun <A, B, C> convertToCurry(func: (A, B) -> C): (A) -> (B) -> C =
    { a ->
        { b ->
            func(a, b)
        }
    }

