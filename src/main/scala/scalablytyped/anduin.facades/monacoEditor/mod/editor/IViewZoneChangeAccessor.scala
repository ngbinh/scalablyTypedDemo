package anduin.facades.monacoEditor.mod.editor

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IViewZoneChangeAccessor extends StObject {
  
  /**
    * Create a new view zone.
    * @param zone Zone to create
    * @return A unique identifier to the view zone.
    */
  def addZone(zone: IViewZone): String = js.native
  
  /**
    * Change a zone's position.
    * The editor will rescan the `afterLineNumber` and `afterColumn` properties of a view zone.
    */
  def layoutZone(id: String): Unit = js.native
  
  /**
    * Remove a zone
    * @param id A unique identifier to the view zone, as returned by the `addZone` call.
    */
  def removeZone(id: String): Unit = js.native
}
object IViewZoneChangeAccessor {
  
  @scala.inline
  def apply(addZone: IViewZone => String, layoutZone: String => Callback, removeZone: String => Callback): IViewZoneChangeAccessor = {
    val __obj = js.Dynamic.literal(addZone = js.Any.fromFunction1(addZone), layoutZone = js.Any.fromFunction1((t0: String) => layoutZone(t0).runNow()), removeZone = js.Any.fromFunction1((t0: String) => removeZone(t0).runNow()))
    __obj.asInstanceOf[IViewZoneChangeAccessor]
  }
  
  @scala.inline
  implicit class IViewZoneChangeAccessorMutableBuilder[Self <: IViewZoneChangeAccessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddZone(value: IViewZone => String): Self = StObject.set(x, "addZone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLayoutZone(value: String => Callback): Self = StObject.set(x, "layoutZone", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    @scala.inline
    def setRemoveZone(value: String => Callback): Self = StObject.set(x, "removeZone", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
