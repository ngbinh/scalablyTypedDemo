package anduin.facades.monacoEditor.mod.languages

import anduin.facades.monacoEditor.mod.CancellationToken
import anduin.facades.monacoEditor.mod.IDisposable
import anduin.facades.monacoEditor.mod.IEvent
import anduin.facades.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoldingRangeProvider extends StObject {
  
  /**
    * An optional event to signal that the folding ranges from this provider have changed.
    */
  var onDidChange: js.UndefOr[IEvent[this.type]] = js.native
  
  /**
    * Provides the folding ranges for a specific model.
    */
  def provideFoldingRanges(model: ITextModel, context: FoldingContext, token: CancellationToken): ProviderResult[js.Array[FoldingRange]] = js.native
}
object FoldingRangeProvider {
  
  @scala.inline
  def apply(
    provideFoldingRanges: (ITextModel, FoldingContext, CancellationToken) => ProviderResult[js.Array[FoldingRange]]
  ): FoldingRangeProvider = {
    val __obj = js.Dynamic.literal(provideFoldingRanges = js.Any.fromFunction3(provideFoldingRanges))
    __obj.asInstanceOf[FoldingRangeProvider]
  }
  
  @scala.inline
  implicit class FoldingRangeProviderMutableBuilder[Self <: FoldingRangeProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnDidChange(
      value: (/* listener */ js.Function1[FoldingRangeProvider, js.Any], /* thisArg */ js.UndefOr[js.Any]) => IDisposable
    ): Self = StObject.set(x, "onDidChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDidChangeUndefined: Self = StObject.set(x, "onDidChange", js.undefined)
    
    @scala.inline
    def setProvideFoldingRanges(value: (ITextModel, FoldingContext, CancellationToken) => ProviderResult[js.Array[FoldingRange]]): Self = StObject.set(x, "provideFoldingRanges", js.Any.fromFunction3(value))
  }
}
