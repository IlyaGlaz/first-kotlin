package practise

fun main(args: Array<String>) {
    val backToTheWall = readLine()!!.split(", ").map { it }.toMutableList()
    val returnedWatchman = readLine()!!
    // do not touch the lines above
    // write your code here

    println(backToTheWall.also { it.add(returnedWatchman) }.joinToString())
}