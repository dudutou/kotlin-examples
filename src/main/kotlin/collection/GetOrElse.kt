package collection

fun main() {
    val list = listOf(0, 10, 20)
    println(list.getOrElse(1) {-1})
    // Provides the default value in cases when the index is out of bound.
    println(list.getOrElse(10) {-1})

    println()

    // Also for map
    val map = mutableMapOf<String, Int?>()
    println(map.getOrElse("x") { 1 })

    map["x"] = 3
    println(map.getOrElse("x") { 1 })

    map["x"] = null
    println(map.getOrElse("x") { 1 })
}

