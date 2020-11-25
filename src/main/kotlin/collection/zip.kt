package collection

fun main() {

    val A = listOf("a", "b", "c", "d", "e")
    val B = listOf(1, 2, 3, 4)

    val resultPairs = A zip B
    val resultReduce = A.zip(B) { a, b -> "Prefix-${a}-Mid-${b}-Suffix" }

    println("A to B: $resultPairs")
    println("\$A\$B: $resultReduce")
}