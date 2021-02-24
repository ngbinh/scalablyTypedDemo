package facades.parchment

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkedNodeMod {
  
  @js.native
  trait LinkedNode extends StObject {
    
    def length(): Double = js.native
    
    var next: LinkedNode | Null = js.native
    
    var prev: LinkedNode | Null = js.native
  }
  object LinkedNode {
    
    @scala.inline
    def apply(length: CallbackTo[Double]): LinkedNode = {
      val __obj = js.Dynamic.literal(length = length.toJsFn)
      __obj.asInstanceOf[LinkedNode]
    }
    
    @scala.inline
    implicit class LinkedNodeMutableBuilder[Self <: LinkedNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: CallbackTo[Double]): Self = StObject.set(x, "length", value.toJsFn)
      
      @scala.inline
      def setNext(value: LinkedNode): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextNull: Self = StObject.set(x, "next", null)
      
      @scala.inline
      def setPrev(value: LinkedNode): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevNull: Self = StObject.set(x, "prev", null)
    }
  }
}
