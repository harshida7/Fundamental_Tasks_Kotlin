import kotlin.math.pow

fun main() {
// based on LIFE INSURANCE PREMIUM CALCULATOR Write a C program that calculates monthly, quarterly, half-yearly and yearly
   println("Enter Annual Salary :: ")
   var annualSalary: Double = readLine()!!.toDouble()

   println("Enter Policy Term Years :: ")
   var term: Int = readLine()!!.toInt()


    var monthly = annualSalary /(term * 12)
    println("Enter Monthly Premium :: " + monthly)

    var quarterly = annualSalary /(term * 4)
    println("Enter Quarterly Premium :: " + quarterly)

    var halfyear = annualSalary /(term * 2)
    println("Enter Half Yearly Premium :: " + halfyear)

    var yearly = annualSalary / term
    println("Enter Yearly Premium :: " + yearly)


}