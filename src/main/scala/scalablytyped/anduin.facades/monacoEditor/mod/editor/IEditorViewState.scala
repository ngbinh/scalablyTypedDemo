package anduin.facades.monacoEditor.mod.editor

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - `anduin.facades`.monacoEditor.mod.editor.ICodeEditorViewState
  - `anduin.facades`.monacoEditor.mod.editor.IDiffEditorViewState
*/
trait IEditorViewState extends StObject
object IEditorViewState {
  
  @scala.inline
  def ICodeEditorViewState(
    contributionsState: StringDictionary[js.Any],
    cursorState: js.Array[ICursorState],
    viewState: IViewState
  ): anduin.facades.monacoEditor.mod.editor.ICodeEditorViewState = {
    val __obj = js.Dynamic.literal(contributionsState = contributionsState.asInstanceOf[js.Any], cursorState = cursorState.asInstanceOf[js.Any], viewState = viewState.asInstanceOf[js.Any])
    __obj.asInstanceOf[anduin.facades.monacoEditor.mod.editor.ICodeEditorViewState]
  }
  
  @scala.inline
  def IDiffEditorViewState(): anduin.facades.monacoEditor.mod.editor.IDiffEditorViewState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[anduin.facades.monacoEditor.mod.editor.IDiffEditorViewState]
  }
}
