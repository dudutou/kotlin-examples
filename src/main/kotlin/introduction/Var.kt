package introduction

fun main() {
    var a: String = "initial"
    println("a: $a")
    val b: Int = 10
    println("b: $b")

    // Kotlin has powerful type inference
    val c = 50
    println("c: ${c.javaClass}")

    // You're free to choose when you initialize a variable, however, it must be initialized before the first read.
    val passed: Boolean
    val score = 80
    passed = score >= 60
    println("passed: $passed")

    // Variable 'e' must be initialized, otherwise you will get a compiler error
    // var e: Int
    // println(e)
}