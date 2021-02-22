package anduin.facades.monacoEditor.mod

import anduin.facades.monacoEditor.monacoEditorBooleans.`true`
import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKeyboardEvent extends StObject {
  
  val _standardKeyboardEventBrand: `true` = js.native
  
  val altKey: Boolean = js.native
  
  val browserEvent: KeyboardEvent = js.native
  
  val code: String = js.native
  
  val ctrlKey: Boolean = js.native
  
  def equals(keybinding: Double): Boolean = js.native
  
  val keyCode: KeyCode = js.native
  
  val metaKey: Boolean = js.native
  
  def preventDefault(): Unit = js.native
  
  val shiftKey: Boolean = js.native
  
  def stopPropagation(): Unit = js.native
  
  val target: HTMLElement = js.native
}
object IKeyboardEvent {
  
  @scala.inline
  def apply(
    _standardKeyboardEventBrand: `true`,
    altKey: Boolean,
    browserEvent: KeyboardEvent,
    code: String,
    ctrlKey: Boolean,
    equals_ : Double => Boolean,
    keyCode: KeyCode,
    metaKey: Boolean,
    preventDefault: Callback,
    shiftKey: Boolean,
    stopPropagation: Callback,
    target: HTMLElement
  ): IKeyboardEvent = {
    val __obj = js.Dynamic.literal(_standardKeyboardEventBrand = _standardKeyboardEventBrand.asInstanceOf[js.Any], altKey = altKey.asInstanceOf[js.Any], browserEvent = browserEvent.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], preventDefault = preventDefault.toJsFn, shiftKey = shiftKey.asInstanceOf[js.Any], stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[IKeyboardEvent]
  }
  
  @scala.inline
  implicit class IKeyboardEventMutableBuilder[Self <: IKeyboardEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowserEvent(value: KeyboardEvent): Self = StObject.set(x, "browserEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquals_(value: Double => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyCode(value: KeyCode): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
    
    @scala.inline
    def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
    
    @scala.inline
    def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_standardKeyboardEventBrand(value: `true`): Self = StObject.set(x, "_standardKeyboardEventBrand", value.asInstanceOf[js.Any])
  }
}
