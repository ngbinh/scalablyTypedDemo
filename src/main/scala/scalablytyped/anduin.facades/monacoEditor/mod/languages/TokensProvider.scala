package anduin.facades.monacoEditor.mod.languages

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokensProvider extends StObject {
  
  /**
    * The initial state of a language. Will be the state passed in to tokenize the first line.
    */
  def getInitialState(): IState = js.native
  
  /**
    * Tokenize a line given the state at the beginning of the line.
    */
  def tokenize(line: String, state: IState): ILineTokens = js.native
}
object TokensProvider {
  
  @scala.inline
  def apply(getInitialState: CallbackTo[IState], tokenize: (String, IState) => ILineTokens): TokensProvider = {
    val __obj = js.Dynamic.literal(getInitialState = getInitialState.toJsFn, tokenize = js.Any.fromFunction2(tokenize))
    __obj.asInstanceOf[TokensProvider]
  }
  
  @scala.inline
  implicit class TokensProviderMutableBuilder[Self <: TokensProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInitialState(value: CallbackTo[IState]): Self = StObject.set(x, "getInitialState", value.toJsFn)
    
    @scala.inline
    def setTokenize(value: (String, IState) => ILineTokens): Self = StObject.set(x, "tokenize", js.Any.fromFunction2(value))
  }
}
