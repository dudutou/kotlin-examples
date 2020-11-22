package introduction

// Functions with vararg Parameters

fun printAll(vararg msgs: String) {
    for (m in msgs) print("$m, ")
    println()
}

fun printAllWithPrefix(vararg msgs: String, prefix: String) {
    for (m in msgs) println(prefix + m)
}

// At runtime, a vararg is just an array. To pass it along into a vararg parameter, use the special spread operator *
// that lets you pass in *entries (a vararg of String) instead of entries (an Array<String>).
fun log(vararg entries: String) {
    printAll(*entries)
}

fun main() {
    printAll("Japan", "China", "America", "Canada", "Korea", "India")
    printAllWithPrefix("Japan", "China", "America", "Canada", "Korea", "India", prefix = "country: ")
    log("Apple", "Banana", "pear", "peach", "melon")
}