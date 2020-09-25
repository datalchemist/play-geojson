
scalaVersion in ThisBuild := "2.12.5"
crossScalaVersions in ThisBuild  := Seq("2.11.12", "2.12.5")



publishTo in ThisBuild := Some("datuman-maven-repo" at "http://178.62.90.239:8081/artifactory/datuman-private-repo/")
credentials in ThisBuild  += Credentials(Path.userHome / ".sbt" / ".datuman-credentials")

val core =
  crossProject.crossType(CrossType.Pure)
  .settings(
    organization := "ch.datuman",
    name := "play-geojson",
    libraryDependencies ++= Seq(
      "com.typesafe.play" %%% "play-json" % "2.6.9" % "provided",
      "org.specs2" %% "specs2-core" % "3.9.2" %  "test"
    ),

    // resolvers += "Scalaz Bintray Repo" at "https://dl.bintray.com/scalaz/releases",

    homepage := Some(url("https://github.com/jroper/play-geojson")),
    licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0")),
    // Release settings
    // bintrayRepository := "maven",
    // bintrayPackage := "play-geojson",
    releasePublishArtifactsAction := PgpKeys.publishSigned.value,
    releaseCrossBuild := true,
    releaseTagName := (version in ThisBuild).value
)
val coreJVM = core.jvm
val coreJS = core.js

val `play-geojson` =
  project.in(file(".")).aggregate(coreJVM, coreJS)

