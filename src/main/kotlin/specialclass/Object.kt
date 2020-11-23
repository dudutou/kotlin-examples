package specialclass

// object Expression (I can't understand why to use it)
fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {

    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special

    println("Total price: $$total")

}

// object Declaration (just like the static method of Java?)
object DoAuth {
    fun takeParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}

// Companion Objects
// If you plan to use a companion object in Kotlin, consider using a package-level function instead.

fun main() {
    rentPrice(10, 2, 1)
    DoAuth.takeParams("foo", "qwerty")
}