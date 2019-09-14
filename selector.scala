import scala.util.Random

object MainScheduler extends App{
  val rand = new Random()
  val maxHoursWeekdays: Integer = 6
  val maxHoursWeekends: Integer = 6
  val weekdays : Seq[String]=Seq("Monday","Tuesday","Wednesday","Thursday","Friday")
  val weekends : Seq[String]=Seq("Saturday", "Sunday")
  for (i <- 0 until 5)
    println(weekdays(i)+": "+chooseActivity(rand)+" for "+chooseTime(rand)+" hours")
  for(i <- 0 until 2)
    println(weekends(i)+": "+chooseActivity(rand)+" for "+chooseTime(rand)+" hours")
  def chooseActivity (rand: Random):String ={
    val activites:Seq[String]=Seq("Piano", "Choir", "Angular", "Scala")
    val number = rand.nextInt(activites.size) //vals are immutable, vars are mutable
    return activites(number)
  }

  def chooseTime (rand : Random): Double  ={
    val times:Seq[Double]=Seq(0.5,1,2,3)
    var index=rand.nextInt(times.size)
    return times(index)
  }
}
//plans out whole timetable, one activity each day 7 days a week for a specified amount of timne
//weekdays will have a smaller set of times than weekends

