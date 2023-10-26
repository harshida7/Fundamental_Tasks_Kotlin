fun main()
{
    println("Enter full name in this format (first middle last): ")
    val fullName = readLine()!!.split(" ")

    val fname = fullName[0]

    val mname = fullName[1]

    val lname = fullName[2]

    println("Abbreviated name is ${fname[0]}. ${mname[0]}. $lname")
}