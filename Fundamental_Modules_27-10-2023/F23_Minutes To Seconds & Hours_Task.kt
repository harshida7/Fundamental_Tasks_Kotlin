

fun main() {


    println("Enter Minuts:: ")
    var minutes:Float = readLine()!!.toFloat()


    var hours = minutes / 60

    var seconds = hours * 3600

    println("Hours = $hours Seconds = $seconds ")

}