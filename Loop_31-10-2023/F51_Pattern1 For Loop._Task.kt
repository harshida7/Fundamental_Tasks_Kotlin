fun main() {

    var rows: Int
    var cols: Int
    var i: Int
    var j: Int
    var k: Int


    print("Enter number of rows: ")
    rows = readLine()!!.toInt()

    print("Enter number of columns: ")
    cols = readLine()!!.toInt()

    k = 1

    for (i in 1..rows) {
        for (j in 1..cols) {
            print(k.toString().padEnd(3))
            k++
        }
        println()
    }
}
