import org.scalatest.funsuite.AnyFunSuite

class CommonTest extends AnyFunSuite {

  test("successful Pi finding test") {
    val Pi = Math.PI

    var accuracy: Int = 5
    var testPi = Common.calculatePi(accuracy)

    assert(Math.floor(Pi * Math.pow(10, accuracy - 2)) == Math.floor(testPi * Math.pow(10, accuracy - 2)))


    accuracy = 7
    testPi = Common.calculatePi(accuracy)

    assert(Math.floor(Pi * Math.pow(10, accuracy - 2)) == Math.floor(testPi * Math.pow(10, accuracy - 2)))


  }

  test("failure in calculating Pi") {
    assertThrows[AssertionError] {
      Common.calculatePi(0)
    }

    assertThrows[AssertionError] {
      Common.calculatePi(10)
    }
  }

}
