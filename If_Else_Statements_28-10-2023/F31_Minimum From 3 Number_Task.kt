
fun main() {

    println("Enter Number1::")
    var num1:Int = readLine()!!.toInt()

    println("Enter Number2::")
    var num2:Int = readLine()!!.toInt()

    println("Enter Number3::")
    var num3:Int = readLine()!!.toInt()


    var minNum = minOf(num1 , num2, num3)

    println("Minimum No. Is:: " + minNum)
}





