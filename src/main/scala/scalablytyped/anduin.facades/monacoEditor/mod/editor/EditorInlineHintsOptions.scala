package anduin.facades.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorInlineHintsOptions>> */
@js.native
trait EditorInlineHintsOptions extends StObject {
  
  val enabled: Boolean = js.native
  
  val fontFamily: String = js.native
  
  val fontSize: Double = js.native
}
object EditorInlineHintsOptions {
  
  @scala.inline
  def apply(enabled: Boolean, fontFamily: String, fontSize: Double): EditorInlineHintsOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorInlineHintsOptions]
  }
  
  @scala.inline
  implicit class EditorInlineHintsOptionsMutableBuilder[Self <: EditorInlineHintsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
  }
}
