
fun main() {

    println("Enter Value::")
    var ch:Char = readLine()!!.single()

    if(ch >= 'A' && ch <= 'Z')
    {
        println("Character Is In :: UPPERCASE")
    }

   else if(ch >= 'a' && ch <= 'z')
    {
        println("Character Is In :: lowercase")
    }

    else if(ch >= '0' && ch <='9')
    {
        println("Character Is In :: Digit")
    }

    else
    {
        println("Character Is In :: Special Character")
    }

}





