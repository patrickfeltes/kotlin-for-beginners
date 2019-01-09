fun main(args: Array<String>) {
    val x: Boolean = true

    // logical operations
    /**
     * These operations are short-circuit operations, meaning that if they can determine the value
     * with absolute certainty at a certain point, they will not evaluate the rest of the expression
     */
    // and
    // and checks if both sides are true and returns true, otherwise returns false
    println(true && true)
    println(true && false)
    println(false && false)
    println()
    // or
    // or checks if one side is true and returns true, otherwise false
    println(true || true)
    println(true || false)
    println(false || false)
    println()
    // not
    // not flips true to false and false to true
    println(!true)
    println(!false)
    println()

    /**
     * These are the same as above, except they do not short-circuit
     */
    println(true and true)
    println(true and false)
    println(false and false)
    println()
    println(true or true)
    println(true or false)
    println(false or false)
    println()

    // equality operations
    // returns true when two things are equal
    println(4 == 4)
    // returns true when two things are not equal
    println(4 != 3)
    // can also be used to compare strings
    println("abc" == "abc")
    println()

    // comparison operations
    println(4 < 4) // less than
    println(4 <= 4) // less than or equal to
    println(4 > 4) // greater than
    println(4 >= 4) // greater than or equal to
    println()

    // combine these
    // we can combine these to determine more complex things about the state of our variables
    println((4 == 4) && (4 < 3))
}
