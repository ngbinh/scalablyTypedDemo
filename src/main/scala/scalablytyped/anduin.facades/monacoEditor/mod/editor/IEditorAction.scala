package anduin.facades.monacoEditor.mod.editor

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditorAction extends StObject {
  
  val alias: String = js.native
  
  val id: String = js.native
  
  def isSupported(): Boolean = js.native
  
  val label: String = js.native
  
  def run(): js.Promise[Unit] = js.native
}
object IEditorAction {
  
  @scala.inline
  def apply(
    alias: String,
    id: String,
    isSupported: CallbackTo[Boolean],
    label: String,
    run: CallbackTo[js.Promise[Unit]]
  ): IEditorAction = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isSupported = isSupported.toJsFn, label = label.asInstanceOf[js.Any], run = run.toJsFn)
    __obj.asInstanceOf[IEditorAction]
  }
  
  @scala.inline
  implicit class IEditorActionMutableBuilder[Self <: IEditorAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSupported(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSupported", value.toJsFn)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRun(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "run", value.toJsFn)
  }
}
