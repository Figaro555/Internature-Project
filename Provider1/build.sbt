name := "Provider1"

version := "0.1"

scalaVersion := "2.13.7"


lazy val core = RootProject(file("../Common"))

val main = Project(id = "application", base = file(".")).dependsOn(core)