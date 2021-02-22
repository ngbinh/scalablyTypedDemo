package anduin.facades.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISmartSelectOptions extends StObject {
  
  var selectLeadingAndTrailingWhitespace: js.UndefOr[Boolean] = js.native
}
object ISmartSelectOptions {
  
  @scala.inline
  def apply(): ISmartSelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISmartSelectOptions]
  }
  
  @scala.inline
  implicit class ISmartSelectOptionsMutableBuilder[Self <: ISmartSelectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectLeadingAndTrailingWhitespace(value: Boolean): Self = StObject.set(x, "selectLeadingAndTrailingWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectLeadingAndTrailingWhitespaceUndefined: Self = StObject.set(x, "selectLeadingAndTrailingWhitespace", js.undefined)
  }
}
