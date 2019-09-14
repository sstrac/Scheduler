import scala.util.Random

object MainSelector extends App{
  chooseActivity()

  def chooseActivity () ={
    var activites=Array("Piano", "Choir", "Angular")
    val rand = new Random()
    val number = rand.nextInt(3)
    //println(number+"\n")
    var activity=activites(number)
    print(activity+"\n")
  }
}

