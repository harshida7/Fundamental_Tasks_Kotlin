import kotlin.math.pow

fun main() {


    println("Enter Monthly Salary:: ")
    var salary:Double = readLine()!!.toDouble()

    println("Enter Loan Installment % :: ")
    var loan:Float = readLine()!!.toFloat()

    println("Enter Insaurance Premium % :: ")
    var premium:Float = readLine()!!.toFloat()

    var installment = (salary * loan) / 100
    println("Enter installment:: " + installment)

    var insurance = (salary * premium) / 100
    println("Enter insaurance:: " + insurance)

    var gross = salary - installment - insurance
    println("Compound Interest is : $gross")
}