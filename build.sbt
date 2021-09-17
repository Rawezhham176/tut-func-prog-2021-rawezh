import Dependencies._

ThisBuild / scalaVersion     := "2.13.6"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "de.otto.tutorium"
ThisBuild / organizationName := "OTTO GmbH & Co KG"

lazy val root = (project in file("."))
  .settings(
    name := "Tutorium Functional Programming 2021",
    libraryDependencies += scalaTest % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
