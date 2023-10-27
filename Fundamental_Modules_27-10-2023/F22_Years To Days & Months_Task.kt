

fun main() {


    println("Enter Years:: ")
    var years:Int = readLine()!!.toInt()


    var months = 12 * years

    var days = 365 * years

    println("Months = $months Days = $days ")

}