
fun main() {


    println("Enter Alphabet:: ")
    var ch:Char = readLine()!!.single()

    if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
    {
        println("Character $ch Is ::  Alphabet")
    }

    else
    {
        println("Character $ch Is ::  Not Alphabet")
    }

}