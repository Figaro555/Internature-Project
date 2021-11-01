object Common {

  def calculatePi(accuracy: Int): Double = {
    assert(accuracy >= 1, "accuracy cant be less then one")
    assert(accuracy < 10, "for this number it will count very long")

    val accuracyNum: Double = Math.pow(10, - accuracy + 1)

    @scala.annotation.tailrec
    def f(n: Int, acc: Double = 3): Double = {
      val numChange: Double = 4.toDouble / (n * (n + 1) * (n + 2)) * Math.pow(-1, (n / 2) % 2 + 1)

      if (Math.abs(numChange) < accuracyNum/2) acc
      else f(n + 2, acc + numChange)

    }

    f(2)

  }


}

object Main extends App {
  println(Math.PI)

  println(Common.calculatePi(9))
}
