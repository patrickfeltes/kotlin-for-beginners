import java.util.*

fun main(args: Array<String>) {
    val random = Random()
    val number = random.nextInt(101) // generate a random number in 0-100

    val scanner = Scanner(System.`in`)
    var guess = scanner.nextInt() // we ask the user for their guess

    while (guess != number) { // continue until the guess is correct
       if (guess > number) { // if it's too low, tell them
           println("You should guess a lower number!")
       } else if (guess < number) { // if it's too high, tell them
           println("You should guess a higher number!")
       }
       // ask for another guess
       guess = scanner.nextInt()
    }

    // tell them they got it right
    println("You got the right number!")
}
