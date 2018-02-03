lazy val CParser = ProjectRef(file("CParser"), "CParser")
lazy val CParserWebDemo = ProjectRef(file("CParserWebDemo"), "CParserWebDemo")

lazy val CLanguageUmbrella = (project in file("."))
  .settings(
    name := "CLanguageUmbrella",
    scalaVersion := "2.12.8"
  ).dependsOn(CParser, CParserWebDemo)

