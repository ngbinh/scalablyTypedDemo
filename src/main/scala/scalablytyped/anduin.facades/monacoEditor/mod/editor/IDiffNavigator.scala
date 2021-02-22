package anduin.facades.monacoEditor.mod.editor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDiffNavigator extends StObject {
  
  def canNavigate(): Boolean = js.native
  
  def dispose(): Unit = js.native
  
  def next(): Unit = js.native
  
  def previous(): Unit = js.native
}
object IDiffNavigator {
  
  @scala.inline
  def apply(canNavigate: CallbackTo[Boolean], dispose: Callback, next: Callback, previous: Callback): IDiffNavigator = {
    val __obj = js.Dynamic.literal(canNavigate = canNavigate.toJsFn, dispose = dispose.toJsFn, next = next.toJsFn, previous = previous.toJsFn)
    __obj.asInstanceOf[IDiffNavigator]
  }
  
  @scala.inline
  implicit class IDiffNavigatorMutableBuilder[Self <: IDiffNavigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanNavigate(value: CallbackTo[Boolean]): Self = StObject.set(x, "canNavigate", value.toJsFn)
    
    @scala.inline
    def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    @scala.inline
    def setNext(value: Callback): Self = StObject.set(x, "next", value.toJsFn)
    
    @scala.inline
    def setPrevious(value: Callback): Self = StObject.set(x, "previous", value.toJsFn)
  }
}
