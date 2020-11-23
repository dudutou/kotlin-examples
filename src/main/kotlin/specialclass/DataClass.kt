package specialclass

data class User(val name: String, val id: Int)

fun main() {
    val user = User("Alex", 1)
    println(user)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")
    println("user equals secondUser: ${user.equals(secondUser)}")
    println("user === secondUser: ${user === secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    println("user.hashCode: ${user.hashCode()}")
    println("secondUser.hashCode: ${secondUser.hashCode()}")
    println("thirdUser.hashCode: ${thirdUser.hashCode()}")

    println(user.copy())
    println(user.copy("Tom"))
    println(user.copy(id = 3))

    println("name = ${user.component1()}")
    println("id = ${user.component2()}")
}