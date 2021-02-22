package anduin.facades.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncodedTokensProvider extends StObject {
  
  /**
    * The initial state of a language. Will be the state passed in to tokenize the first line.
    */
  def getInitialState(): IState = js.native
  
  /**
    * Tokenize a line given the state at the beginning of the line.
    */
  var tokenize: js.UndefOr[js.Function2[/* line */ String, /* state */ IState, ILineTokens]] = js.native
  
  /**
    * Tokenize a line given the state at the beginning of the line.
    */
  def tokenizeEncoded(line: String, state: IState): IEncodedLineTokens = js.native
}
object EncodedTokensProvider {
  
  @scala.inline
  def apply(getInitialState: CallbackTo[IState], tokenizeEncoded: (String, IState) => IEncodedLineTokens): EncodedTokensProvider = {
    val __obj = js.Dynamic.literal(getInitialState = getInitialState.toJsFn, tokenizeEncoded = js.Any.fromFunction2(tokenizeEncoded))
    __obj.asInstanceOf[EncodedTokensProvider]
  }
  
  @scala.inline
  implicit class EncodedTokensProviderMutableBuilder[Self <: EncodedTokensProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInitialState(value: CallbackTo[IState]): Self = StObject.set(x, "getInitialState", value.toJsFn)
    
    @scala.inline
    def setTokenize(value: (/* line */ String, /* state */ IState) => ILineTokens): Self = StObject.set(x, "tokenize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTokenizeEncoded(value: (String, IState) => IEncodedLineTokens): Self = StObject.set(x, "tokenizeEncoded", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTokenizeUndefined: Self = StObject.set(x, "tokenize", js.undefined)
  }
}
