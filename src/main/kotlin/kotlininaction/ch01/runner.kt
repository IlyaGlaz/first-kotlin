package kotlininaction.ch01

fun main(args: Array<String>) {
    val name  = if (args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello, $name")
    println(max(2, 4))

    val person = Person("Bob", true)
    println(person.name)
    println(person.isMarried)
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

