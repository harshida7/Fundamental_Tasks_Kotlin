

fun main() {

   println("Enter Salary :: ")
    var basicsalary:Int = readLine()!!.toInt()

      if(basicsalary <= 10000)
      {
            var hra = basicsalary * 20 / 100
            var da = basicsalary * 80 / 100

          var gs = basicsalary + hra + da

          println("Employee's Gross Salary Is:: " + gs)
      }

   else if(basicsalary <= 20000)
    {
        var hra = basicsalary * 25 / 100
        var da = basicsalary * 90 / 100

        var gs = basicsalary + hra + da

        println("Employee's Gross Salary Is:: " + gs)
    }

  else if(basicsalary > 20000)
      {
          var hra = basicsalary * 30 / 100
          var da = basicsalary * 95 / 100

          var gs = basicsalary + hra + da

          println("Employee's Gross Salary Is:: " + gs)
      }

    else
    {

    }


}