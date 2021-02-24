package facades.parchment

import facades.parchment.anon.Instantiable
import facades.parchment.linkedListMod.default
import facades.parchment.linkedNodeMod.LinkedNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MutationRecord
import org.scalajs.dom.raw.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blotMod {
  
  @js.native
  trait Blot extends LinkedNode {
    
    def attach(): Unit = js.native
    
    def deleteAt(index: Double, length: Double): Unit = js.native
    
    def detach(): Unit = js.native
    
    var domNode: Node = js.native
    
    def formatAt(index: Double, length: Double, name: String, value: js.Any): Unit = js.native
    
    def insertAt(index: Double, value: String): Unit = js.native
    def insertAt(index: Double, value: String, `def`: js.Any): Unit = js.native
    
    def insertInto(parentBlot: Parent): Unit = js.native
    def insertInto(parentBlot: Parent, refBlot: Blot): Unit = js.native
    
    def isolate(index: Double, length: Double): Blot = js.native
    
    @JSName("next")
    var next_Blot: Blot = js.native
    
    def offset(): Double = js.native
    def offset(root: Blot): Double = js.native
    
    def optimize(context: StringDictionary[js.Any]): Unit = js.native
    def optimize(mutations: js.Array[MutationRecord], context: StringDictionary[js.Any]): Unit = js.native
    
    var parent: Parent = js.native
    
    @JSName("prev")
    var prev_Blot: Blot = js.native
    
    def remove(): Unit = js.native
    
    def replace(target: Blot): Unit = js.native
    
    def replaceWith(name: String, value: js.Any): Blot = js.native
    def replaceWith(replacement: Blot): Blot = js.native
    
    var scroll: Parent = js.native
    
    def split(index: Double): Blot = js.native
    def split(index: Double, force: Boolean): Blot = js.native
    
    def update(mutations: js.Array[MutationRecord], context: StringDictionary[js.Any]): Unit = js.native
    
    def wrap(name: String, value: js.Any): Parent = js.native
    def wrap(wrapper: Parent): Parent = js.native
  }
  
  @js.native
  trait Parent extends Blot {
    
    def appendChild(child: Blot): Unit = js.native
    
    var children: default[Blot] = js.native
    
    def descendant[T](matcher: js.Function1[/* blot */ Blot, Boolean], index: Double): js.Tuple2[T, Double] = js.native
    def descendant[T](`type`: Instantiable[T], index: Double): js.Tuple2[T, Double] = js.native
    
    def descendants[T](matcher: js.Function1[/* blot */ Blot, Boolean], index: Double, length: Double): js.Array[T] = js.native
    def descendants[T](`type`: Instantiable[T], index: Double, length: Double): js.Array[T] = js.native
    
    @JSName("domNode")
    var domNode_Parent: HTMLElement = js.native
    
    def insertBefore(child: Blot): Unit = js.native
    def insertBefore(child: Blot, refNode: Blot): Unit = js.native
    
    def moveChildren(parent: Parent): Unit = js.native
    def moveChildren(parent: Parent, refNode: Blot): Unit = js.native
    
    def path(index: Double): js.Array[js.Tuple2[Blot, Double]] = js.native
    def path(index: Double, inclusive: Boolean): js.Array[js.Tuple2[Blot, Double]] = js.native
    
    def removeChild(child: Blot): Unit = js.native
    
    def unwrap(): Unit = js.native
  }
}
