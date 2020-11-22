package control

fun main() {
    for (i in 0..5) {
        print(i)
        print(", ")
    }
    println()

    for (i in 2..10 step 2) {
        print(i)
        print(", ")
    }
    println()

    for (i in 3 downTo 0) {
        print(i)
        print(", ")
    }
    println()

    for (c in 'a'..'d') {
        print(c)
        print(", ")
    }
    println()

    for (c in 'z' downTo 'a' step 2) {
        print(c)
    }
    println()

    val x = 5
    if (x in 1..9) {
        println("x is in range from 1 to 5")
    }
    if (x !in 6..9) {
        println("x is not in range from 6 to 10")
    }
}