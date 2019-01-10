import java.util.*

fun main(args: Array<String>) {
    val x: Int = 9
    if (x < 8) { // an if expression checks if a condition is true and then runs a piece of code
        println("x is less than 8")
    } else { // the else block is run if the if condition is false
        println("x is not less than 8")
    }

    val scanner = Scanner(System.`in`)
    println("Enter your age: ")
    val age = scanner.nextInt()

    /**
     * If else blocks are considered expressions in the Kotlin language, meaning that
     * they actually evaluate to a value, so we can store their results in variables and use them
     * later. The last statement of each block is the return value if that block is run.
     */
    val output = if (age < 13) {
        "You are a child"
    } else if (age >= 13 && age < 18) { // an else if block is run if the if expression above it is false and its condition is true
        "You are a teenager"
    } else {
        "You are an adult"
    }
    println(output)
}
