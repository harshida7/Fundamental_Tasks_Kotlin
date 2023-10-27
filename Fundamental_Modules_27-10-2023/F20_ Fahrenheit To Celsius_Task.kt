

fun main() {

   //°C = 5/9(°F – 32)

    println("Enter Fahrenheit:: ")
    var f:Float = readLine()!!.toFloat()


    var c =  (f - 32) * 5 / 9

    println("Celsius Value Is :: " + c.toDouble())
}