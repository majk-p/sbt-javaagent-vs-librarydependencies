scalaVersion := "3.4.1"

lazy val root =
  (project in file("."))
    .enablePlugins(JavaAgent)
    .settings(
      libraryDependencies := Seq("com.datadoghq" % "dd-trace-api" % "1.32.0"),
      javaAgents += {
        "com.datadoghq" % "dd-java-agent" % "1.32.0" % "test"
      }
    )
