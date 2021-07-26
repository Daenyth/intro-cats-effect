lazy val baseSettings: Seq[Setting[_]] = Seq(
  scalaVersion := "2.12.14",
  scalacOptions ++= Seq(
    "-deprecation",
    "-encoding",
    "UTF-8",
    "-feature",
    "-language:higherKinds",
    "-language:implicitConversions",
    "-language:existentials",
    "-unchecked",
    "-Yno-adapted-args",
    "-Ywarn-numeric-widen",
    "-Ywarn-value-discard",
    "-Xfuture"
  ),
  resolvers += Resolver.sonatypeRepo("releases")
)

lazy val `intro-cats-effect` = project
  .in(file("."))
  .settings(moduleName := "intro-cats-effect")
  .settings(baseSettings: _*)
  .aggregate(core, slides)
  .dependsOn(core, slides)

lazy val core = project
  .settings(moduleName := "intro-cats-effect-core")
  .settings(baseSettings: _*)
  .settings(
    libraryDependencies ++= Seq("org.typelevel" %% "cats-effect" % "2.0.0")
  )

lazy val slides = project
  .settings(moduleName := "intro-cats-effect-slides")
  .settings(baseSettings: _*)
  .settings(
    mdocIn := baseDirectory.value / "mdoc",
    mdocOut := baseDirectory.value / "../docs",
    watchSources ++= (mdocIn.value ** "*.html").get
  )
  .dependsOn(core)
  .enablePlugins(MdocPlugin)
