package introduction

// Default Parameter Values and Named Arguments
fun printMsg(msg: String): Unit {
    println(msg)
}

fun printMsgWithPrefix(msg: String, prefix: String = "default") {
    println("[$prefix] $msg")
}

fun sum(x: Int, y:Int): Int {
    return x + y;
}

fun multiply(x: Int, y: Int) = x * y

fun main() {
    printMsg("Hello Kotlin!")
    printMsgWithPrefix("message parameter", "prefix parameter")
    printMsgWithPrefix("only message parameter")
    printMsgWithPrefix(prefix = "info", msg = "msg")
    println(sum(1, 2))
    println(multiply(2, 5))
}