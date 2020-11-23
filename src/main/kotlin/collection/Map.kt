package collection

val fruitPrice: MutableMap<String, Int> = mutableMapOf("apple" to 150, "orange" to 100, "peach" to 300)
val fruitPriceReport: Map<String, Int> = fruitPrice

fun updateColor(fruit: String, price: Int) {
    if (fruitPrice.containsKey(fruit)) {
        fruitPrice[fruit] = fruitPrice.getValue(fruit) + price
    } else {
        println("Error: Trying to update a non-existing fruit (id: $fruit)")
    }
}

fun printFruitPriceReport() {
    fruitPriceReport.forEach { (k, v) -> println("$k, $v")}
}

fun main() {
    printFruitPriceReport()
    updateColor("apple", 30)
    println("After update")
    printFruitPriceReport()
}