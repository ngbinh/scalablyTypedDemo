lazy val webMonaco = (project in file("."))
  .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin, ScalablyTypedConverterGenSourcePlugin)
  .settings(
    scalaVersion := "2.13.4",
    name := "web-monaco",
    stSourceGenMode := SourceGenMode.Manual((sourceDirectory in Compile).value/ "scala" / "scalablytyped"),
    libraryDependencies ++= Seq(
      "com.olvind" %%% "scalablytyped-runtime" % "2.4.0"
    ),
    Compile / npmDependencies ++= Seq(
      "monaco-editor" -> "0.22.3"
    ),
    scalacOptions += s"-Wconf:cat=w-flag-dead-code&src=${(sourceDirectory in Compile).value}/scala/scalablytyped/" +
      s".*:is,cat=unused&src=${(sourceDirectory in Compile).value}/scala/scalablytyped/.*:is",
    stFlavour := Flavour.Japgolly,
    stIgnore ++= List("react", "react-dom"),
    stMinimize := Selection.AllExcept("monaco-editor"),
    stOutputPackage := "anduin.facades"
  )

