package kotlininaction.ch02

fun main() {
    println(getMnemonic(Color.RED))
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))

    for (i in 1..100) {
        print(fizzBuzz(i))
    }

//    for (i in 100 downTo 1 step 2) {
//        print(fizzBuzz(i))
//    }

//    for (i in 0 until 100) {
//        print(fizzBuzz(i))
//    }

    val list = arrayListOf("10", "20", "1001")
    list.withIndex()
}

fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Каждый"
        Color.ORANGE -> "Охотник"
        Color.YELLOW -> "Желаетый"
    }