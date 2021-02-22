package anduin.facades.monacoEditor.mod.languages

import anduin.facades.monacoEditor.mod.IMarkdownString
import anduin.facades.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineHint extends StObject {
  
  var description: js.UndefOr[String | IMarkdownString] = js.native
  
  var range: IRange = js.native
  
  var text: String = js.native
  
  var whitespaceAfter: js.UndefOr[Boolean] = js.native
  
  var whitespaceBefore: js.UndefOr[Boolean] = js.native
}
object InlineHint {
  
  @scala.inline
  def apply(range: IRange, text: String): InlineHint = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineHint]
  }
  
  @scala.inline
  implicit class InlineHintMutableBuilder[Self <: InlineHint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String | IMarkdownString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitespaceAfter(value: Boolean): Self = StObject.set(x, "whitespaceAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitespaceAfterUndefined: Self = StObject.set(x, "whitespaceAfter", js.undefined)
    
    @scala.inline
    def setWhitespaceBefore(value: Boolean): Self = StObject.set(x, "whitespaceBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitespaceBeforeUndefined: Self = StObject.set(x, "whitespaceBefore", js.undefined)
  }
}
