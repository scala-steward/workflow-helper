import sbt.Keys.libraryDependencies

ThisBuild / version := "v0.4.0-SNAPSHOT"
ThisBuild / organization := "Tegonal GmbH"

ThisBuild / scalaVersion := "3.5.2"

lazy val root = (project in file("."))
  .settings(name := "workflow-helper")
  .settings(
    libraryDependencies ++= Seq(
      // test dependencies
      "org.scalameta" %% "munit" % "1.0.2" % Test
    )
  )

// release process via .github/workflows/release.yml
