import sbt._

object Dependencies {

  val apacheCommonV = "3.6.1"

  //libraries
  val apacheCommon = "org.apache.commons" % "commons-math3"

  val provider1Deps = Seq(apacheCommon % apacheCommonV)

  val provider2Deps = Seq(apacheCommon % apacheCommonV)
}
