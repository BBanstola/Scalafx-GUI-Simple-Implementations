name := "GUI"

version := "1.0"

scalaVersion := "2.12.8"

libraryDependencies += "org.scalafx" %% "scalafx" % "8.0.144-R12"

//unmanagedJars in Compile += Attributed.blank(file(System.getenv("JAVA_HOME") + "C:/scalafx.jar"))