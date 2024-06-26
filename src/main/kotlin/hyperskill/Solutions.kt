package hyperskill

import java.util.*

/**
 * A detecting device compares the size of components produced by a machine against the reference component.
 *
 * If the size of the component is larger, it can be fixed; the detector prints 1.
 * If the size of the component is smaller, it is deemed as a rejection; the detector prints -1.
 * If the component is perfect, it is sent to the box; the detector prints 0.
 *
 * Write a program which takes n (the number of parts) as input and then the detector sequence.
 * The program should output three numbers in a single line — the number of perfect components,
 * the number of larger components, and the number of rejections.
 */
fun solution1() {
    val scanner = Scanner(System.`in`)
    val count = IntArray(3)
    val n = scanner.nextInt()
    repeat(n) {
        val next = scanner.nextInt()
        count[(next + 3) % 3]++
    }
    println(count.joinToString(separator = " "))
}

/**
 * Write a program that reads a sequence and prints how many positive numbers it contains.
 * The first number is the length of the sequence. Other numbers are the elements of this sequence.
 */
fun solution2() = print(List(readln().toInt()) { readln().toInt() }.count { it > 0 })

fun solution3() {
    println(
        (1..readLine()!!.toInt())
            .map { readLine()!!.toInt() }
            .count { it > 0 }
    )
}

/**
 * Imagine there are three boys in a sports class.
 * You need to write a program that checks if the boys are arranged in ascending or descending order by height.
 * The program should read three integer numbers h1, h2, h3 and output true or false.
 * If the boys have the same height, they are arranged correctly.
 */
fun solution4() = List(3) { readln().toInt() }
    .let { println(it[1] in it[0]..it[2] || it[1] in it[2]..it[0]) }

