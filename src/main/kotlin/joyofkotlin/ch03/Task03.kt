package joyofkotlin.ch03

typealias IntUnaryOp = (Int) -> Int

fun main() {
    val result = compose3(one)(two)(2)
    println(result)
}

val one: IntUnaryOp = { it * it }

val two: IntUnaryOp = { it * 3 }

val compose3: (IntUnaryOp) -> (IntUnaryOp) -> IntUnaryOp =
    { x ->
        { y ->
            { z -> x(y(z)) }
        }
    }

//val compose4: ((E) -> V) -> ((E) -> T) -> (U) -> E =
//    { x ->
//        { y ->
//            { z -> x(y(z)) }
//        }
//    }
