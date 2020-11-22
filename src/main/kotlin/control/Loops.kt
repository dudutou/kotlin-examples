package control

// Iterators
class Animal(val name: String)
class Zoo(private val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun main() {
    val fruits = listOf<String>("Apple", "Pear", "Peach", "Banana")
    for (fruit in fruits) {
        println(fruit)
    }

    println()
    val zoo = Zoo(listOf(Animal("kangaroo"), Animal("algebra")))
    for (animal in zoo) {
        println("We have animal: ${animal.name}")
    }
}
