package functional.task9

fun main() {
    println(joinFunc<Int, Int, String, String>()(22)(55)("Hello")("Wazap"))
}

val curryToFun: (Int) -> (Int) -> Int = { x -> { y -> x - y } }

fun <A, B, C, D> joinFunc(): (A) -> (B) -> (C) -> (D) -> String =
    { a ->
        { b ->
            { c ->
                { d ->
                    "$a, $b, $c, $d"
                }
            }
        }
    }
