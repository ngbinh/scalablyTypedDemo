package anduin.facades.monacoEditor.mod.editor

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOverlayWidget extends StObject {
  
  /**
    * Get the dom node of the overlay widget.
    */
  def getDomNode(): HTMLElement = js.native
  
  /**
    * Get a unique identifier of the overlay widget.
    */
  def getId(): String = js.native
  
  /**
    * Get the placement of the overlay widget.
    * If null is returned, the overlay widget is responsible to place itself.
    */
  def getPosition(): IOverlayWidgetPosition | Null = js.native
}
object IOverlayWidget {
  
  @scala.inline
  def apply(
    getDomNode: CallbackTo[HTMLElement],
    getId: CallbackTo[String],
    getPosition: CallbackTo[IOverlayWidgetPosition | Null]
  ): IOverlayWidget = {
    val __obj = js.Dynamic.literal(getDomNode = getDomNode.toJsFn, getId = getId.toJsFn, getPosition = getPosition.toJsFn)
    __obj.asInstanceOf[IOverlayWidget]
  }
  
  @scala.inline
  implicit class IOverlayWidgetMutableBuilder[Self <: IOverlayWidget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDomNode(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getDomNode", value.toJsFn)
    
    @scala.inline
    def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
    
    @scala.inline
    def setGetPosition(value: CallbackTo[IOverlayWidgetPosition | Null]): Self = StObject.set(x, "getPosition", value.toJsFn)
  }
}
