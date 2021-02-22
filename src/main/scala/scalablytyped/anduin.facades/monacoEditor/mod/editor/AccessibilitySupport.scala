package anduin.facades.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AccessibilitySupport extends StObject
@JSImport("monaco-editor", "editor.AccessibilitySupport")
@js.native
object AccessibilitySupport extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AccessibilitySupport with Double] = js.native
  
  @js.native
  sealed trait Disabled extends AccessibilitySupport
  /* 1 */ val Disabled: anduin.facades.monacoEditor.mod.editor.AccessibilitySupport.Disabled with Double = js.native
  
  @js.native
  sealed trait Enabled extends AccessibilitySupport
  /* 2 */ val Enabled: anduin.facades.monacoEditor.mod.editor.AccessibilitySupport.Enabled with Double = js.native
  
  /**
    * This should be the browser case where it is not known if a screen reader is attached or no.
    */
  @js.native
  sealed trait Unknown extends AccessibilitySupport
  /* 0 */ val Unknown: anduin.facades.monacoEditor.mod.editor.AccessibilitySupport.Unknown with Double = js.native
}
