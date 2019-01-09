fun main(args: Array<String>) {
    var x: Int = 4
    var y: Int = 3
    println(x + y) // addition
    println(x - y) // subtraction
    println(x * y) // multiplication

    // this one prints 1 since division of integer types always truncates, so 1.33333 -> 1 and 1.8 -> 1
    println(x / y) // division

    // here we demonstrate correct division output
    val z: Double = 4.0
    val w: Double = 3.0
    println(z / w)
    println()

    /**
     * This and the next block are equivalent, just the second one uses a shorthand for adding
     * and subtracting one from x
     */
    x = x + 1
    println(x)
    x = x - 1
    println(x)

    x++ // shorthand for x = x + 1
    println(x)
    x-- // shorthand for x = x - 1
    println(x)

    x += 2 // shorthand for x = x + 2
    println(x)
    x -= 2 // shorthand for x = x - 2
    println(x)
}
