name:="fooz"

scalaVersion:="2.10.0"

organization := "com.andersen-gott"

libraryDependencies ++=
  Seq(
    "org.scalatest" %% "scalatest" % "1.9.1" % "test",
    "com.google.guava" % "guava" % "11.0.2",
    "org.mongodb" %% "casbah" % "2.5.0",
    "org.mongodb" % "mongo-java-driver" % "2.10.1"
  )