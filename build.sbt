libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.4"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"
libraryDependencies += "com.lihaoyi" %% "pprint" % "0.5.3"
libraryDependencies += "com.lihaoyi" %% "fastparse" % "1.0.0"

lazy val CParser = ProjectRef(file("CParser"), "cparser")
lazy val CParserWebDemo = ProjectRef(file("CParserWebDemo"), "CParserWebDemo")

lazy val CLanguageUmbrella = (project in file("."))
  .settings(
    name := "CLanguageUmbrella",
    scalaVersion := "2.12.4"
  ).dependsOn(CParser, CParserWebDemo)

