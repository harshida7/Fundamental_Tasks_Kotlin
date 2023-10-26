import java.lang.ArrayIndexOutOfBoundsException as ArrayIndexOutOfBoundsException1

fun main() {
    println("Enter Country Name (first middle last): ")
    var fullName = readLine()!!.split(" ")

    var fname = fullName[0]

    var mname = fullName[1]

    var lname = fullName[2]


  println("Abbreviated name is ${fname[0]}.${mname[0]}.${lname[0]}.")



}