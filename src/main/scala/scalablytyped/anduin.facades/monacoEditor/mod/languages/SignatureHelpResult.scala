package anduin.facades.monacoEditor.mod.languages

import anduin.facades.monacoEditor.mod.IDisposable
import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureHelpResult extends IDisposable {
  
  var value: SignatureHelp = js.native
}
object SignatureHelpResult {
  
  @scala.inline
  def apply(dispose: Callback, value: SignatureHelp): SignatureHelpResult = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpResult]
  }
  
  @scala.inline
  implicit class SignatureHelpResultMutableBuilder[Self <: SignatureHelpResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: SignatureHelp): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
