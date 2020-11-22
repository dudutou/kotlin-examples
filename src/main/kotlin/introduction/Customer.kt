package introduction

class Customer

class Contact(val id: Int, var email: String)

// The primary constructor cannot contain any code. Initialization code
// can be placed in initializer blocks, which are prefixed with the init keyword.
// Ref: https://kotlinlang.org/docs/reference/classes.html#classes
class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }

    // Not OK.
    //    init_Test {
    //        println("test Init method.")
    //    }
}

fun main() {
    val customer = Customer()
    val contact = Contact(3, "hoge@gmail.com")

    println(customer)
    println(contact.id)
    println(contact.email)

    contact.email = "fuga@gmail.com"
    println(contact.email)

    InitOrderDemo("test")
}