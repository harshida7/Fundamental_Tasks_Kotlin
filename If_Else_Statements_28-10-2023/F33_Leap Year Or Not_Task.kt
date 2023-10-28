
fun main() {


    println("Enter Year:: ")
    var year:Int = readLine()!!.toInt()

    if(year % 4 == 0)
    {
        println("Year is Leap Year")
    }

    else
    {
        println("Year is Not Leap Year")
    }

}