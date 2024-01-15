package joyofkotlin.ch03

fun main() {
    double2(2)
}

fun double1(x: Int): Int = x * 2

val double2: (Int) -> Int = ::double1