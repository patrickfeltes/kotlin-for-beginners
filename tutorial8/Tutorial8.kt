
fun main(args: Array<String>) {

    val x: Int = 4
    /**
     * When expressions are similar to if expressions since they return values, but when is nice
     * when we have a finite set of cases to consider
     */
    val output = when (x) {
        1 -> "x is 1"
        2 -> "x is 2"
        3, 4 -> { // we can combine multiple cases into one, and even have blocks of code run
            println("hello")
            "x is 3 or 4"
        }
        else -> "is not 1, 2, 3, or 4"
    }
    println(output)

}