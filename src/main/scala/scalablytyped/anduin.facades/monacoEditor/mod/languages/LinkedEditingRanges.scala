package anduin.facades.monacoEditor.mod.languages

import anduin.facades.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkedEditingRanges extends StObject {
  
  /**
    * A list of ranges that can be edited together. The ranges must have
    * identical length and text content. The ranges cannot overlap
    */
  var ranges: js.Array[IRange] = js.native
  
  /**
    * An optional word pattern that describes valid contents for the given ranges.
    * If no pattern is provided, the language configuration's word pattern will be used.
    */
  var wordPattern: js.UndefOr[js.RegExp] = js.native
}
object LinkedEditingRanges {
  
  @scala.inline
  def apply(ranges: js.Array[IRange]): LinkedEditingRanges = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedEditingRanges]
  }
  
  @scala.inline
  implicit class LinkedEditingRangesMutableBuilder[Self <: LinkedEditingRanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRanges(value: js.Array[IRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesVarargs(value: IRange*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    
    @scala.inline
    def setWordPattern(value: js.RegExp): Self = StObject.set(x, "wordPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordPatternUndefined: Self = StObject.set(x, "wordPattern", js.undefined)
  }
}
