package hyperskill

/**
 * Write a program for checking if the input number is prime.
 * Create the printIfPrime(number: Int) function and print "%your_number% is a prime number." if the number is prime;
 * otherwise, print "%your_number% is not a prime number."
 * Hint: The number 1 is more interesting than it seems. Despite seeming so, mathematically it is not a prime number.
 */
fun printIfPrime(number: Int) =
    if (number == 1) {
        false
    } else {
        (2..<number).none { number % it == 0 }
    }

fun solution() {
    readln().toInt().let { "$it ${if (printIfPrime(it)) "is" else "is not"} a prime number." }
        .also { println(it) }
}