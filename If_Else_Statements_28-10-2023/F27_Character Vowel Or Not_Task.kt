


fun main() {


    println("Enter Alphabet:: ")
    var ch:Char = readLine()!!.single()

    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
        || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
    {
        println("Character $ch Is ::  Vowel")
    }

    else
    {
        println("Character $ch Is ::  Not Vowel")
    }

}