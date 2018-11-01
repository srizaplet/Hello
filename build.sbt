name := "Hello"

version := "0.1"

scalaVersion := "2.11.8"
val sparkVersion = "2.3.0"

libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.2" % Test,
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion)