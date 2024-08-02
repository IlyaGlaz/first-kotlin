package functional.task4

fun main() {
    println(makeString(listOf("Hello", "My", "Friend"), "* "))
}

fun <T> List<T>.head(): T =
    if (this.isEmpty())
        throw IllegalArgumentException("head called on empty list")
    else
        this[0]

fun <T> List<T>.tail(): List<T> =
    if (this.isEmpty())
        throw IllegalArgumentException("tail called on empty list")
    else
        this.drop(1)

fun <T> makeString(list: List<T>, delim: String): String {
    tailrec fun <T> makeString(list: List<T>, acc: String): String =
        when {
            list.isEmpty() -> acc
            acc.isEmpty() -> makeString(list.tail(), "${list.head()}")
            else -> makeString(list.tail(), "$acc$delim${list.head()}")
        }

    return makeString(list, "")
}

