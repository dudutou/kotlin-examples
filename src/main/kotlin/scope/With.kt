package scope

class Configuration(var host: String, var port: Int)

fun main() {
    val configuration = Configuration(host = "127.0.0.1", port = 9000)

    with(configuration) {
        // you can omit the instance name when referring to its members.
        println("$host:$port")
    }

    // instead of:
    println("${configuration.host}:${configuration.port}")
}