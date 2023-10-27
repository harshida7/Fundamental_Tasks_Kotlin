

fun main() {

    var n = 0
    var amt = 0

    println("Enter Number Of Persons:: ")
    var num:Int = readLine()!!.toInt()


   while (num > n)
   {
       println("Ente Persons Name:: ")
       var p1:String = readLine()!!.toString()
        n++
   }


    println("Enter Person1 Salary:: ")
    var p1S:Double = readLine()!!.toDouble()

    println("Enter Person2 Salary:: ")
    var p2S:Double = readLine()!!.toDouble()

    println("Enter Person3 Salary:: ")
    var p3S:Double = readLine()!!.toDouble()

    println("Enter Person4 Salary:: ")
    var p4S:Double = readLine()!!.toDouble()

    println("Enter Person5 Salary:: ")
    var p5S:Double = readLine()!!.toDouble()

    var totalSalary = p1S + p2S + p3S + p4S + p5S
    println("Total Salary :: " + totalSalary)


    var avgSalary = totalSalary / 5
    println("Average Salary :: " + avgSalary)

}