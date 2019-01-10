/**
 * For loops give us the ability to run a chunk of code over and over
 * with changing values. This is amazing for doing large tasks since it would be nearly impossible
 * to write out the code of we wanted to do something a million times.
 */

fun main(args: Array<String>) {
    for (i in 1..10) { // this look iterates the variable i over 1 through 10 printing everything out
        println(i)
    }
    println()
    for (i in 10 downTo 1) { // this does the same thing but down from 10 to 1
        println(i)
    }
    println()
    for (i in 1 until 10 step 2) { // this goes from 1 until 10, so it doesn't include 10, and goes in increments of 2
        println(i)
    }
}
