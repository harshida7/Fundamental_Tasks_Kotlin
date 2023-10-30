/**
 * Kotlin program to calculate total electricity bill
 */
fun main() {

    var unit: Int
    var amt: Float
    var totalamt: Float
    var scharge: Float

    println("Enter total units consumed: ")
    unit = readLine()!!.toInt()

    if(unit <= 50)
    {
        amt = unit * 0.50f
    }
    else if(unit <= 150)
    {
        amt = 25 + ((unit-50) * 0.75f)
    }
    else if(unit <= 250)
    {
        amt = 100 + ((unit-150) * 1.20f)
    }
    else
    {
        amt = 220 + ((unit-250) * 1.50f)
    }

    scharge = amt * 0.20f

    totalamt  = amt + scharge
    println("Electricity Bill = Rs. %.2f".format(totalamt))
}