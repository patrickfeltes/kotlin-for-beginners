package tutorial2

fun main(args: Array<String>) {

    /**
     * This is a variable, called x, where we store the value 4
     * Variables can be used to store information, so that we can use that information so that we
     * can use that information in a condensed way, by saying "x" instead of "4"
     */
    var x = 4
    println(x)

    // this is another variable, but this time we are storing something called a String
    var y = "Patrick"
    print("Hello, my name is ")
    print(y)
    print("\n")

    /**
     * This is also a variable, but because it uses the 'val' keyword, we cannot change its value
     * So, for example, adding z = 6 after this line
     * would break our code
      */
    val z = 4
    x = 6 // here we can see that since x is a var, we can change its value

    println(x)
    println(z)

}
