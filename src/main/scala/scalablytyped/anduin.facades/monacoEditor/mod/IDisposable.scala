package anduin.facades.monacoEditor.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDisposable extends StObject {
  
  def dispose(): Unit = js.native
}
object IDisposable {
  
  @scala.inline
  def apply(dispose: Callback): IDisposable = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn)
    __obj.asInstanceOf[IDisposable]
  }
  
  @scala.inline
  implicit class IDisposableMutableBuilder[Self <: IDisposable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
  }
}
