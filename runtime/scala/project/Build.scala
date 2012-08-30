import sbt._
import Keys._

object RootBuild 
  extends Build 
{
  lazy val runtime = Project(id = "runtime",
                             base = file(".")) dependsOn(generator)
                             
  lazy val generator = ProjectRef(uri("../../generator/scala/"), "generator")


}