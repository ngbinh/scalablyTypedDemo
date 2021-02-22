package anduin.facades.monacoEditor.mod.editor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContextKey[T] extends StObject {
  
  def get(): js.UndefOr[T] = js.native
  
  def reset(): Unit = js.native
  
  def set(value: T): Unit = js.native
}
object IContextKey {
  
  @scala.inline
  def apply[T](get: CallbackTo[js.UndefOr[T]], reset: Callback, set: T => Callback): IContextKey[T] = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, reset = reset.toJsFn, set = js.Any.fromFunction1((t0: T) => set(t0).runNow()))
    __obj.asInstanceOf[IContextKey[T]]
  }
  
  @scala.inline
  implicit class IContextKeyMutableBuilder[Self <: IContextKey[_], T] (val x: Self with IContextKey[T]) extends AnyVal {
    
    @scala.inline
    def setGet(value: CallbackTo[js.UndefOr[T]]): Self = StObject.set(x, "get", value.toJsFn)
    
    @scala.inline
    def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    @scala.inline
    def setSet(value: T => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
  }
}
