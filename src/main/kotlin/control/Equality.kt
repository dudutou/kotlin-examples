package control

fun main() {
    val animals = setOf("dog", "cat", "rabbit")
    val pets = setOf("rabbit", "dog", "cat")

    println(animals == pets)
    println(animals === pets)
}