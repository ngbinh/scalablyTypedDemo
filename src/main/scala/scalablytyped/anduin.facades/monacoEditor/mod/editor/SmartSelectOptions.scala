package anduin.facades.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.ISmartSelectOptions>> */
@js.native
trait SmartSelectOptions extends StObject {
  
  val selectLeadingAndTrailingWhitespace: Boolean = js.native
}
object SmartSelectOptions {
  
  @scala.inline
  def apply(selectLeadingAndTrailingWhitespace: Boolean): SmartSelectOptions = {
    val __obj = js.Dynamic.literal(selectLeadingAndTrailingWhitespace = selectLeadingAndTrailingWhitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartSelectOptions]
  }
  
  @scala.inline
  implicit class SmartSelectOptionsMutableBuilder[Self <: SmartSelectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectLeadingAndTrailingWhitespace(value: Boolean): Self = StObject.set(x, "selectLeadingAndTrailingWhitespace", value.asInstanceOf[js.Any])
  }
}
