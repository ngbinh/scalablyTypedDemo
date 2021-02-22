package anduin.facades.monacoEditor.mod.editor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditorContribution extends StObject {
  
  /**
    * Dispose this contribution.
    */
  def dispose(): Unit = js.native
  
  /**
    * Restore view state.
    */
  var restoreViewState: js.UndefOr[js.Function1[/* state */ js.Any, Unit]] = js.native
  
  /**
    * Store view state.
    */
  var saveViewState: js.UndefOr[js.Function0[_]] = js.native
}
object IEditorContribution {
  
  @scala.inline
  def apply(dispose: Callback): IEditorContribution = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn)
    __obj.asInstanceOf[IEditorContribution]
  }
  
  @scala.inline
  implicit class IEditorContributionMutableBuilder[Self <: IEditorContribution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    @scala.inline
    def setRestoreViewState(value: /* state */ js.Any => Callback): Self = StObject.set(x, "restoreViewState", js.Any.fromFunction1((t0: /* state */ js.Any) => value(t0).runNow()))
    
    @scala.inline
    def setRestoreViewStateUndefined: Self = StObject.set(x, "restoreViewState", js.undefined)
    
    @scala.inline
    def setSaveViewState(value: CallbackTo[js.Any]): Self = StObject.set(x, "saveViewState", value.toJsFn)
    
    @scala.inline
    def setSaveViewStateUndefined: Self = StObject.set(x, "saveViewState", js.undefined)
  }
}
