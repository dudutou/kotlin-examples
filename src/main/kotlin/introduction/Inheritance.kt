package introduction

open class Apple {
    open fun printColor() {
        println("Many kinds of colors.")
    }
}
class FujiApple : Apple() {
    override fun printColor() {
        println("I'm a red apple.")
    }
}

// Inheritance with Parameterized Constructor, It is common to all instances of the subclass,
// that you can not set the parameter when initializing the subclass, but in the subclass declaration.
open class Cat(val origin: String) {
    open fun talk() {
        println("I'm a cat from $origin.")
    }
}
class JapaneseCat: Cat("Japan")

// Passing Constructor Arguments to Superclass
open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}
// name in the Asiatic declaration is neither a var nor val: it's a constructor argument,
// whose value is passed to the name property of the superclass Lion.
class Asiatic(name: String) : Lion(name = name, origin = "India")

fun main() {
    val fujiApple: Apple = FujiApple()
    fujiApple.printColor()

    val japaneseCat: Cat = JapaneseCat()
    japaneseCat.talk()

    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
}