package anduin.facades.monacoEditor.mod.languages

import anduin.facades.monacoEditor.mod.CancellationToken
import anduin.facades.monacoEditor.mod.Range
import anduin.facades.monacoEditor.mod.editor.ITextModel
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentRangeSemanticTokensProvider extends StObject {
  
  def getLegend(): SemanticTokensLegend = js.native
  
  def provideDocumentRangeSemanticTokens(model: ITextModel, range: Range, token: CancellationToken): ProviderResult[SemanticTokens] = js.native
}
object DocumentRangeSemanticTokensProvider {
  
  @scala.inline
  def apply(
    getLegend: CallbackTo[SemanticTokensLegend],
    provideDocumentRangeSemanticTokens: (ITextModel, Range, CancellationToken) => ProviderResult[SemanticTokens]
  ): DocumentRangeSemanticTokensProvider = {
    val __obj = js.Dynamic.literal(getLegend = getLegend.toJsFn, provideDocumentRangeSemanticTokens = js.Any.fromFunction3(provideDocumentRangeSemanticTokens))
    __obj.asInstanceOf[DocumentRangeSemanticTokensProvider]
  }
  
  @scala.inline
  implicit class DocumentRangeSemanticTokensProviderMutableBuilder[Self <: DocumentRangeSemanticTokensProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetLegend(value: CallbackTo[SemanticTokensLegend]): Self = StObject.set(x, "getLegend", value.toJsFn)
    
    @scala.inline
    def setProvideDocumentRangeSemanticTokens(value: (ITextModel, Range, CancellationToken) => ProviderResult[SemanticTokens]): Self = StObject.set(x, "provideDocumentRangeSemanticTokens", js.Any.fromFunction3(value))
  }
}
