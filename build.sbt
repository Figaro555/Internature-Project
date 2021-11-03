import Dependencies._


ThisBuild / organization := "3 Task"

ThisBuild / version      := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.7"

lazy val provider1 = (project in file("Provider1"))
  .settings(
    name := "Provider1",
    libraryDependencies ++= provider1Deps
  )

lazy val provider2 = (project in file("Provider2"))
  .settings(
    name := "Provider2",
    libraryDependencies ++= provider2Deps
)

