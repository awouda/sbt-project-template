name := "sbt-project-XYZ"
 
version := "1.0"
 
scalaVersion := "2.11.5"
 
libraryDependencies ++=
  Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.9",
   "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"
   )
  
