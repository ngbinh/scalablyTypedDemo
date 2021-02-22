package anduin.facades.monacoEditor.mod.editor

import anduin.facades.monacoEditor.mod.Selection
import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICommand extends StObject {
  
  /**
    * Compute the cursor state after the edit operations were applied.
    * @param model The model the command has executed on.
    * @param helper A helper to get inverse edit operations and to get previously tracked selections.
    * @return The cursor state after the command executed.
    */
  def computeCursorState(model: ITextModel, helper: ICursorStateComputerData): Selection = js.native
  
  /**
    * Get the edit operations needed to execute this command.
    * @param model The model the command will execute on.
    * @param builder A helper to collect the needed edit operations and to track selections.
    */
  def getEditOperations(model: ITextModel, builder: IEditOperationBuilder): Unit = js.native
}
object ICommand {
  
  @scala.inline
  def apply(
    computeCursorState: (ITextModel, ICursorStateComputerData) => Selection,
    getEditOperations: (ITextModel, IEditOperationBuilder) => Callback
  ): ICommand = {
    val __obj = js.Dynamic.literal(computeCursorState = js.Any.fromFunction2(computeCursorState), getEditOperations = js.Any.fromFunction2((t0: ITextModel, t1: IEditOperationBuilder) => (getEditOperations(t0, t1)).runNow()))
    __obj.asInstanceOf[ICommand]
  }
  
  @scala.inline
  implicit class ICommandMutableBuilder[Self <: ICommand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputeCursorState(value: (ITextModel, ICursorStateComputerData) => Selection): Self = StObject.set(x, "computeCursorState", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetEditOperations(value: (ITextModel, IEditOperationBuilder) => Callback): Self = StObject.set(x, "getEditOperations", js.Any.fromFunction2((t0: ITextModel, t1: IEditOperationBuilder) => (value(t0, t1)).runNow()))
  }
}