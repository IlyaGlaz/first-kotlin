package coderun

fun main(args: Array<String>) {
    val totalFirst = readln().toInt()
    val totalSecond = readln().toInt()
    val perMember = readln().toInt()

    val result = if (totalFirst >= totalSecond) {
        "Yes"
    } else {
        if (totalSecond.toDouble() / perMember >= totalFirst) {
            "No"
        } else {
            "Yes"
        }
    }

    println(result)
}