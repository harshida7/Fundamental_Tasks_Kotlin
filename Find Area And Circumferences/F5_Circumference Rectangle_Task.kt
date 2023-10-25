fun main(args: Array<String>) {

    //circumference of Rectangle

    println("Enter Width:")
    var w:Float = readLine()!!.toFloat()

    println("Enter Length:")
    var l:Float = readLine()!!.toFloat()


    var recArea = w * l

    var circumRec = 4 * recArea


    println("Rectangle Circumferance:: " + circumRec)




}