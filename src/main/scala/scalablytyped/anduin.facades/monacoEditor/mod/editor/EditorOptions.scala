package anduin.facades.monacoEditor.mod.editor

import anduin.facades.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnCommitCharacter
import anduin.facades.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnEnter
import anduin.facades.monacoEditor.mod.editor.EditorOption.accessibilityPageSize
import anduin.facades.monacoEditor.mod.editor.EditorOption.accessibilitySupport
import anduin.facades.monacoEditor.mod.editor.EditorOption.ariaLabel
import anduin.facades.monacoEditor.mod.editor.EditorOption.autoClosingBrackets
import anduin.facades.monacoEditor.mod.editor.EditorOption.autoClosingOvertype
import anduin.facades.monacoEditor.mod.editor.EditorOption.autoClosingQuotes
import anduin.facades.monacoEditor.mod.editor.EditorOption.autoIndent
import anduin.facades.monacoEditor.mod.editor.EditorOption.autoSurround
import anduin.facades.monacoEditor.mod.editor.EditorOption.automaticLayout
import anduin.facades.monacoEditor.mod.editor.EditorOption.codeLens
import anduin.facades.monacoEditor.mod.editor.EditorOption.codeLensFontFamily
import anduin.facades.monacoEditor.mod.editor.EditorOption.codeLensFontSize
import anduin.facades.monacoEditor.mod.editor.EditorOption.colorDecorators
import anduin.facades.monacoEditor.mod.editor.EditorOption.columnSelection
import anduin.facades.monacoEditor.mod.editor.EditorOption.comments
import anduin.facades.monacoEditor.mod.editor.EditorOption.contextmenu
import anduin.facades.monacoEditor.mod.editor.EditorOption.copyWithSyntaxHighlighting
import anduin.facades.monacoEditor.mod.editor.EditorOption.cursorBlinking
import anduin.facades.monacoEditor.mod.editor.EditorOption.cursorSmoothCaretAnimation
import anduin.facades.monacoEditor.mod.editor.EditorOption.cursorStyle
import anduin.facades.monacoEditor.mod.editor.EditorOption.cursorSurroundingLines
import anduin.facades.monacoEditor.mod.editor.EditorOption.cursorSurroundingLinesStyle
import anduin.facades.monacoEditor.mod.editor.EditorOption.cursorWidth
import anduin.facades.monacoEditor.mod.editor.EditorOption.definitionLinkOpensInPeek
import anduin.facades.monacoEditor.mod.editor.EditorOption.disableLayerHinting
import anduin.facades.monacoEditor.mod.editor.EditorOption.disableMonospaceOptimizations
import anduin.facades.monacoEditor.mod.editor.EditorOption.dragAndDrop
import anduin.facades.monacoEditor.mod.editor.EditorOption.editorClassName
import anduin.facades.monacoEditor.mod.editor.EditorOption.emptySelectionClipboard
import anduin.facades.monacoEditor.mod.editor.EditorOption.extraEditorClassName
import anduin.facades.monacoEditor.mod.editor.EditorOption.fastScrollSensitivity
import anduin.facades.monacoEditor.mod.editor.EditorOption.find
import anduin.facades.monacoEditor.mod.editor.EditorOption.fixedOverflowWidgets
import anduin.facades.monacoEditor.mod.editor.EditorOption.folding
import anduin.facades.monacoEditor.mod.editor.EditorOption.foldingHighlight
import anduin.facades.monacoEditor.mod.editor.EditorOption.foldingStrategy
import anduin.facades.monacoEditor.mod.editor.EditorOption.fontFamily
import anduin.facades.monacoEditor.mod.editor.EditorOption.fontInfo
import anduin.facades.monacoEditor.mod.editor.EditorOption.fontLigatures
import anduin.facades.monacoEditor.mod.editor.EditorOption.fontSize
import anduin.facades.monacoEditor.mod.editor.EditorOption.fontWeight
import anduin.facades.monacoEditor.mod.editor.EditorOption.formatOnPaste
import anduin.facades.monacoEditor.mod.editor.EditorOption.formatOnType
import anduin.facades.monacoEditor.mod.editor.EditorOption.glyphMargin
import anduin.facades.monacoEditor.mod.editor.EditorOption.gotoLocation
import anduin.facades.monacoEditor.mod.editor.EditorOption.hideCursorInOverviewRuler
import anduin.facades.monacoEditor.mod.editor.EditorOption.highlightActiveIndentGuide
import anduin.facades.monacoEditor.mod.editor.EditorOption.hover
import anduin.facades.monacoEditor.mod.editor.EditorOption.inDiffEditor
import anduin.facades.monacoEditor.mod.editor.EditorOption.inlineHints
import anduin.facades.monacoEditor.mod.editor.EditorOption.layoutInfo
import anduin.facades.monacoEditor.mod.editor.EditorOption.letterSpacing
import anduin.facades.monacoEditor.mod.editor.EditorOption.lightbulb
import anduin.facades.monacoEditor.mod.editor.EditorOption.lineDecorationsWidth
import anduin.facades.monacoEditor.mod.editor.EditorOption.lineHeight
import anduin.facades.monacoEditor.mod.editor.EditorOption.lineNumbers
import anduin.facades.monacoEditor.mod.editor.EditorOption.lineNumbersMinChars
import anduin.facades.monacoEditor.mod.editor.EditorOption.linkedEditing
import anduin.facades.monacoEditor.mod.editor.EditorOption.links
import anduin.facades.monacoEditor.mod.editor.EditorOption.matchBrackets
import anduin.facades.monacoEditor.mod.editor.EditorOption.minimap
import anduin.facades.monacoEditor.mod.editor.EditorOption.mouseStyle
import anduin.facades.monacoEditor.mod.editor.EditorOption.mouseWheelScrollSensitivity
import anduin.facades.monacoEditor.mod.editor.EditorOption.mouseWheelZoom
import anduin.facades.monacoEditor.mod.editor.EditorOption.multiCursorMergeOverlapping
import anduin.facades.monacoEditor.mod.editor.EditorOption.multiCursorModifier
import anduin.facades.monacoEditor.mod.editor.EditorOption.multiCursorPaste
import anduin.facades.monacoEditor.mod.editor.EditorOption.occurrencesHighlight
import anduin.facades.monacoEditor.mod.editor.EditorOption.overviewRulerBorder
import anduin.facades.monacoEditor.mod.editor.EditorOption.overviewRulerLanes
import anduin.facades.monacoEditor.mod.editor.EditorOption.padding
import anduin.facades.monacoEditor.mod.editor.EditorOption.parameterHints
import anduin.facades.monacoEditor.mod.editor.EditorOption.peekWidgetDefaultFocus
import anduin.facades.monacoEditor.mod.editor.EditorOption.pixelRatio
import anduin.facades.monacoEditor.mod.editor.EditorOption.quickSuggestions
import anduin.facades.monacoEditor.mod.editor.EditorOption.quickSuggestionsDelay
import anduin.facades.monacoEditor.mod.editor.EditorOption.readOnly
import anduin.facades.monacoEditor.mod.editor.EditorOption.renameOnType
import anduin.facades.monacoEditor.mod.editor.EditorOption.renderControlCharacters
import anduin.facades.monacoEditor.mod.editor.EditorOption.renderFinalNewline
import anduin.facades.monacoEditor.mod.editor.EditorOption.renderIndentGuides
import anduin.facades.monacoEditor.mod.editor.EditorOption.renderLineHighlight
import anduin.facades.monacoEditor.mod.editor.EditorOption.renderLineHighlightOnlyWhenFocus
import anduin.facades.monacoEditor.mod.editor.EditorOption.renderValidationDecorations
import anduin.facades.monacoEditor.mod.editor.EditorOption.renderWhitespace
import anduin.facades.monacoEditor.mod.editor.EditorOption.revealHorizontalRightPadding
import anduin.facades.monacoEditor.mod.editor.EditorOption.roundedSelection
import anduin.facades.monacoEditor.mod.editor.EditorOption.rulers
import anduin.facades.monacoEditor.mod.editor.EditorOption.scrollBeyondLastColumn
import anduin.facades.monacoEditor.mod.editor.EditorOption.scrollBeyondLastLine
import anduin.facades.monacoEditor.mod.editor.EditorOption.scrollPredominantAxis
import anduin.facades.monacoEditor.mod.editor.EditorOption.scrollbar
import anduin.facades.monacoEditor.mod.editor.EditorOption.selectOnLineNumbers
import anduin.facades.monacoEditor.mod.editor.EditorOption.selectionClipboard
import anduin.facades.monacoEditor.mod.editor.EditorOption.selectionHighlight
import anduin.facades.monacoEditor.mod.editor.EditorOption.showDeprecated
import anduin.facades.monacoEditor.mod.editor.EditorOption.showFoldingControls
import anduin.facades.monacoEditor.mod.editor.EditorOption.showUnused
import anduin.facades.monacoEditor.mod.editor.EditorOption.smartSelect
import anduin.facades.monacoEditor.mod.editor.EditorOption.smoothScrolling
import anduin.facades.monacoEditor.mod.editor.EditorOption.snippetSuggestions
import anduin.facades.monacoEditor.mod.editor.EditorOption.stickyTabStops
import anduin.facades.monacoEditor.mod.editor.EditorOption.stopRenderingLineAfter
import anduin.facades.monacoEditor.mod.editor.EditorOption.suggest
import anduin.facades.monacoEditor.mod.editor.EditorOption.suggestFontSize
import anduin.facades.monacoEditor.mod.editor.EditorOption.suggestLineHeight
import anduin.facades.monacoEditor.mod.editor.EditorOption.suggestOnTriggerCharacters
import anduin.facades.monacoEditor.mod.editor.EditorOption.suggestSelection
import anduin.facades.monacoEditor.mod.editor.EditorOption.tabCompletion
import anduin.facades.monacoEditor.mod.editor.EditorOption.tabFocusMode
import anduin.facades.monacoEditor.mod.editor.EditorOption.tabIndex
import anduin.facades.monacoEditor.mod.editor.EditorOption.unfoldOnClickAfterEndOfLine
import anduin.facades.monacoEditor.mod.editor.EditorOption.unusualLineTerminators
import anduin.facades.monacoEditor.mod.editor.EditorOption.useTabStops
import anduin.facades.monacoEditor.mod.editor.EditorOption.wordSeparators
import anduin.facades.monacoEditor.mod.editor.EditorOption.wordWrap
import anduin.facades.monacoEditor.mod.editor.EditorOption.wordWrapBreakAfterCharacters
import anduin.facades.monacoEditor.mod.editor.EditorOption.wordWrapBreakBeforeCharacters
import anduin.facades.monacoEditor.mod.editor.EditorOption.wordWrapOverride1
import anduin.facades.monacoEditor.mod.editor.EditorOption.wordWrapOverride2
import anduin.facades.monacoEditor.mod.editor.EditorOption.wrappingIndent
import anduin.facades.monacoEditor.mod.editor.EditorOption.wrappingInfo
import anduin.facades.monacoEditor.mod.editor.EditorOption.wrappingStrategy
import anduin.facades.monacoEditor.monacoEditorStrings.`inline`
import anduin.facades.monacoEditor.monacoEditorStrings.advanced
import anduin.facades.monacoEditor.monacoEditorStrings.all
import anduin.facades.monacoEditor.monacoEditorStrings.altKey
import anduin.facades.monacoEditor.monacoEditorStrings.always
import anduin.facades.monacoEditor.monacoEditorStrings.auto
import anduin.facades.monacoEditor.monacoEditorStrings.bottom
import anduin.facades.monacoEditor.monacoEditorStrings.boundary
import anduin.facades.monacoEditor.monacoEditorStrings.bounded
import anduin.facades.monacoEditor.monacoEditorStrings.copy
import anduin.facades.monacoEditor.monacoEditorStrings.ctrlKey
import anduin.facades.monacoEditor.monacoEditorStrings.default
import anduin.facades.monacoEditor.monacoEditorStrings.editable
import anduin.facades.monacoEditor.monacoEditorStrings.first
import anduin.facades.monacoEditor.monacoEditorStrings.full
import anduin.facades.monacoEditor.monacoEditorStrings.gutter
import anduin.facades.monacoEditor.monacoEditorStrings.indentation
import anduin.facades.monacoEditor.monacoEditorStrings.inherit
import anduin.facades.monacoEditor.monacoEditorStrings.line
import anduin.facades.monacoEditor.monacoEditorStrings.metaKey
import anduin.facades.monacoEditor.monacoEditorStrings.mouseover
import anduin.facades.monacoEditor.monacoEditorStrings.near
import anduin.facades.monacoEditor.monacoEditorStrings.never
import anduin.facades.monacoEditor.monacoEditorStrings.none
import anduin.facades.monacoEditor.monacoEditorStrings.off
import anduin.facades.monacoEditor.monacoEditorStrings.on
import anduin.facades.monacoEditor.monacoEditorStrings.onlySnippets
import anduin.facades.monacoEditor.monacoEditorStrings.prompt
import anduin.facades.monacoEditor.monacoEditorStrings.recentlyUsed
import anduin.facades.monacoEditor.monacoEditorStrings.recentlyUsedByPrefix
import anduin.facades.monacoEditor.monacoEditorStrings.selection
import anduin.facades.monacoEditor.monacoEditorStrings.simple
import anduin.facades.monacoEditor.monacoEditorStrings.smart
import anduin.facades.monacoEditor.monacoEditorStrings.spread
import anduin.facades.monacoEditor.monacoEditorStrings.text
import anduin.facades.monacoEditor.monacoEditorStrings.top
import anduin.facades.monacoEditor.monacoEditorStrings.trailing
import anduin.facades.monacoEditor.monacoEditorStrings.tree
import anduin.facades.monacoEditor.monacoEditorStrings.wordWrapColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EditorOptions {
  
  @JSImport("monaco-editor", "editor.EditorOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("monaco-editor", "editor.EditorOptions.acceptSuggestionOnCommitCharacter")
  @js.native
  def acceptSuggestionOnCommitCharacter: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnCommitCharacter, 
    Boolean
  ] = js.native
  @scala.inline
  def acceptSuggestionOnCommitCharacter_=(x: IEditorOption[acceptSuggestionOnCommitCharacter, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("acceptSuggestionOnCommitCharacter")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.acceptSuggestionOnEnter")
  @js.native
  def acceptSuggestionOnEnter: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.acceptSuggestionOnEnter, 
    on | off | smart
  ] = js.native
  @scala.inline
  def acceptSuggestionOnEnter_=(x: IEditorOption[acceptSuggestionOnEnter, on | off | smart]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("acceptSuggestionOnEnter")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.accessibilityPageSize")
  @js.native
  def accessibilityPageSize: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.accessibilityPageSize, Double] = js.native
  @scala.inline
  def accessibilityPageSize_=(x: IEditorOption[accessibilityPageSize, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilityPageSize")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.accessibilitySupport")
  @js.native
  def accessibilitySupport: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.accessibilitySupport, 
    AccessibilitySupport
  ] = js.native
  @scala.inline
  def accessibilitySupport_=(x: IEditorOption[accessibilitySupport, AccessibilitySupport]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessibilitySupport")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.ariaLabel")
  @js.native
  def ariaLabel: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.ariaLabel, String] = js.native
  @scala.inline
  def ariaLabel_=(x: IEditorOption[ariaLabel, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.autoClosingBrackets")
  @js.native
  def autoClosingBrackets: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.autoClosingBrackets, 
    EditorAutoClosingStrategy
  ] = js.native
  @scala.inline
  def autoClosingBrackets_=(x: IEditorOption[autoClosingBrackets, EditorAutoClosingStrategy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClosingBrackets")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.autoClosingOvertype")
  @js.native
  def autoClosingOvertype: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.autoClosingOvertype, 
    EditorAutoClosingOvertypeStrategy
  ] = js.native
  @scala.inline
  def autoClosingOvertype_=(x: IEditorOption[autoClosingOvertype, EditorAutoClosingOvertypeStrategy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClosingOvertype")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.autoClosingQuotes")
  @js.native
  def autoClosingQuotes: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.autoClosingQuotes, 
    EditorAutoClosingStrategy
  ] = js.native
  @scala.inline
  def autoClosingQuotes_=(x: IEditorOption[autoClosingQuotes, EditorAutoClosingStrategy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClosingQuotes")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.autoIndent")
  @js.native
  def autoIndent: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.autoIndent, 
    EditorAutoIndentStrategy
  ] = js.native
  @scala.inline
  def autoIndent_=(x: IEditorOption[autoIndent, EditorAutoIndentStrategy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoIndent")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.autoSurround")
  @js.native
  def autoSurround: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.autoSurround, 
    EditorAutoSurroundStrategy
  ] = js.native
  @scala.inline
  def autoSurround_=(x: IEditorOption[autoSurround, EditorAutoSurroundStrategy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoSurround")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.automaticLayout")
  @js.native
  def automaticLayout: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.automaticLayout, Boolean] = js.native
  @scala.inline
  def automaticLayout_=(x: IEditorOption[automaticLayout, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("automaticLayout")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.codeLens")
  @js.native
  def codeLens: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.codeLens, Boolean] = js.native
  
  @JSImport("monaco-editor", "editor.EditorOptions.codeLensFontFamily")
  @js.native
  def codeLensFontFamily: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.codeLensFontFamily, String] = js.native
  @scala.inline
  def codeLensFontFamily_=(x: IEditorOption[codeLensFontFamily, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("codeLensFontFamily")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.codeLensFontSize")
  @js.native
  def codeLensFontSize: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.codeLensFontSize, Double] = js.native
  @scala.inline
  def codeLensFontSize_=(x: IEditorOption[codeLensFontSize, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("codeLensFontSize")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def codeLens_=(x: IEditorOption[codeLens, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("codeLens")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.colorDecorators")
  @js.native
  def colorDecorators: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.colorDecorators, Boolean] = js.native
  @scala.inline
  def colorDecorators_=(x: IEditorOption[colorDecorators, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorDecorators")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.columnSelection")
  @js.native
  def columnSelection: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.columnSelection, Boolean] = js.native
  @scala.inline
  def columnSelection_=(x: IEditorOption[columnSelection, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("columnSelection")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.comments")
  @js.native
  def comments: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.comments, 
    EditorCommentsOptions
  ] = js.native
  @scala.inline
  def comments_=(x: IEditorOption[comments, EditorCommentsOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("comments")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.contextmenu")
  @js.native
  def contextmenu: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.contextmenu, Boolean] = js.native
  @scala.inline
  def contextmenu_=(x: IEditorOption[contextmenu, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextmenu")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.copyWithSyntaxHighlighting")
  @js.native
  def copyWithSyntaxHighlighting: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.copyWithSyntaxHighlighting, 
    Boolean
  ] = js.native
  @scala.inline
  def copyWithSyntaxHighlighting_=(x: IEditorOption[copyWithSyntaxHighlighting, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("copyWithSyntaxHighlighting")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.cursorBlinking")
  @js.native
  def cursorBlinking: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.cursorBlinking, 
    TextEditorCursorBlinkingStyle
  ] = js.native
  @scala.inline
  def cursorBlinking_=(x: IEditorOption[cursorBlinking, TextEditorCursorBlinkingStyle]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorBlinking")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.cursorSmoothCaretAnimation")
  @js.native
  def cursorSmoothCaretAnimation: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.cursorSmoothCaretAnimation, 
    Boolean
  ] = js.native
  @scala.inline
  def cursorSmoothCaretAnimation_=(x: IEditorOption[cursorSmoothCaretAnimation, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorSmoothCaretAnimation")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.cursorStyle")
  @js.native
  def cursorStyle: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.cursorStyle, 
    TextEditorCursorStyle
  ] = js.native
  @scala.inline
  def cursorStyle_=(x: IEditorOption[cursorStyle, TextEditorCursorStyle]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorStyle")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.cursorSurroundingLines")
  @js.native
  def cursorSurroundingLines: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.cursorSurroundingLines, Double] = js.native
  
  @JSImport("monaco-editor", "editor.EditorOptions.cursorSurroundingLinesStyle")
  @js.native
  def cursorSurroundingLinesStyle: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.cursorSurroundingLinesStyle, 
    default | all
  ] = js.native
  @scala.inline
  def cursorSurroundingLinesStyle_=(x: IEditorOption[cursorSurroundingLinesStyle, default | all]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorSurroundingLinesStyle")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def cursorSurroundingLines_=(x: IEditorOption[cursorSurroundingLines, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorSurroundingLines")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.cursorWidth")
  @js.native
  def cursorWidth: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.cursorWidth, Double] = js.native
  @scala.inline
  def cursorWidth_=(x: IEditorOption[cursorWidth, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorWidth")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.definitionLinkOpensInPeek")
  @js.native
  def definitionLinkOpensInPeek: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.definitionLinkOpensInPeek, 
    Boolean
  ] = js.native
  @scala.inline
  def definitionLinkOpensInPeek_=(x: IEditorOption[definitionLinkOpensInPeek, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("definitionLinkOpensInPeek")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.disableLayerHinting")
  @js.native
  def disableLayerHinting: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.disableLayerHinting, Boolean] = js.native
  @scala.inline
  def disableLayerHinting_=(x: IEditorOption[disableLayerHinting, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableLayerHinting")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.disableMonospaceOptimizations")
  @js.native
  def disableMonospaceOptimizations: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.disableMonospaceOptimizations, 
    Boolean
  ] = js.native
  @scala.inline
  def disableMonospaceOptimizations_=(x: IEditorOption[disableMonospaceOptimizations, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableMonospaceOptimizations")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.dragAndDrop")
  @js.native
  def dragAndDrop: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.dragAndDrop, Boolean] = js.native
  @scala.inline
  def dragAndDrop_=(x: IEditorOption[dragAndDrop, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragAndDrop")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.editorClassName")
  @js.native
  def editorClassName: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.editorClassName, String] = js.native
  @scala.inline
  def editorClassName_=(x: IEditorOption[editorClassName, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorClassName")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.emptySelectionClipboard")
  @js.native
  def emptySelectionClipboard: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.emptySelectionClipboard, 
    Boolean
  ] = js.native
  @scala.inline
  def emptySelectionClipboard_=(x: IEditorOption[emptySelectionClipboard, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptySelectionClipboard")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.extraEditorClassName")
  @js.native
  def extraEditorClassName: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.extraEditorClassName, String] = js.native
  @scala.inline
  def extraEditorClassName_=(x: IEditorOption[extraEditorClassName, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extraEditorClassName")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.fastScrollSensitivity")
  @js.native
  def fastScrollSensitivity: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.fastScrollSensitivity, Double] = js.native
  @scala.inline
  def fastScrollSensitivity_=(x: IEditorOption[fastScrollSensitivity, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fastScrollSensitivity")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.find")
  @js.native
  def find: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.find, EditorFindOptions] = js.native
  @scala.inline
  def find_=(x: IEditorOption[find, EditorFindOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("find")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.fixedOverflowWidgets")
  @js.native
  def fixedOverflowWidgets: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.fixedOverflowWidgets, Boolean] = js.native
  @scala.inline
  def fixedOverflowWidgets_=(x: IEditorOption[fixedOverflowWidgets, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fixedOverflowWidgets")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.folding")
  @js.native
  def folding: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.folding, Boolean] = js.native
  
  @JSImport("monaco-editor", "editor.EditorOptions.foldingHighlight")
  @js.native
  def foldingHighlight: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.foldingHighlight, Boolean] = js.native
  @scala.inline
  def foldingHighlight_=(x: IEditorOption[foldingHighlight, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("foldingHighlight")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.foldingStrategy")
  @js.native
  def foldingStrategy: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.foldingStrategy, 
    auto | indentation
  ] = js.native
  @scala.inline
  def foldingStrategy_=(x: IEditorOption[foldingStrategy, auto | indentation]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("foldingStrategy")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def folding_=(x: IEditorOption[folding, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("folding")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.fontFamily")
  @js.native
  def fontFamily: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.fontFamily, String] = js.native
  @scala.inline
  def fontFamily_=(x: IEditorOption[fontFamily, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.fontInfo")
  @js.native
  def fontInfo: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.fontInfo, FontInfo] = js.native
  @scala.inline
  def fontInfo_=(x: IEditorOption[fontInfo, FontInfo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontInfo")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.fontLigatures2")
  @js.native
  def fontLigatures2: IEditorOption[fontLigatures, String] = js.native
  @scala.inline
  def fontLigatures2_=(x: IEditorOption[fontLigatures, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontLigatures2")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.fontSize")
  @js.native
  def fontSize: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.fontSize, Double] = js.native
  @scala.inline
  def fontSize_=(x: IEditorOption[fontSize, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.fontWeight")
  @js.native
  def fontWeight: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.fontWeight, String] = js.native
  @scala.inline
  def fontWeight_=(x: IEditorOption[fontWeight, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.formatOnPaste")
  @js.native
  def formatOnPaste: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.formatOnPaste, Boolean] = js.native
  @scala.inline
  def formatOnPaste_=(x: IEditorOption[formatOnPaste, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatOnPaste")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.formatOnType")
  @js.native
  def formatOnType: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.formatOnType, Boolean] = js.native
  @scala.inline
  def formatOnType_=(x: IEditorOption[formatOnType, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatOnType")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.glyphMargin")
  @js.native
  def glyphMargin: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.glyphMargin, Boolean] = js.native
  @scala.inline
  def glyphMargin_=(x: IEditorOption[glyphMargin, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("glyphMargin")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.gotoLocation")
  @js.native
  def gotoLocation: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.gotoLocation, 
    GoToLocationOptions
  ] = js.native
  @scala.inline
  def gotoLocation_=(x: IEditorOption[gotoLocation, GoToLocationOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gotoLocation")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.hideCursorInOverviewRuler")
  @js.native
  def hideCursorInOverviewRuler: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.hideCursorInOverviewRuler, 
    Boolean
  ] = js.native
  @scala.inline
  def hideCursorInOverviewRuler_=(x: IEditorOption[hideCursorInOverviewRuler, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hideCursorInOverviewRuler")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.highlightActiveIndentGuide")
  @js.native
  def highlightActiveIndentGuide: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.highlightActiveIndentGuide, 
    Boolean
  ] = js.native
  @scala.inline
  def highlightActiveIndentGuide_=(x: IEditorOption[highlightActiveIndentGuide, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highlightActiveIndentGuide")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.hover")
  @js.native
  def hover: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.hover, EditorHoverOptions] = js.native
  @scala.inline
  def hover_=(x: IEditorOption[hover, EditorHoverOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hover")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.inDiffEditor")
  @js.native
  def inDiffEditor: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.inDiffEditor, Boolean] = js.native
  @scala.inline
  def inDiffEditor_=(x: IEditorOption[inDiffEditor, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inDiffEditor")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.inlineHints")
  @js.native
  def inlineHints: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.inlineHints, js.Any] = js.native
  @scala.inline
  def inlineHints_=(x: IEditorOption[inlineHints, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inlineHints")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.layoutInfo")
  @js.native
  def layoutInfo: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.layoutInfo, EditorLayoutInfo] = js.native
  @scala.inline
  def layoutInfo_=(x: IEditorOption[layoutInfo, EditorLayoutInfo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("layoutInfo")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.letterSpacing")
  @js.native
  def letterSpacing: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.letterSpacing, Double] = js.native
  @scala.inline
  def letterSpacing_=(x: IEditorOption[letterSpacing, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.lightbulb")
  @js.native
  def lightbulb: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.lightbulb, 
    EditorLightbulbOptions
  ] = js.native
  @scala.inline
  def lightbulb_=(x: IEditorOption[lightbulb, EditorLightbulbOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lightbulb")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.lineDecorationsWidth")
  @js.native
  def lineDecorationsWidth: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.lineDecorationsWidth, 
    String | Double
  ] = js.native
  @scala.inline
  def lineDecorationsWidth_=(x: IEditorOption[lineDecorationsWidth, String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineDecorationsWidth")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.lineHeight")
  @js.native
  def lineHeight: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.lineHeight, Double] = js.native
  @scala.inline
  def lineHeight_=(x: IEditorOption[lineHeight, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.lineNumbers")
  @js.native
  def lineNumbers: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.lineNumbers, 
    InternalEditorRenderLineNumbersOptions
  ] = js.native
  
  @JSImport("monaco-editor", "editor.EditorOptions.lineNumbersMinChars")
  @js.native
  def lineNumbersMinChars: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.lineNumbersMinChars, Double] = js.native
  @scala.inline
  def lineNumbersMinChars_=(x: IEditorOption[lineNumbersMinChars, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineNumbersMinChars")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def lineNumbers_=(x: IEditorOption[lineNumbers, InternalEditorRenderLineNumbersOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineNumbers")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.linkedEditing")
  @js.native
  def linkedEditing: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.linkedEditing, Boolean] = js.native
  @scala.inline
  def linkedEditing_=(x: IEditorOption[linkedEditing, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("linkedEditing")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.links")
  @js.native
  def links: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.links, Boolean] = js.native
  @scala.inline
  def links_=(x: IEditorOption[links, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("links")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.matchBrackets")
  @js.native
  def matchBrackets: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.matchBrackets, 
    always | never | near
  ] = js.native
  @scala.inline
  def matchBrackets_=(x: IEditorOption[matchBrackets, always | never | near]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("matchBrackets")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.minimap")
  @js.native
  def minimap: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.minimap, EditorMinimapOptions] = js.native
  @scala.inline
  def minimap_=(x: IEditorOption[minimap, EditorMinimapOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minimap")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.mouseStyle")
  @js.native
  def mouseStyle: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.mouseStyle, 
    default | text | copy
  ] = js.native
  @scala.inline
  def mouseStyle_=(x: IEditorOption[mouseStyle, default | text | copy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseStyle")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.mouseWheelScrollSensitivity")
  @js.native
  def mouseWheelScrollSensitivity: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.mouseWheelScrollSensitivity, 
    Double
  ] = js.native
  @scala.inline
  def mouseWheelScrollSensitivity_=(x: IEditorOption[mouseWheelScrollSensitivity, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelScrollSensitivity")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.mouseWheelZoom")
  @js.native
  def mouseWheelZoom: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.mouseWheelZoom, Boolean] = js.native
  @scala.inline
  def mouseWheelZoom_=(x: IEditorOption[mouseWheelZoom, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelZoom")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.multiCursorMergeOverlapping")
  @js.native
  def multiCursorMergeOverlapping: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.multiCursorMergeOverlapping, 
    Boolean
  ] = js.native
  @scala.inline
  def multiCursorMergeOverlapping_=(x: IEditorOption[multiCursorMergeOverlapping, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multiCursorMergeOverlapping")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.multiCursorModifier")
  @js.native
  def multiCursorModifier: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.multiCursorModifier, 
    altKey | metaKey | ctrlKey
  ] = js.native
  @scala.inline
  def multiCursorModifier_=(x: IEditorOption[multiCursorModifier, altKey | metaKey | ctrlKey]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multiCursorModifier")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.multiCursorPaste")
  @js.native
  def multiCursorPaste: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.multiCursorPaste, 
    spread | full
  ] = js.native
  @scala.inline
  def multiCursorPaste_=(x: IEditorOption[multiCursorPaste, spread | full]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multiCursorPaste")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.occurrencesHighlight")
  @js.native
  def occurrencesHighlight: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.occurrencesHighlight, Boolean] = js.native
  @scala.inline
  def occurrencesHighlight_=(x: IEditorOption[occurrencesHighlight, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("occurrencesHighlight")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.overviewRulerBorder")
  @js.native
  def overviewRulerBorder: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.overviewRulerBorder, Boolean] = js.native
  @scala.inline
  def overviewRulerBorder_=(x: IEditorOption[overviewRulerBorder, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overviewRulerBorder")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.overviewRulerLanes")
  @js.native
  def overviewRulerLanes: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.overviewRulerLanes, Double] = js.native
  @scala.inline
  def overviewRulerLanes_=(x: IEditorOption[overviewRulerLanes, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overviewRulerLanes")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.padding")
  @js.native
  def padding: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.padding, 
    InternalEditorPaddingOptions
  ] = js.native
  @scala.inline
  def padding_=(x: IEditorOption[padding, InternalEditorPaddingOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padding")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.parameterHints")
  @js.native
  def parameterHints: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.parameterHints, 
    InternalParameterHintOptions
  ] = js.native
  @scala.inline
  def parameterHints_=(x: IEditorOption[parameterHints, InternalParameterHintOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameterHints")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.peekWidgetDefaultFocus")
  @js.native
  def peekWidgetDefaultFocus: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.peekWidgetDefaultFocus, 
    tree | anduin.facades.monacoEditor.monacoEditorStrings.editor
  ] = js.native
  @scala.inline
  def peekWidgetDefaultFocus_=(
    x: IEditorOption[
      peekWidgetDefaultFocus, 
      tree | anduin.facades.monacoEditor.monacoEditorStrings.editor
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("peekWidgetDefaultFocus")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.pixelRatio")
  @js.native
  def pixelRatio: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.pixelRatio, Double] = js.native
  @scala.inline
  def pixelRatio_=(x: IEditorOption[pixelRatio, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.quickSuggestions")
  @js.native
  def quickSuggestions: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.quickSuggestions, 
    ValidQuickSuggestionsOptions
  ] = js.native
  
  @JSImport("monaco-editor", "editor.EditorOptions.quickSuggestionsDelay")
  @js.native
  def quickSuggestionsDelay: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.quickSuggestionsDelay, Double] = js.native
  @scala.inline
  def quickSuggestionsDelay_=(x: IEditorOption[quickSuggestionsDelay, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quickSuggestionsDelay")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def quickSuggestions_=(x: IEditorOption[quickSuggestions, ValidQuickSuggestionsOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("quickSuggestions")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.readOnly")
  @js.native
  def readOnly: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.readOnly, Boolean] = js.native
  @scala.inline
  def readOnly_=(x: IEditorOption[readOnly, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.renameOnType")
  @js.native
  def renameOnType: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.renameOnType, Boolean] = js.native
  @scala.inline
  def renameOnType_=(x: IEditorOption[renameOnType, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renameOnType")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.renderControlCharacters")
  @js.native
  def renderControlCharacters: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.renderControlCharacters, 
    Boolean
  ] = js.native
  @scala.inline
  def renderControlCharacters_=(x: IEditorOption[renderControlCharacters, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderControlCharacters")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.renderFinalNewline")
  @js.native
  def renderFinalNewline: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.renderFinalNewline, Boolean] = js.native
  @scala.inline
  def renderFinalNewline_=(x: IEditorOption[renderFinalNewline, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderFinalNewline")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.renderIndentGuides")
  @js.native
  def renderIndentGuides: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.renderIndentGuides, Boolean] = js.native
  @scala.inline
  def renderIndentGuides_=(x: IEditorOption[renderIndentGuides, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderIndentGuides")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.renderLineHighlight")
  @js.native
  def renderLineHighlight: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.renderLineHighlight, 
    all | line | none | gutter
  ] = js.native
  
  @JSImport("monaco-editor", "editor.EditorOptions.renderLineHighlightOnlyWhenFocus")
  @js.native
  def renderLineHighlightOnlyWhenFocus: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.renderLineHighlightOnlyWhenFocus, 
    Boolean
  ] = js.native
  @scala.inline
  def renderLineHighlightOnlyWhenFocus_=(x: IEditorOption[renderLineHighlightOnlyWhenFocus, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderLineHighlightOnlyWhenFocus")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def renderLineHighlight_=(x: IEditorOption[renderLineHighlight, all | line | none | gutter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderLineHighlight")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.renderValidationDecorations")
  @js.native
  def renderValidationDecorations: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.renderValidationDecorations, 
    on | off | editable
  ] = js.native
  @scala.inline
  def renderValidationDecorations_=(x: IEditorOption[renderValidationDecorations, on | off | editable]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderValidationDecorations")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.renderWhitespace")
  @js.native
  def renderWhitespace: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.renderWhitespace, 
    all | none | boundary | selection | trailing
  ] = js.native
  @scala.inline
  def renderWhitespace_=(x: IEditorOption[renderWhitespace, all | none | boundary | selection | trailing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderWhitespace")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.revealHorizontalRightPadding")
  @js.native
  def revealHorizontalRightPadding: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.revealHorizontalRightPadding, 
    Double
  ] = js.native
  @scala.inline
  def revealHorizontalRightPadding_=(x: IEditorOption[revealHorizontalRightPadding, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("revealHorizontalRightPadding")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.roundedSelection")
  @js.native
  def roundedSelection: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.roundedSelection, Boolean] = js.native
  @scala.inline
  def roundedSelection_=(x: IEditorOption[roundedSelection, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("roundedSelection")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.rulers")
  @js.native
  def rulers: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.rulers, js.Object] = js.native
  @scala.inline
  def rulers_=(x: IEditorOption[rulers, js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rulers")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.scrollBeyondLastColumn")
  @js.native
  def scrollBeyondLastColumn: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.scrollBeyondLastColumn, Double] = js.native
  @scala.inline
  def scrollBeyondLastColumn_=(x: IEditorOption[scrollBeyondLastColumn, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollBeyondLastColumn")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.scrollBeyondLastLine")
  @js.native
  def scrollBeyondLastLine: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.scrollBeyondLastLine, Boolean] = js.native
  @scala.inline
  def scrollBeyondLastLine_=(x: IEditorOption[scrollBeyondLastLine, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollBeyondLastLine")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.scrollPredominantAxis")
  @js.native
  def scrollPredominantAxis: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.scrollPredominantAxis, Boolean] = js.native
  @scala.inline
  def scrollPredominantAxis_=(x: IEditorOption[scrollPredominantAxis, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollPredominantAxis")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.scrollbar")
  @js.native
  def scrollbar: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.scrollbar, 
    InternalEditorScrollbarOptions
  ] = js.native
  @scala.inline
  def scrollbar_=(x: IEditorOption[scrollbar, InternalEditorScrollbarOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollbar")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.selectOnLineNumbers")
  @js.native
  def selectOnLineNumbers: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.selectOnLineNumbers, Boolean] = js.native
  @scala.inline
  def selectOnLineNumbers_=(x: IEditorOption[selectOnLineNumbers, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectOnLineNumbers")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.selectionClipboard")
  @js.native
  def selectionClipboard: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.selectionClipboard, Boolean] = js.native
  @scala.inline
  def selectionClipboard_=(x: IEditorOption[selectionClipboard, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectionClipboard")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.selectionHighlight")
  @js.native
  def selectionHighlight: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.selectionHighlight, Boolean] = js.native
  @scala.inline
  def selectionHighlight_=(x: IEditorOption[selectionHighlight, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectionHighlight")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.showDeprecated")
  @js.native
  def showDeprecated: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.showDeprecated, Boolean] = js.native
  @scala.inline
  def showDeprecated_=(x: IEditorOption[showDeprecated, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showDeprecated")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.showFoldingControls")
  @js.native
  def showFoldingControls: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.showFoldingControls, 
    always | mouseover
  ] = js.native
  @scala.inline
  def showFoldingControls_=(x: IEditorOption[showFoldingControls, always | mouseover]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showFoldingControls")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.showUnused")
  @js.native
  def showUnused: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.showUnused, Boolean] = js.native
  @scala.inline
  def showUnused_=(x: IEditorOption[showUnused, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showUnused")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.smartSelect")
  @js.native
  def smartSelect: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.smartSelect, js.Any] = js.native
  @scala.inline
  def smartSelect_=(x: IEditorOption[smartSelect, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smartSelect")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.smoothScrolling")
  @js.native
  def smoothScrolling: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.smoothScrolling, Boolean] = js.native
  @scala.inline
  def smoothScrolling_=(x: IEditorOption[smoothScrolling, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smoothScrolling")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.snippetSuggestions")
  @js.native
  def snippetSuggestions: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.snippetSuggestions, 
    none | top | bottom | `inline`
  ] = js.native
  @scala.inline
  def snippetSuggestions_=(x: IEditorOption[snippetSuggestions, none | top | bottom | `inline`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("snippetSuggestions")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.stickyTabStops")
  @js.native
  def stickyTabStops: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.stickyTabStops, Boolean] = js.native
  @scala.inline
  def stickyTabStops_=(x: IEditorOption[stickyTabStops, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stickyTabStops")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.stopRenderingLineAfter")
  @js.native
  def stopRenderingLineAfter: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.stopRenderingLineAfter, Double] = js.native
  @scala.inline
  def stopRenderingLineAfter_=(x: IEditorOption[stopRenderingLineAfter, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopRenderingLineAfter")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.suggest")
  @js.native
  def suggest: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.suggest, 
    InternalSuggestOptions
  ] = js.native
  
  @JSImport("monaco-editor", "editor.EditorOptions.suggestFontSize")
  @js.native
  def suggestFontSize: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.suggestFontSize, Double] = js.native
  @scala.inline
  def suggestFontSize_=(x: IEditorOption[suggestFontSize, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suggestFontSize")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.suggestLineHeight")
  @js.native
  def suggestLineHeight: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.suggestLineHeight, Double] = js.native
  @scala.inline
  def suggestLineHeight_=(x: IEditorOption[suggestLineHeight, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suggestLineHeight")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.suggestOnTriggerCharacters")
  @js.native
  def suggestOnTriggerCharacters: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.suggestOnTriggerCharacters, 
    Boolean
  ] = js.native
  @scala.inline
  def suggestOnTriggerCharacters_=(x: IEditorOption[suggestOnTriggerCharacters, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suggestOnTriggerCharacters")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.suggestSelection")
  @js.native
  def suggestSelection: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.suggestSelection, 
    first | recentlyUsed | recentlyUsedByPrefix
  ] = js.native
  @scala.inline
  def suggestSelection_=(x: IEditorOption[suggestSelection, first | recentlyUsed | recentlyUsedByPrefix]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suggestSelection")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def suggest_=(x: IEditorOption[suggest, InternalSuggestOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suggest")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.tabCompletion")
  @js.native
  def tabCompletion: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.tabCompletion, 
    on | off | onlySnippets
  ] = js.native
  @scala.inline
  def tabCompletion_=(x: IEditorOption[tabCompletion, on | off | onlySnippets]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabCompletion")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.tabFocusMode")
  @js.native
  def tabFocusMode: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.tabFocusMode, Boolean] = js.native
  @scala.inline
  def tabFocusMode_=(x: IEditorOption[tabFocusMode, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabFocusMode")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.tabIndex")
  @js.native
  def tabIndex: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.tabIndex, Double] = js.native
  @scala.inline
  def tabIndex_=(x: IEditorOption[tabIndex, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.unfoldOnClickAfterEndOfLine")
  @js.native
  def unfoldOnClickAfterEndOfLine: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.unfoldOnClickAfterEndOfLine, 
    Boolean
  ] = js.native
  @scala.inline
  def unfoldOnClickAfterEndOfLine_=(x: IEditorOption[unfoldOnClickAfterEndOfLine, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unfoldOnClickAfterEndOfLine")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.unusualLineTerminators")
  @js.native
  def unusualLineTerminators: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.unusualLineTerminators, 
    auto | off | prompt
  ] = js.native
  @scala.inline
  def unusualLineTerminators_=(x: IEditorOption[unusualLineTerminators, auto | off | prompt]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unusualLineTerminators")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.useTabStops")
  @js.native
  def useTabStops: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.useTabStops, Boolean] = js.native
  @scala.inline
  def useTabStops_=(x: IEditorOption[useTabStops, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useTabStops")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.wordSeparators")
  @js.native
  def wordSeparators: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.wordSeparators, String] = js.native
  @scala.inline
  def wordSeparators_=(x: IEditorOption[wordSeparators, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordSeparators")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.wordWrap")
  @js.native
  def wordWrap: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.wordWrap, 
    on | off | wordWrapColumn | bounded
  ] = js.native
  
  @JSImport("monaco-editor", "editor.EditorOptions.wordWrapBreakAfterCharacters")
  @js.native
  def wordWrapBreakAfterCharacters: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.wordWrapBreakAfterCharacters, 
    String
  ] = js.native
  @scala.inline
  def wordWrapBreakAfterCharacters_=(x: IEditorOption[wordWrapBreakAfterCharacters, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordWrapBreakAfterCharacters")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.wordWrapBreakBeforeCharacters")
  @js.native
  def wordWrapBreakBeforeCharacters: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.wordWrapBreakBeforeCharacters, 
    String
  ] = js.native
  @scala.inline
  def wordWrapBreakBeforeCharacters_=(x: IEditorOption[wordWrapBreakBeforeCharacters, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordWrapBreakBeforeCharacters")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.wordWrapColumn")
  @js.native
  def wordWrapColumn: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.wordWrapColumn, Double] = js.native
  @scala.inline
  def wordWrapColumn_=(x: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.wordWrapColumn, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordWrapColumn")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.wordWrapOverride1")
  @js.native
  def wordWrapOverride1: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.wordWrapOverride1, 
    on | off | inherit
  ] = js.native
  @scala.inline
  def wordWrapOverride1_=(x: IEditorOption[wordWrapOverride1, on | off | inherit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordWrapOverride1")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.wordWrapOverride2")
  @js.native
  def wordWrapOverride2: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.wordWrapOverride2, 
    on | off | inherit
  ] = js.native
  @scala.inline
  def wordWrapOverride2_=(x: IEditorOption[wordWrapOverride2, on | off | inherit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordWrapOverride2")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def wordWrap_=(x: IEditorOption[wordWrap, on | off | wordWrapColumn | bounded]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.wrappingIndent")
  @js.native
  def wrappingIndent: IEditorOption[anduin.facades.monacoEditor.mod.editor.EditorOption.wrappingIndent, WrappingIndent] = js.native
  @scala.inline
  def wrappingIndent_=(x: IEditorOption[wrappingIndent, WrappingIndent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrappingIndent")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.wrappingInfo")
  @js.native
  def wrappingInfo: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.wrappingInfo, 
    EditorWrappingInfo
  ] = js.native
  @scala.inline
  def wrappingInfo_=(x: IEditorOption[wrappingInfo, EditorWrappingInfo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrappingInfo")(x.asInstanceOf[js.Any])
  
  @JSImport("monaco-editor", "editor.EditorOptions.wrappingStrategy")
  @js.native
  def wrappingStrategy: IEditorOption[
    anduin.facades.monacoEditor.mod.editor.EditorOption.wrappingStrategy, 
    simple | advanced
  ] = js.native
  @scala.inline
  def wrappingStrategy_=(x: IEditorOption[wrappingStrategy, simple | advanced]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrappingStrategy")(x.asInstanceOf[js.Any])
}
