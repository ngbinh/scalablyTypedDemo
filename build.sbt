lazy val webMonaco = (project in file("."))
  .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin, ScalablyTypedConverterGenSourcePlugin)
  .settings(
    scalaVersion := "2.13.4",
    name := "web-monaco",
    stSourceGenMode := SourceGenMode.Manual((sourceDirectory in Compile).value / "scala" / "scalablytyped"),
    libraryDependencies ++= Seq(
      "com.olvind" %%% "scalablytyped-runtime" % "2.4.0"
    ),
    Compile / npmDependencies ++= Seq(
      "quill" -> "1.3.7",
      "@types/quill" -> "2.0.5",
      "webpack-merge" -> "4.2.2"
    ),
    scalacOptions += s"-Wconf:cat=w-flag-dead-code&src=${(sourceDirectory in Compile).value}/scala/scalablytyped/" +
      s".*:is,cat=unused&src=${(sourceDirectory in Compile).value}/scala/scalablytyped/.*:is",
    stFlavour := Flavour.Japgolly,
    stMinimize := Selection.AllExcept("quill"),
    stOutputPackage := "facades",
    scalaJSUseMainModuleInitializer := true,
    Compile / fastOptJS / webpackEmitSourceMaps := false,
    requireJsDomEnv in Test := true,
    version in installJsdom := "16.4.0",
    fastOptJS / webpackConfigFile := Some(baseDirectory.value / "webpack.dev.js"),
    webpackBundlingMode := BundlingMode.Application,
    useYarn := true
  )

