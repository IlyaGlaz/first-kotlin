package functional.task11

fun main() {
    println(revertArgumentInCurry(curry)(16)(8))
}

val curry: (Int) -> (Int) -> Int = { x -> { y -> x - y } }

fun <A, B, C> revertArgumentInCurry(func: (A) -> (B) -> C): (B) -> (A) -> C =
    { b ->
        { a ->
            func(a)(b)
        }
    }
