

fun main() {

    var n = 0
    var amt = 0


    println("Enter Person1 Expense:: ")
    var p1S:Double = readLine()!!.toDouble()

    println("Enter Person2 Expense:: ")
    var p2S:Double = readLine()!!.toDouble()

    println("Enter Person3 Expense:: ")
    var p3S:Double = readLine()!!.toDouble()

    println("Enter Person4 Expense:: ")
    var p4S:Double = readLine()!!.toDouble()

    println("Enter Person5 Expense:: ")
    var p5S:Double = readLine()!!.toDouble()

    var total = p1S + p2S + p3S + p4S + p5S
    println("Total Expense :: " + total)


    var avg = total / 5
    println("Average Expense :: " + avg)

}