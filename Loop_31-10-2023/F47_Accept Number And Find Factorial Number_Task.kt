fun main() {

    var arr = IntArray(100)
    var fact = 0

    println("Enter array size")
   var size:Int = readLine()!!.toInt()

    println("Enter array elements")
    for (i in 0 until size) {
        arr[i] = readLine()!!.toInt()
    }

    for (i in 1 .. size) {

        fact = arr[i] * fact

        println("Factorial of $size :: " + fact)
    }


}