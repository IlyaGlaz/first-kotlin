package hyperskill

fun main() {
    val (a, b) = readLine()!!.split(" ")
    println(Countries.check(a, b))
}

enum class Countries(val currency: String) {
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar");

    companion object {
        fun check(a: String, b: String): Boolean {
            return try {
                valueOf(a).currency == valueOf(b).currency
            } catch (e: Exception) {
                false
            }
        }
    }
}