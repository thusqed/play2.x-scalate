import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "play2-scalate"
    val appVersion      = "0.1-SNAPSHOT"

    val appDependencies = Seq(
      "org.fusesource.scalate" % "scalate-core_2.10" % "1.6.1"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
    )

}
