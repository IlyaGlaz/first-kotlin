package practise

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Start")

    launch {
        delay(5000)
    }
    println("After first delay")
    launch {
        delay(5000)
    }
    println("After second delay")

    println("End")
}

suspend fun parallelTask() {
    println("Hello world")
}