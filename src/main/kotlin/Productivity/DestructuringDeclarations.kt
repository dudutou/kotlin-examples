package Productivity

fun findMinMax(list: List<Int>): Pair<Int, Int> {
    // do the math
    return Pair(50, 100)
}

data class User(val username: String, val email: String)
fun getUser() = User("Mary", "mary@somewhere.com")

class Pair<K, V>(val first: K, val second: V) {  // 1
    operator fun component1(): K {
        return first
    }

    operator fun component2(): V {
        return second
    }
}

fun main() {
    val (x, y, z) = arrayOf(5, 10, 15)
    println("x=$x, y=$y, z=$z")

    val map = mapOf("Alice" to 21, "Bob" to 25)
    for ((name, age) in map) {
        println("$name is $age years old")
    }

    val (min, max) = findMinMax(listOf(100, 90, 50, 98, 76, 83))
    println("min=$min, max=$max")

    val (o, p, q) = listOf(1, 2, 3)
    println("o=$o, p=$p, q=$q")

    val user = getUser()
    val (username, email) = user
    println(username == user.component1())
    println("email: $email")
    // Use underscore if you don't need one of the values, avoiding the compiler hint indicating an unused variable.
    val (_, emailAddress) = getUser()
    println("emailAddress is $emailAddress")

    val (id, name) = Pair(3, "Jim")
    println("id=$id, name=$name")
}