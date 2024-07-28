package functional.task1

fun main() {
    println(add(-6, -2))
}

fun inc(n: Int) = n + 1
fun dec(n: Int) = n - 1

tailrec fun add(a: Int, b: Int): Int =
    if (a == 0)
        b
    else
        add(dec(a), inc(b))