error id: file://<WORKSPACE>/build.sbt:
file://<WORKSPACE>/build.sbt
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 35
uri: file://<WORKSPACE>/build.sbt
text:
```scala

scalaVersion in ThisBuild := "2.12@@.5"
crossScalaVersions in ThisBuild  := Seq("2.11.12", "2.12.5")

scalaVersion := "2.13.0"
crossScalaVersions := Seq("2.12.12", "2.13.3")

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-json" % "2.8.1" % "provided",
  "org.specs2" %% "specs2-core" % 
val core =
  crossProject.crossType(CrossType.Pure)
  .settings(
    organization := "au.id.jazzy",
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


```


#### Short summary: 

empty definition using pc, found symbol in pc: 