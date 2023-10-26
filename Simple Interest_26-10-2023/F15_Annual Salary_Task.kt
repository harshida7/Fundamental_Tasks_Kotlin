import kotlin.math.pow

fun main() {

   println("Enter Your Monthly Salary::")
    var salary:Double = readLine()!!.toDouble()

    var months = 12

    var annualSalary = salary * months

    println("Your Annual Salary Is ::"  + annualSalary)

}