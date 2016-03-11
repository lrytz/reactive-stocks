name := """reactive-stocks"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.7"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalacOptions ++= Seq("-Ybackend:GenBCode", "-Ydelambdafy:method")

// scalaz-bintray resolver needed for specs2 library
resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

libraryDependencies ++= Seq(
  ws, // Play's web services module
  specs2 % Test,
  "org.specs2" %% "specs2-matcher-extra" % "3.6" % Test,
  "org.easytesting" % "fest-assert" % "1.4" % Test,
  "com.typesafe.akka" %% "akka-testkit" % "2.3.11" % Test,
  "org.webjars" % "bootstrap" % "2.3.2",
  "org.webjars" % "flot" % "0.8.0",

  "info.cukes" %% "cucumber-scala" % "1.2.4" % Test,
  "info.cukes" % "cucumber-junit" % "1.2.4" % Test
)

routesGenerator := InjectedRoutesGenerator

fork in run := true
