package collection

val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

val find = words.find { it.startsWith("some") }
val findLast = words.findLast { it.startsWith("some") }
val findLastNothing = words.find { it.contains("nothing") }

val first = words.first { it.startsWith("some") }
val last = words.last { it.startsWith("some") }
//val nothing = words.first { it.contains("nothing") }
val nothing = words.firstOrNull() { it.contains("nothing") }

val count = words.count()
val somePrefixCount = words.count {it.startsWith("some")}

fun main() {
    println("find: $find")
    println("findLast: $findLast")
    println("findLastNothing: $findLastNothing")

    println("first: $first")
    println("last: $last")
    println("nothing: $nothing")

    println("count: $count")
    println("somePrefixCount: $somePrefixCount")
}