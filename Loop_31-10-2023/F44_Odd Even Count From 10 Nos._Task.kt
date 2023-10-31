fun main() {

    val arr = IntArray(100)
    var size: Int
    var oddCount = 0
    var evenCount = 0
    var i: Int

    println("Enter array size")
    size = readLine()!!.toInt()

    println("Enter array elements")
    for (i in 0 until size) {
        arr[i] = readLine()!!.toInt()
    }

    for (i in 0 until size) {
        if (arr[i] % 2 == 1) {
            oddCount++
        } else {
            evenCount++
        }
    }

    println("Odd number count = $oddCount")
    println("Even number count = $evenCount")
}