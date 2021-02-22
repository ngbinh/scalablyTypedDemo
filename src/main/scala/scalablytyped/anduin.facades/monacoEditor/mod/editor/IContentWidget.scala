package anduin.facades.monacoEditor.mod.editor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContentWidget extends StObject {
  
  /**
    * Optional function that is invoked after rendering the content
    * widget. Is being invoked with the selected position preference
    * or `null` if not rendered.
    */
  var afterRender: js.UndefOr[js.Function1[/* position */ ContentWidgetPositionPreference | Null, Unit]] = js.native
  
  /**
    * Render this content widget in a location where it could overflow the editor's view dom node.
    */
  var allowEditorOverflow: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional function that is invoked before rendering
    * the content widget. If a dimension is returned the editor will
    * attempt to use it.
    */
  var beforeRender: js.UndefOr[js.Function0[IDimension | Null]] = js.native
  
  /**
    * Get the dom node of the content widget.
    */
  def getDomNode(): HTMLElement = js.native
  
  /**
    * Get a unique identifier of the content widget.
    */
  def getId(): String = js.native
  
  /**
    * Get the placement of the content widget.
    * If null is returned, the content widget will be placed off screen.
    */
  def getPosition(): IContentWidgetPosition | Null = js.native
  
  var suppressMouseDown: js.UndefOr[Boolean] = js.native
}
object IContentWidget {
  
  @scala.inline
  def apply(
    getDomNode: CallbackTo[HTMLElement],
    getId: CallbackTo[String],
    getPosition: CallbackTo[IContentWidgetPosition | Null]
  ): IContentWidget = {
    val __obj = js.Dynamic.literal(getDomNode = getDomNode.toJsFn, getId = getId.toJsFn, getPosition = getPosition.toJsFn)
    __obj.asInstanceOf[IContentWidget]
  }
  
  @scala.inline
  implicit class IContentWidgetMutableBuilder[Self <: IContentWidget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterRender(value: /* position */ ContentWidgetPositionPreference | Null => Callback): Self = StObject.set(x, "afterRender", js.Any.fromFunction1((t0: /* position */ ContentWidgetPositionPreference | Null) => value(t0).runNow()))
    
    @scala.inline
    def setAfterRenderUndefined: Self = StObject.set(x, "afterRender", js.undefined)
    
    @scala.inline
    def setAllowEditorOverflow(value: Boolean): Self = StObject.set(x, "allowEditorOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEditorOverflowUndefined: Self = StObject.set(x, "allowEditorOverflow", js.undefined)
    
    @scala.inline
    def setBeforeRender(value: CallbackTo[IDimension | Null]): Self = StObject.set(x, "beforeRender", value.toJsFn)
    
    @scala.inline
    def setBeforeRenderUndefined: Self = StObject.set(x, "beforeRender", js.undefined)
    
    @scala.inline
    def setGetDomNode(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getDomNode", value.toJsFn)
    
    @scala.inline
    def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
    
    @scala.inline
    def setGetPosition(value: CallbackTo[IContentWidgetPosition | Null]): Self = StObject.set(x, "getPosition", value.toJsFn)
    
    @scala.inline
    def setSuppressMouseDown(value: Boolean): Self = StObject.set(x, "suppressMouseDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressMouseDownUndefined: Self = StObject.set(x, "suppressMouseDown", js.undefined)
  }
}
