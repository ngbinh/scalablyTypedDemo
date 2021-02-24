package example

import facades.parchment.blotMod.Blot
import facades.quill.mod.{Quill, default}

object Main {
  def main(args: Array[String]): Unit = {
    val fontBlot = default.`import`("fonts").asInstanceOf[Blot]

    println(fontBlot)

    val quill = new Quill("container")

    println(quill.root)
  }
}