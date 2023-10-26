fun convertToASCII(N:Int) {
    var num = N

    while (num >= 0) {
        val d = num % 10
        println("$d (${d + 48})")
        num /= 10
    }
}

// Driver Code
fun main() {

    println("Enter Any Integer : ")
    val N:Int = readLine()!!.toInt()


    convertToASCII(N)
}