package practise

const val TIME_ZONE = 3
const val MINUTE = 60
const val HOUR = 60 * MINUTE
const val DAY = 24 * HOUR

fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 + HOUR * TIME_ZONE

    val hours = (totalSeconds % DAY) / HOUR
    val minutes = (totalSeconds % HOUR) / MINUTE
    val seconds = (totalSeconds % HOUR) % MINUTE

    println("$hours:$minutes:$seconds")
}