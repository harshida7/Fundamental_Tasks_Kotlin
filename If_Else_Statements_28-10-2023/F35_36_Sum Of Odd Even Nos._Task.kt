import java.util.Scanner

fun main(args: Array<String>) {

    var n: Int
    var h: Int
    var even = 0
    var odd = 0

    var sc = Scanner(System.`in`)

    print("Enter a number:")
    n = sc.nextInt()

    while (n > 0) {
        h = n % 10
        if (h % 2 == 0) {
            even += h
        } else {
            odd += h
        }
        n /= 10
    }

    println("Even Digits:   $even")
    println("Odd Digits:    $odd")
}