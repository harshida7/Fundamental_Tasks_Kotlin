
fun main() {

    println("Enter Month Number::")
    var num1:Int = readLine()!!.toInt()


   if(num1 == 1 || num1 == 3 || num1 == 5 || num1 == 7 || num1 == 8 || num1 == 10 || num1 == 12)
   {
       println("Month $num1 Has : 31 Days")
   }

    else if (num1 == 4 || num1 == 6 || num1 == 9 || num1 == 11)
    {
        println("Month $num1 Has : 30 Days")
    }

   else if (num1 == 2)
   {
       println("Month $num1 Has : 28 Or 29 Days")
   }

    else
   {
       println("Enter Month Number B/w 1 To 12")
   }
}





