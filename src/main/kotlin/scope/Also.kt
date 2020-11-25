package scope

data class Cat(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun writeCreationLog(p: Cat) {
    println("A new cat ${p.name} was created.")
}

fun main() {
    val jake = Cat("Tom", 30, "Android player")
        .also {
            writeCreationLog(it)
        }
}