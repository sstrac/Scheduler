import scala.util.Random

object MainScheduler{

  def main(args : Array[String]): Unit = {
    val hoursToMinutes = (time: Double) => time*60 //higher-order function
    val rand = new Random()
    val activites: Seq[String] = Seq("Piano", "Choir", "Angular")
    //val noActivitiesPerDay = 2
      for (i <- 0 until model.Days.maxId) {
        var activity = randActivity(rand, activites)
        println(model.Days(i) + ": " + activity.name + " for " + hoursToMinutes(activity.duration).toInt+" minutes")
      }
  }
  def randActivity (rand : Random, stringActivities: Seq[String]): Activity  ={
    /*Creates an Activity object from array of strings and is given a random duration*/
    var randActivityString = stringActivities(rand.nextInt(stringActivities.length))
    val timeSpent : Double = 2*BigDecimal(rand.nextDouble()).setScale(1, BigDecimal.RoundingMode.HALF_UP).toDouble
    val randActivity = new Activity(randActivityString, timeSpent)
    return randActivity
  }

}
//plans out whole timetable, one activity each day 7 days a week for a specified amount of timne
//weekdays will have a smaller set of times than weekends

