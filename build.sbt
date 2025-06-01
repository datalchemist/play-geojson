
scalaVersion in ThisBuild := "2.12.12"
// crossScalaVersions := Seq("2.12.12", "2.13.3")

val core =
  crossProject.crossType(CrossType.Pure)
  .settings(
    organization := "ch.datuman",
    name := "play-geojson",
    libraryDependencies ++= Seq(
      "com.typesafe.play" %% "play-json" % "2.8.1" % "provided",
      "org.specs2" %% "specs2-core" % "4.10.2" %  "test"
    )
  )
val coreJVM = core.jvm
val coreJS = core.js

val `play-geojson` =
  project.in(file(".")).aggregate(coreJVM, coreJS)

