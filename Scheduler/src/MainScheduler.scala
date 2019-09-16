import scala.util.Random
import scala.io.Source

object MainScheduler{
  val hoursToMinutes = (time: Double) => time*60 //higher-order function
  val getDuration = (maxHours : Int, maxActivities : Int) => maxHours/maxActivities //divide by 0 error possible
  def main(args : Array[String]): Unit = {

    val rand = new Random()
    val activities = readActivities("C:\\Users\\srstr\\IntelliJIDEAProjects\\activity\\Scheduler\\src\\resources\\activities.txt")
    createWeekdaySchedule(rand, 3, 3, activities)
  }
  def getRandActivity(rand : Random, activities: Seq[String]): Activity  ={
    /*Creates an Activity object from array of strings and is given a random duration*/
    val randActivityString = activities(rand.nextInt(activities.length))
    val times : Seq[Double] = Seq(0.5, 1.0, 1.5, 2.0) //hardcoded
    val timeSpent : Double = times(rand.nextInt(times.length))
    return new Activity(randActivityString, timeSpent)
  }
  def getRandActivity(rand : Random, activities : Seq[String], duration : Double) : Activity = {
    val randActivityString = activities(rand.nextInt(activities.length))
    return new Activity(randActivityString, duration)
  }
  def readActivities(filePath : String): Seq[String] ={
    //returns a set of activities read from input filepath as a String Sequence
    val file = Source.fromFile(filePath)
    val strings = file.getLines().toSeq
    file.close()
    return strings
  }
  def createWeekdaySchedule (rand : Random, maxHours : Int, maxActivities : Int, activities : Seq[String]): Unit ={
    val duration = getDuration(maxHours,maxActivities)
    for (i <- 0 until model.Days.maxId) {
      println(model.Days(i))
      for (j <- 0 until maxActivities){
        val activity = getRandActivity(rand, activities, duration)
        println(j+". "+activity.name+" for "+hoursToMinutes(activity.duration))
      }
    }
  }

}
//plans out whole timetable, one activity each day 7 days a week for a specified amount of timne
//weekdays will have a smaller set of times than weekends

