package anduin.facades.monacoEditor.mod.editor

import anduin.facades.monacoEditor.mod.IDisposable
import anduin.facades.monacoEditor.mod.IPosition
import anduin.facades.monacoEditor.mod.IRange
import anduin.facades.monacoEditor.mod.ISelection
import anduin.facades.monacoEditor.mod.Position
import anduin.facades.monacoEditor.mod.Range
import anduin.facades.monacoEditor.mod.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditor extends StObject {
  
  /**
    * Dispose the editor.
    */
  def dispose(): Unit = js.native
  
  /**
    * Brings browser focus to the editor text
    */
  def focus(): Unit = js.native
  
  /**
    * Get the editor type. Please see `EditorType`.
    * This is to avoid an instanceof check
    */
  def getEditorType(): String = js.native
  
  /**
    * Get a unique id for this editor instance.
    */
  def getId(): String = js.native
  
  /**
    * Gets the current model attached to this editor.
    */
  def getModel(): IEditorModel | Null = js.native
  
  /**
    * Returns the primary position of the cursor.
    */
  def getPosition(): Position | Null = js.native
  
  /**
    * Returns the primary selection of the editor.
    */
  def getSelection(): Selection | Null = js.native
  
  /**
    * Returns all the selections of the editor.
    */
  def getSelections(): js.Array[Selection] | Null = js.native
  
  /**
    * Returns all actions associated with this editor.
    */
  def getSupportedActions(): js.Array[IEditorAction] = js.native
  
  /**
    * Given a position, returns a column number that takes tab-widths into account.
    */
  def getVisibleColumnFromPosition(position: IPosition): Double = js.native
  
  /**
    * Returns true if the text inside this editor is focused (i.e. cursor is blinking).
    */
  def hasTextFocus(): Boolean = js.native
  
  /**
    * Instructs the editor to remeasure its container. This method should
    * be called when the container of the editor gets resized.
    *
    * If a dimension is passed in, the passed in value will be used.
    */
  def layout(): Unit = js.native
  def layout(dimension: IDimension): Unit = js.native
  
  /**
    * An event emitted when the editor has been disposed.
    * @event
    */
  def onDidDispose(listener: js.Function0[Unit]): IDisposable = js.native
  
  /**
    * Restores the view state of the editor from a serializable object generated by `saveViewState`.
    */
  def restoreViewState(state: IEditorViewState): Unit = js.native
  
  /**
    * Scroll vertically as necessary and reveal a line.
    */
  def revealLine(lineNumber: Double): Unit = js.native
  def revealLine(lineNumber: Double, scrollType: ScrollType): Unit = js.native
  
  /**
    * Scroll vertically as necessary and reveal a line centered vertically.
    */
  def revealLineInCenter(lineNumber: Double): Unit = js.native
  def revealLineInCenter(lineNumber: Double, scrollType: ScrollType): Unit = js.native
  
  /**
    * Scroll vertically as necessary and reveal a line centered vertically only if it lies outside the viewport.
    */
  def revealLineInCenterIfOutsideViewport(lineNumber: Double): Unit = js.native
  def revealLineInCenterIfOutsideViewport(lineNumber: Double, scrollType: ScrollType): Unit = js.native
  
  /**
    * Scroll vertically as necessary and reveal a line close to the top of the viewport,
    * optimized for viewing a code definition.
    */
  def revealLineNearTop(lineNumber: Double): Unit = js.native
  def revealLineNearTop(lineNumber: Double, scrollType: ScrollType): Unit = js.native
  
  /**
    * Scroll vertically as necessary and reveal lines.
    */
  def revealLines(startLineNumber: Double, endLineNumber: Double): Unit = js.native
  def revealLines(startLineNumber: Double, endLineNumber: Double, scrollType: ScrollType): Unit = js.native
  
  /**
    * Scroll vertically as necessary and reveal lines centered vertically.
    */
  def revealLinesInCenter(lineNumber: Double, endLineNumber: Double): Unit = js.native
  def revealLinesInCenter(lineNumber: Double, endLineNumber: Double, scrollType: ScrollType): Unit = js.native
  
  /**
    * Scroll vertically as necessary and reveal lines centered vertically only if it lies outside the viewport.
    */
  def revealLinesInCenterIfOutsideViewport(lineNumber: Double, endLineNumber: Double): Unit = js.native
  def revealLinesInCenterIfOutsideViewport(lineNumber: Double, endLineNumber: Double, scrollType: ScrollType): Unit = js.native
  
  /**
    * Scroll vertically as necessary and reveal lines close to the top of the viewport,
    * optimized for viewing a code definition.
    */
  def revealLinesNearTop(lineNumber: Double, endLineNumber: Double): Unit = js.native
  def revealLinesNearTop(lineNumber: Double, endLineNumber: Double, scrollType: ScrollType): Unit = js.native
  
  /**
    * Scroll vertically or horizontally as necessary and reveal a position.
    */
  def revealPosition(position: IPosition): Unit = js.native
  def revealPosition(position: IPosition, scrollType: ScrollType): Unit = js.native
  
  /**
    * Scroll vertically or horizontally as necessary and reveal a position centered vertically.
    */
  def revealPositionInCenter(position: IPosition): Unit = js.native
  def revealPositionInCenter(position: IPosition, scrollType: ScrollType): Unit = js.native
  
  /**
    * Scroll vertically or horizontally as necessary and reveal a position centered vertically only if it lies outside the viewport.
    */
  def revealPositionInCenterIfOutsideViewport(position: IPosition): Unit = js.native
  def revealPositionInCenterIfOutsideViewport(position: IPosition, scrollType: ScrollType): Unit = js.native
  
  /**
    * Scroll vertically or horizontally as necessary and reveal a position close to the top of the viewport,
    * optimized for viewing a code definition.
    */
  def revealPositionNearTop(position: IPosition): Unit = js.native
  def revealPositionNearTop(position: IPosition, scrollType: ScrollType): Unit = js.native
  
  /**
    * Scroll vertically or horizontally as necessary and reveal a range.
    */
  def revealRange(range: IRange): Unit = js.native
  def revealRange(range: IRange, scrollType: ScrollType): Unit = js.native
  
  /**
    * Scroll vertically or horizontally as necessary and reveal a range at the top of the viewport.
    */
  def revealRangeAtTop(range: IRange): Unit = js.native
  def revealRangeAtTop(range: IRange, scrollType: ScrollType): Unit = js.native
  
  /**
    * Scroll vertically or horizontally as necessary and reveal a range centered vertically.
    */
  def revealRangeInCenter(range: IRange): Unit = js.native
  def revealRangeInCenter(range: IRange, scrollType: ScrollType): Unit = js.native
  
  /**
    * Scroll vertically or horizontally as necessary and reveal a range centered vertically only if it lies outside the viewport.
    */
  def revealRangeInCenterIfOutsideViewport(range: IRange): Unit = js.native
  def revealRangeInCenterIfOutsideViewport(range: IRange, scrollType: ScrollType): Unit = js.native
  
  /**
    * Scroll vertically or horizontally as necessary and reveal a range close to the top of the viewport,
    * optimized for viewing a code definition.
    */
  def revealRangeNearTop(range: IRange): Unit = js.native
  def revealRangeNearTop(range: IRange, scrollType: ScrollType): Unit = js.native
  
  /**
    * Scroll vertically or horizontally as necessary and reveal a range close to the top of the viewport,
    * optimized for viewing a code definition. Only if it lies outside the viewport.
    */
  def revealRangeNearTopIfOutsideViewport(range: IRange): Unit = js.native
  def revealRangeNearTopIfOutsideViewport(range: IRange, scrollType: ScrollType): Unit = js.native
  
  /**
    * Saves current view state of the editor in a serializable object.
    */
  def saveViewState(): IEditorViewState | Null = js.native
  
  /**
    * Sets the current model attached to this editor.
    * If the previous model was created by the editor via the value key in the options
    * literal object, it will be destroyed. Otherwise, if the previous model was set
    * via setModel, or the model key in the options literal object, the previous model
    * will not be destroyed.
    * It is safe to call setModel(null) to simply detach the current model from the editor.
    */
  def setModel(): Unit = js.native
  def setModel(model: IEditorModel): Unit = js.native
  
  /**
    * Set the primary position of the cursor. This will remove any secondary cursors.
    * @param position New primary cursor's position
    */
  def setPosition(position: IPosition): Unit = js.native
  
  /**
    * Set the primary selection of the editor. This will remove any secondary cursors.
    * @param selection The new selection
    */
  def setSelection(selection: IRange): Unit = js.native
  /**
    * Set the primary selection of the editor. This will remove any secondary cursors.
    * @param selection The new selection
    */
  def setSelection(selection: ISelection): Unit = js.native
  /**
    * Set the primary selection of the editor. This will remove any secondary cursors.
    * @param selection The new selection
    */
  def setSelection(selection: Range): Unit = js.native
  /**
    * Set the primary selection of the editor. This will remove any secondary cursors.
    * @param selection The new selection
    */
  def setSelection(selection: Selection): Unit = js.native
  
  /**
    * Set the selections for all the cursors of the editor.
    * Cursors will be removed or added, as necessary.
    */
  def setSelections(selections: js.Array[ISelection]): Unit = js.native
  
  def trigger(source: js.UndefOr[scala.Nothing], handlerId: String, payload: js.Any): Unit = js.native
  /**
    * Directly trigger a handler or an editor action.
    * @param source The source of the call.
    * @param handlerId The id of the handler or the id of a contribution.
    * @param payload Extra data to be sent to the handler.
    */
  def trigger(source: String, handlerId: String, payload: js.Any): Unit = js.native
  def trigger(source: Null, handlerId: String, payload: js.Any): Unit = js.native
  
  /**
    * Update the editor's options after the editor has been created.
    */
  def updateOptions(newOptions: IEditorOptions): Unit = js.native
}
