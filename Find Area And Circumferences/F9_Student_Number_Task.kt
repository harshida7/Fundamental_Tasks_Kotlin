fun main(args: Array<String>) {

    //apples required  reqApp = s1 * 5

    println("Enter Numbers Of Student:")
    var students:Int = readLine()!!.toInt() // input from user


    var apples = 5 // defualt apples value

    println("Need to Give Apple Is : " + apples)

    var reqApples = students * apples

    println("Apples Are Required is :: " + reqApples)



}