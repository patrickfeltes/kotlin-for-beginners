import java.util.*

fun main(args: Array<String>) {
    var i: Int = 1
    while (i <= 10) { // a while loop keeps repeating until the condition is no longer true
        println(i)
        i++ // i = i + 1
    }
    // the above code functions exactly like the first for loop from tutorial 9

    // here we as a user for their age and keep asking them until they input a valid age
    println("Enter your age: ")
    val scanner = Scanner(System.`in`)
    var age = scanner.nextInt()
    while (age !in 1..100) {
        println("Please enter your age again: ")
        age = scanner.nextInt()
    }
    print("Your age is ")
    println(age)
}
