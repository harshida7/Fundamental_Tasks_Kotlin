fun main(args: Array<String>) {

    //area of a rectangular prism formula  a = 2 (wl+hl+hw)

    println("Enter Width:")
    var w:Float = readLine()!!.toFloat()

    println("Enter Height:")
    var h:Float = readLine()!!.toFloat()

    println("Enter Length:")
    var l:Float = readLine()!!.toFloat()


    var wl = w * l   // wl

    println("Wl  " + wl)

    var hl = h * l   // hl
    println("hl  " + hl)

    var hw = h * w   // hw
    println("hw  " + hw)

    var recPrism = 2 * (wl + hl + hw)

    println("Area Of A Rectangular Prism :: " + recPrism)




}