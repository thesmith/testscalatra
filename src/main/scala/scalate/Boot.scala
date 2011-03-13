package scalate

import org.fusesource.scalate.util.Logging
import org.fusesource.scalate.TemplateEngine
import java.io.File

class Boot(engine: TemplateEngine) extends Logging {

  def run: Unit = {
    engine.workingDirectory = new File("/tmp")
    engine.allowCaching = true
    engine.allowReload = false
  }
}