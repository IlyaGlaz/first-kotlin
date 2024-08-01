package coderun

fun main(args: Array<String>) {
    val totalFirst = readln().toInt()
    val totalSecond = readln().toInt()
    val perMember = readln().toInt()

    when {
        totalFirst > totalSecond -> println("Yes")
        totalFirst == 0 && totalSecond == 0 -> println("No")
        totalFirst == totalSecond && perMember != 1 -> println("Yes")
        totalFirst == totalSecond && perMember == 1 -> println("No")
        totalSecond / perMember >= totalFirst -> println("No")
        totalSecond / perMember == totalFirst - 1 && totalSecond % perMember != 0 -> println("No")
        totalSecond / perMember < totalFirst -> println("Yes")
    }
}