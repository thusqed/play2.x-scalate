import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "play2-scalate-sample"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
		"play2-scalate" %% "play2-scalate" % "0.1-SNAPSHOT",
		"org.fusesource.scalate" % "scalate-core" % "1.5.3"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
    )

}
