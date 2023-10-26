import kotlin.math.pow

fun main() {

    // Principal amount
    println("Enter Principal Amount:: ")
    var p:Double = readLine()!!.toDouble()

    // Annual rate of interest
    println("Enter Rate:: ")
    var r:Double = readLine()!!.toDouble()

    // Time
    println("Enter Time:: ")
    var t:Double = readLine()!!.toDouble()

    // Calculating compound Interest
    var amt = p * ((1 + r / 100).pow(t))

    var cinrest = amt - p

    println("Compound Interest is : $cinrest")
}