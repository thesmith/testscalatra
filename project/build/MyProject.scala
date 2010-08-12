import sbt._

class MyProject(info: ProjectInfo) extends DefaultWebProject(info) {
  val scalatra = "org.scalatra" %% "scalatra" % "2.0.0-M1"
  val scalate = "org.scalatra" % "scalatra-scalate_2.8.0" % "2.0.0-M1" 
  val servletApi = "org.mortbay.jetty" % "servlet-api" % "2.5-20081211" % "provided"
  val jetty6 = "org.mortbay.jetty" % "jetty" % "6.1.24" % "test"
  val sonatypeNexusSnapshots = "Sonatype Nexus Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
  val scalatraMilestone = "Scalatra milestone" at "https://oss.sonatype.org/content/repositories/orgscalatra-453/"
}