import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter a Number ")

    val n = scanner.nextInt()

    for (i in 1..10) {
        println("$n * $i = ${n * i}")
    }
}