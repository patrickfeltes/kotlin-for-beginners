package tutorial4

import java.util.*

fun main(args: Array<String>) {

    /**
     * These two lines wait for a user to input something, and then the code reprints what the
     * user entered
     */
    val userInput: String? = readLine()
    println(userInput)

    /**
     * This piece of code asks a user for their name and then prints 'Hello, name!'
     */
    println("Please enter your name: ")
    val name: String? = readLine()
    print("Hello, ")
    print(name)
    print("!\n")

    /**
     * This piece of code creates a Scanner object (covered more later) and allows
     * us to read in different data types, such as Doubles and Ints
     */
    val scanner = Scanner(System.`in`)
    val userDouble = scanner.nextDouble()

    // in this we print out our entered double plus 1
    println(userDouble + 1)

}
