package anduin.facades.monacoEditor.mod.languages

import anduin.facades.monacoEditor.mod.CancellationToken
import anduin.facades.monacoEditor.mod.Position
import anduin.facades.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkedEditingRangeProvider extends StObject {
  
  /**
    * Provide a list of ranges that can be edited together.
    */
  def provideLinkedEditingRanges(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[LinkedEditingRanges] = js.native
}
object LinkedEditingRangeProvider {
  
  @scala.inline
  def apply(
    provideLinkedEditingRanges: (ITextModel, Position, CancellationToken) => ProviderResult[LinkedEditingRanges]
  ): LinkedEditingRangeProvider = {
    val __obj = js.Dynamic.literal(provideLinkedEditingRanges = js.Any.fromFunction3(provideLinkedEditingRanges))
    __obj.asInstanceOf[LinkedEditingRangeProvider]
  }
  
  @scala.inline
  implicit class LinkedEditingRangeProviderMutableBuilder[Self <: LinkedEditingRangeProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideLinkedEditingRanges(value: (ITextModel, Position, CancellationToken) => ProviderResult[LinkedEditingRanges]): Self = StObject.set(x, "provideLinkedEditingRanges", js.Any.fromFunction3(value))
  }
}
