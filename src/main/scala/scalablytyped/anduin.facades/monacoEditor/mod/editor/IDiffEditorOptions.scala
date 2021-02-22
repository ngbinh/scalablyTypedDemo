package anduin.facades.monacoEditor.mod.editor

import anduin.facades.monacoEditor.monacoEditorStrings.inherit
import anduin.facades.monacoEditor.monacoEditorStrings.off
import anduin.facades.monacoEditor.monacoEditorStrings.on
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDiffEditorOptions extends IEditorOptions {
  
  /**
    * Should the diff editor enable code lens?
    * Defaults to false.
    */
  var diffCodeLens: js.UndefOr[Boolean] = js.native
  
  /**
    * Control the wrapping of the diff editor.
    */
  var diffWordWrap: js.UndefOr[off | on | inherit] = js.native
  
  /**
    * Allow the user to resize the diff editor split view.
    * Defaults to true.
    */
  var enableSplitViewResizing: js.UndefOr[Boolean] = js.native
  
  /**
    * Compute the diff by ignoring leading/trailing whitespace
    * Defaults to true.
    */
  var ignoreTrimWhitespace: js.UndefOr[Boolean] = js.native
  
  /**
    * Is the diff editor inside another editor
    * Defaults to false
    */
  var isInEmbeddedEditor: js.UndefOr[Boolean] = js.native
  
  /**
    * Timeout in milliseconds after which diff computation is cancelled.
    * Defaults to 5000.
    */
  var maxComputationTime: js.UndefOr[Double] = js.native
  
  /**
    * Original model should be editable?
    * Defaults to false.
    */
  var originalEditable: js.UndefOr[Boolean] = js.native
  
  /**
    * Render +/- indicators for added/deleted changes.
    * Defaults to true.
    */
  var renderIndicators: js.UndefOr[Boolean] = js.native
  
  /**
    * Is the diff editor should render overview ruler
    * Defaults to true
    */
  var renderOverviewRuler: js.UndefOr[Boolean] = js.native
  
  /**
    * Render the differences in two side-by-side editors.
    * Defaults to true.
    */
  var renderSideBySide: js.UndefOr[Boolean] = js.native
}
object IDiffEditorOptions {
  
  @scala.inline
  def apply(): IDiffEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDiffEditorOptions]
  }
  
  @scala.inline
  implicit class IDiffEditorOptionsMutableBuilder[Self <: IDiffEditorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiffCodeLens(value: Boolean): Self = StObject.set(x, "diffCodeLens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiffCodeLensUndefined: Self = StObject.set(x, "diffCodeLens", js.undefined)
    
    @scala.inline
    def setDiffWordWrap(value: off | on | inherit): Self = StObject.set(x, "diffWordWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiffWordWrapUndefined: Self = StObject.set(x, "diffWordWrap", js.undefined)
    
    @scala.inline
    def setEnableSplitViewResizing(value: Boolean): Self = StObject.set(x, "enableSplitViewResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSplitViewResizingUndefined: Self = StObject.set(x, "enableSplitViewResizing", js.undefined)
    
    @scala.inline
    def setIgnoreTrimWhitespace(value: Boolean): Self = StObject.set(x, "ignoreTrimWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreTrimWhitespaceUndefined: Self = StObject.set(x, "ignoreTrimWhitespace", js.undefined)
    
    @scala.inline
    def setIsInEmbeddedEditor(value: Boolean): Self = StObject.set(x, "isInEmbeddedEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInEmbeddedEditorUndefined: Self = StObject.set(x, "isInEmbeddedEditor", js.undefined)
    
    @scala.inline
    def setMaxComputationTime(value: Double): Self = StObject.set(x, "maxComputationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxComputationTimeUndefined: Self = StObject.set(x, "maxComputationTime", js.undefined)
    
    @scala.inline
    def setOriginalEditable(value: Boolean): Self = StObject.set(x, "originalEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalEditableUndefined: Self = StObject.set(x, "originalEditable", js.undefined)
    
    @scala.inline
    def setRenderIndicators(value: Boolean): Self = StObject.set(x, "renderIndicators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderIndicatorsUndefined: Self = StObject.set(x, "renderIndicators", js.undefined)
    
    @scala.inline
    def setRenderOverviewRuler(value: Boolean): Self = StObject.set(x, "renderOverviewRuler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderOverviewRulerUndefined: Self = StObject.set(x, "renderOverviewRuler", js.undefined)
    
    @scala.inline
    def setRenderSideBySide(value: Boolean): Self = StObject.set(x, "renderSideBySide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderSideBySideUndefined: Self = StObject.set(x, "renderSideBySide", js.undefined)
  }
}
