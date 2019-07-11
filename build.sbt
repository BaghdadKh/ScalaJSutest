enablePlugins(ScalaJSPlugin)

name := "JsTesting"

version := "0.1"

scalaVersion := "2.12.8"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.6"

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.6.3" % "test"

testFrameworks += new TestFramework("utest.runner.Framework")

libraryDependencies += "org.querki" %%% "jquery-facade" % "1.2"

skip in packageJSDependencies := false

jsDependencies +=
  "org.webjars" % "jquery" % "2.2.1" / "jquery.js" minified "jquery.min.js"

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"