package specialclass

enum class Language {
    Chinese, Japanese, English
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    // Method is separated from the list of instances by a semicolon.
    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

fun main() {
    // The compiler can infer if a when-expression is exhaustive so that you don't need the else-case.
    val nativeLanguage = when(Language.Chinese) {
        Language.Chinese -> "Native language is Chinese"
        Language.Japanese -> "Native language is Japanese"
        Language.English -> "Native language is English"
        // else -> "Unknown native language"
    }
    println(nativeLanguage)

    val red = Color.RED
    println(red)
    println(red.containsRed())
    println(Color.YELLOW.containsRed())
    println(Color.GREEN.containsRed())
}