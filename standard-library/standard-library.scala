import scala.math._

object Main extends App {

  //Lists
  val carBrands = List("BMW", "Ferrari", "Dodge")
  println (carBrands)

  val carBrandsAndModels = List(List("335", "535", "750li"), List("LaFerrari, Enzo"))
  println(carBrandsAndModels)

  //Vector
  val iceCreamFlavours: Vector[String] = Vector("Chocolate", "Strawberry", "Vanilla")
  println(iceCreamFlavours)

  //Hash Hashmaps
  val iceCreamFlavoursMap = scala.collection.mutable.HashMap.empty[String, String]
  iceCreamFlavoursMap += ("C"->"Chocolate")
  iceCreamFlavoursMap += ("S"->"Strawberry")
  iceCreamFlavoursMap += ("V"->"Vanilla")
  println (iceCreamFlavoursMap)

  //Math STL examples
  var m = max(5,9)
  println (m)
  var n = min (12,4)
  println (n)
  var e = exp(28)
  println (e)
  var p = pow(5, 2)
  println (p)

}
