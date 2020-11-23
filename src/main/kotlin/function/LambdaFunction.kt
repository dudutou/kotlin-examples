package function

val toLowerCase1: (String) -> String = {str: String -> str.toLowerCase()}
val toLowerCase2: (String) -> String = {str -> str.toLowerCase()}
val toLowerCase3 = {str: String -> str.toLowerCase()}
val toLowerCase4: (String) -> String = {it.toLowerCase()}
val toLowerCase5: (String) -> String = String::toLowerCase

fun main() {
    println(toLowerCase1("HI"))
    println(toLowerCase2("HI"))
    println(toLowerCase3("HI"))
    println(toLowerCase4("HI"))
    println(toLowerCase5("HI"))
}
