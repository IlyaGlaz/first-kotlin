package kotlininaction.ch05

fun main() {
    println(people.filter { it.age > 30 })
    println(people.map { it.name })
    println(people.maxBy { it.age }.age)
    println("Hello".toList())
}

data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))