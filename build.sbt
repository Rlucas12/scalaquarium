name := "Scalaquarium"

version := "0.1"

scalaVersion := "2.12.6"

val enumeratumVersion = "1.5.13"

libraryDependencies ++= Seq(
  "com.beachape" %% "enumeratum" % enumeratumVersion
)