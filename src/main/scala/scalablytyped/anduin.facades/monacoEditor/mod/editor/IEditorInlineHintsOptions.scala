package anduin.facades.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditorInlineHintsOptions extends StObject {
  
  /**
    * Enable the inline hints.
    * Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Font family of inline hints.
    * Defaults to editor font family.
    */
  var fontFamily: js.UndefOr[String] = js.native
  
  /**
    * Font size of inline hints.
    * Default to 90% of the editor font size.
    */
  var fontSize: js.UndefOr[Double] = js.native
}
object IEditorInlineHintsOptions {
  
  @scala.inline
  def apply(): IEditorInlineHintsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorInlineHintsOptions]
  }
  
  @scala.inline
  implicit class IEditorInlineHintsOptionsMutableBuilder[Self <: IEditorInlineHintsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
  }
}
