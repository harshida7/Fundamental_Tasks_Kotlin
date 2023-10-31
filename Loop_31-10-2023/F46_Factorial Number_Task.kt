fun main() {


    var fact = 1

   println("Enter Number:: ")
    var num:Int = readLine()!!.toInt()

    for(i in 1 .. num)
    {
       fact = fact * i
   }

    println("Factorial of $num:: " + fact)
}