
fun main() {

    println("Enter Month Number::")
    var num1:Int = readLine()!!.toInt()

    when(num1)
    {
        1 ->
        {
            println("Month Is : January")
        }
        2 ->
        {
            println("Month Is : February")
        }
        3 ->
        {
            println("Month Is : March")
        }
        4 ->
        {
            println("Month Is : April")
        }
        5 ->
        {
            println("Month Is : May")
        }
        6 ->
        {
            println("Month Is : June")
        }
        7 ->
        {
            println("Month Is : July")
        }
        8 ->
        {
            println("Month Is : August")
        }
        9 ->
        {
            println("Month Is : September")
        }
        10 ->
        {
            println("Month Is : October")
        }
        11 ->
        {
            println("Month Is : November")
        }
        12 ->
        {
            println("Month Is : December")
        }
        else ->
        {
            println("Enter Month (1 - 12)")
        }
    }
}





