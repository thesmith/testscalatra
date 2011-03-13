package thesmith.testscalatra

import org.scalatra._
import scalate.ScalateSupport

class MyScalatraFilter extends ScalatraFilter with ScalateSupport {
  val templatePath = "/WEB-INF/scalate/templates/hello-scalate.scaml"

  get("/") {
    templateEngine.layout(templatePath)
  }
}
