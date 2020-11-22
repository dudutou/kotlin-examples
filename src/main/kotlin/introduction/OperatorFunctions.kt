package introduction

// Certain functions can be "upgraded" to operators, allowing their calls with the corresponding operator symbol.

operator fun Int.times(str: String) = str.repeat(this)

operator fun String.get(range: IntRange) = substring(range)

fun main() {
    println(5 * "ha ")
    val str = "Suddenly, I need to update my macOs to Big Sur."
    println(str[0..15])
}