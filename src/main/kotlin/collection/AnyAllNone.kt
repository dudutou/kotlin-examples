package collection

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val anyNegative = numbers.any { it < 0 }
    val anyGT6 = numbers.any { it > 6 }
    val allEven = numbers.all { it % 2 == 0 }
    val allLess6 = numbers.all { it < 6 }
    val nonodd = numbers.none { it % 2 == 1 }
    val nonGT6 = numbers.none { it > 6 }

    println("numbers: $numbers")
    println("anyNegative: $anyNegative")
    println("anyGT6: $anyGT6")
    println("allEven: $allEven")
    println("allLess6: $allLess6")
    println("nonodd: $nonodd")
    println("nonGT6: $nonGT6")
}