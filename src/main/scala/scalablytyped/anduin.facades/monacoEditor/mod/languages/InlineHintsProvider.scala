package anduin.facades.monacoEditor.mod.languages

import anduin.facades.monacoEditor.mod.CancellationToken
import anduin.facades.monacoEditor.mod.IDisposable
import anduin.facades.monacoEditor.mod.IEvent
import anduin.facades.monacoEditor.mod.Range
import anduin.facades.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineHintsProvider extends StObject {
  
  var onDidChangeInlineHints: js.UndefOr[IEvent[Unit]] = js.native
  
  def provideInlineHints(model: ITextModel, range: Range, token: CancellationToken): ProviderResult[js.Array[InlineHint]] = js.native
}
object InlineHintsProvider {
  
  @scala.inline
  def apply(provideInlineHints: (ITextModel, Range, CancellationToken) => ProviderResult[js.Array[InlineHint]]): InlineHintsProvider = {
    val __obj = js.Dynamic.literal(provideInlineHints = js.Any.fromFunction3(provideInlineHints))
    __obj.asInstanceOf[InlineHintsProvider]
  }
  
  @scala.inline
  implicit class InlineHintsProviderMutableBuilder[Self <: InlineHintsProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnDidChangeInlineHints(
      value: (/* listener */ js.Function1[Unit, js.Any], /* thisArg */ js.UndefOr[js.Any]) => IDisposable
    ): Self = StObject.set(x, "onDidChangeInlineHints", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDidChangeInlineHintsUndefined: Self = StObject.set(x, "onDidChangeInlineHints", js.undefined)
    
    @scala.inline
    def setProvideInlineHints(value: (ITextModel, Range, CancellationToken) => ProviderResult[js.Array[InlineHint]]): Self = StObject.set(x, "provideInlineHints", js.Any.fromFunction3(value))
  }
}
