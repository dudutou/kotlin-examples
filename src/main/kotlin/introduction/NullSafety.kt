package introduction

fun main() {
    var neverNull: String
    neverNull = "This can't be null forever"
    // compilation error
    // neverNull = null

    var nullable: String? = "Can be null"
    nullable = null

    // When inferring types, the compiler assumes non-null for variables that are initialized with a value.
    var inferredNonNull = "The compile assumes non-null"
    // compilation error
    // inferredNonNull = null

    var inferredNullable = null
    println(inferredNullable)

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull))
    // compilation error
    // strLength(nullable)

    fun printStr(nullable: String?): Unit {
        println(nullable)
    }

    printStr(nullable)

    fun describeString(maybeString: String?): String {
        if (maybeString != null && maybeString.length > 0) {
            return "String of length ${maybeString.length}"
        } else {
            return "Empty or null string"
        }
    }

    println(describeString(null))
}