name := "obfuscated-fibonacci-scala"

organization := "com.franklinchen"

organizationHomepage := Some(url("http://franklinchen.com/"))

homepage := Some(url("http://github.com/FranklinChen/obfuscated-fibonacci-scala"))

startYear := Some(2015)

description := "Obfuscated Fibonacci in Scala"

version := "1.0.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.6.1" % Test
)
