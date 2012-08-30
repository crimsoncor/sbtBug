import sbt._
import Keys._

object RootBuild 
  extends Build 
{
  lazy val generator = Project(id = "generator",
                               base = file("."))
}