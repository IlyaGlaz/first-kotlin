package kotlininaction.ch03

fun main() {
    val strings = listOf("first", "second", "fourteenth")

    val (number, name) = 1 to "one"
    println("$number and $name")
}