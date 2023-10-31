import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var i = 1
    var n: Int
    var even = 0
    var odd = 0

    println("Enter the Ending value:")
    n = scanner.nextInt()

    println("Even numbers:")
    while (i <= n) {
        if (i % 2 == 0) {
            println("$i")
            even++
        }
        i++
    }

    println("Odd numbers:")
    i = 1
    while (i <= n) {
        if (i % 2 == 1) {
            println("$i")
            odd++
        }
        i++
    }

    println("\nTotal even numbers:$even")
    println("Total odd numbers:$odd")
}