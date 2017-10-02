name := "gallet"

version := "0.1"

scalaVersion := "2.12.3"

val AKKA_VERSION="2.5.6"
val AKKA_LIBs= {
  Seq(
    "com.typesafe.akka" %% "akka-actor" % AKKA_VERSION,
    "com.typesafe.akka" %% "akka-testkit" % AKKA_VERSION % "test",
    "com.typesafe.akka" %% "akka-persistence" % AKKA_VERSION,
    "com.typesafe.akka" %% "akka-http" % "10.0.10",
    "com.typesafe.akka" %% "akka-persistence-cassandra" % "0.56"
  )
}

libraryDependencies ++= AKKA_LIBs

// https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.12
//libraryDependencies += "com.typesafe.akka" % "akka-actor_2.12" % "2.5.6"
