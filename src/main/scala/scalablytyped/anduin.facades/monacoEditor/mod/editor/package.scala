package anduin.facades.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object editor {
  
  type ComputedEditorOptionValue[T /* <: anduin.facades.monacoEditor.mod.editor.IEditorOption[_, _] */] = js.Any
  
  type FindComputedEditorOptionValueById[T /* <: anduin.facades.monacoEditor.mod.editor.EditorOption */] = anduin.facades.std.NonNullable[
    anduin.facades.monacoEditor.mod.editor.ComputedEditorOptionValue[
      /* import warning: importer.ImportType#apply Failed type conversion: monaco-editor.monaco-editor.editor.EditorOptionsType[monaco-editor.monaco-editor.editor.FindEditorOptionsKeyById<T>] */ js.Any
    ]
  ]
  
  type FindEditorOptionsKeyById[T /* <: anduin.facades.monacoEditor.mod.editor.EditorOption */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof monaco-editor.monaco-editor.editor.EditorOptionsType ]: monaco-editor.monaco-editor.editor.EditorOptionsType[K]['id'] extends T? K : never}[keyof monaco-editor.monaco-editor.editor.EditorOptionsType] */ js.Any
  
  type IColors = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type ICommandHandler = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  type ICursorStateComputer = js.Function1[
    /* inverseEditOperations */ js.Array[anduin.facades.monacoEditor.mod.editor.IValidEditOperation], 
    js.Array[anduin.facades.monacoEditor.mod.Selection] | scala.Null
  ]
  
  type IEditorOverrideServices = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type IModel = anduin.facades.monacoEditor.mod.editor.ITextModel
  
  type IReadOnlyModel = anduin.facades.monacoEditor.mod.editor.ITextModel
  
  /* Rewritten from type alias, can be one of: 
    - `anduin.facades`.monacoEditor.monacoEditorStrings.on
    - `anduin.facades`.monacoEditor.monacoEditorStrings.off
    - `anduin.facades`.monacoEditor.monacoEditorStrings.relative
    - `anduin.facades`.monacoEditor.monacoEditorStrings.interval
    - js.Function1[/ * lineNumber * / scala.Double, java.lang.String]
  */
  type LineNumbersType = anduin.facades.monacoEditor.mod.editor._LineNumbersType | (js.Function1[/* lineNumber */ scala.Double, java.lang.String])
  
  type ValidQuickSuggestionsOptions = scala.Boolean | anduin.facades.monacoEditor.anon.ReadonlyRequiredIQuickSug
  
  @scala.inline
  def colorize(
    text: java.lang.String,
    languageId: java.lang.String,
    options: anduin.facades.monacoEditor.mod.editor.IColorizerOptions
  ): js.Promise[java.lang.String] = (anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("colorize")(text.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  
  @scala.inline
  def colorizeElement(
    domNode: org.scalajs.dom.raw.HTMLElement,
    options: anduin.facades.monacoEditor.mod.editor.IColorizerElementOptions
  ): js.Promise[scala.Unit] = (anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("colorizeElement")(domNode.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
  
  @scala.inline
  def colorizeModelLine(model: anduin.facades.monacoEditor.mod.editor.ITextModel, lineNumber: scala.Double): java.lang.String = (anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("colorizeModelLine")(model.asInstanceOf[js.Any], lineNumber.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def colorizeModelLine(
    model: anduin.facades.monacoEditor.mod.editor.ITextModel,
    lineNumber: scala.Double,
    tabSize: scala.Double
  ): java.lang.String = (anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("colorizeModelLine")(model.asInstanceOf[js.Any], lineNumber.asInstanceOf[js.Any], tabSize.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def create(domElement: org.scalajs.dom.raw.HTMLElement): anduin.facades.monacoEditor.mod.editor.IStandaloneCodeEditor = anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("create")(domElement.asInstanceOf[js.Any]).asInstanceOf[anduin.facades.monacoEditor.mod.editor.IStandaloneCodeEditor]
  @scala.inline
  def create(
    domElement: org.scalajs.dom.raw.HTMLElement,
    options: js.UndefOr[scala.Nothing],
    `override`: anduin.facades.monacoEditor.mod.editor.IEditorOverrideServices
  ): anduin.facades.monacoEditor.mod.editor.IStandaloneCodeEditor = (anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("create")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.editor.IStandaloneCodeEditor]
  @scala.inline
  def create(
    domElement: org.scalajs.dom.raw.HTMLElement,
    options: anduin.facades.monacoEditor.mod.editor.IStandaloneEditorConstructionOptions
  ): anduin.facades.monacoEditor.mod.editor.IStandaloneCodeEditor = (anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("create")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.editor.IStandaloneCodeEditor]
  @scala.inline
  def create(
    domElement: org.scalajs.dom.raw.HTMLElement,
    options: anduin.facades.monacoEditor.mod.editor.IStandaloneEditorConstructionOptions,
    `override`: anduin.facades.monacoEditor.mod.editor.IEditorOverrideServices
  ): anduin.facades.monacoEditor.mod.editor.IStandaloneCodeEditor = (anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("create")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.editor.IStandaloneCodeEditor]
  
  @scala.inline
  def createDiffEditor(domElement: org.scalajs.dom.raw.HTMLElement): anduin.facades.monacoEditor.mod.editor.IStandaloneDiffEditor = anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffEditor")(domElement.asInstanceOf[js.Any]).asInstanceOf[anduin.facades.monacoEditor.mod.editor.IStandaloneDiffEditor]
  @scala.inline
  def createDiffEditor(
    domElement: org.scalajs.dom.raw.HTMLElement,
    options: js.UndefOr[scala.Nothing],
    `override`: anduin.facades.monacoEditor.mod.editor.IEditorOverrideServices
  ): anduin.facades.monacoEditor.mod.editor.IStandaloneDiffEditor = (anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffEditor")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.editor.IStandaloneDiffEditor]
  @scala.inline
  def createDiffEditor(
    domElement: org.scalajs.dom.raw.HTMLElement,
    options: anduin.facades.monacoEditor.mod.editor.IDiffEditorConstructionOptions
  ): anduin.facades.monacoEditor.mod.editor.IStandaloneDiffEditor = (anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffEditor")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.editor.IStandaloneDiffEditor]
  @scala.inline
  def createDiffEditor(
    domElement: org.scalajs.dom.raw.HTMLElement,
    options: anduin.facades.monacoEditor.mod.editor.IDiffEditorConstructionOptions,
    `override`: anduin.facades.monacoEditor.mod.editor.IEditorOverrideServices
  ): anduin.facades.monacoEditor.mod.editor.IStandaloneDiffEditor = (anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffEditor")(domElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.editor.IStandaloneDiffEditor]
  
  @scala.inline
  def createDiffNavigator(diffEditor: anduin.facades.monacoEditor.mod.editor.IStandaloneDiffEditor): anduin.facades.monacoEditor.mod.editor.IDiffNavigator = anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffNavigator")(diffEditor.asInstanceOf[js.Any]).asInstanceOf[anduin.facades.monacoEditor.mod.editor.IDiffNavigator]
  @scala.inline
  def createDiffNavigator(
    diffEditor: anduin.facades.monacoEditor.mod.editor.IStandaloneDiffEditor,
    opts: anduin.facades.monacoEditor.mod.editor.IDiffNavigatorOptions
  ): anduin.facades.monacoEditor.mod.editor.IDiffNavigator = (anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createDiffNavigator")(diffEditor.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.editor.IDiffNavigator]
  
  @scala.inline
  def createModel(value: java.lang.String): anduin.facades.monacoEditor.mod.editor.ITextModel = anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(value.asInstanceOf[js.Any]).asInstanceOf[anduin.facades.monacoEditor.mod.editor.ITextModel]
  @scala.inline
  def createModel(
    value: java.lang.String,
    language: js.UndefOr[scala.Nothing],
    uri: anduin.facades.monacoEditor.mod.Uri
  ): anduin.facades.monacoEditor.mod.editor.ITextModel = (anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(value.asInstanceOf[js.Any], language.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.editor.ITextModel]
  @scala.inline
  def createModel(value: java.lang.String, language: java.lang.String): anduin.facades.monacoEditor.mod.editor.ITextModel = (anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(value.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.editor.ITextModel]
  @scala.inline
  def createModel(value: java.lang.String, language: java.lang.String, uri: anduin.facades.monacoEditor.mod.Uri): anduin.facades.monacoEditor.mod.editor.ITextModel = (anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createModel")(value.asInstanceOf[js.Any], language.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.editor.ITextModel]
  
  @scala.inline
  def createWebWorker[T](opts: anduin.facades.monacoEditor.mod.editor.IWebWorkerOptions): anduin.facades.monacoEditor.mod.editor.MonacoWebWorker[T] = anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("createWebWorker")(opts.asInstanceOf[js.Any]).asInstanceOf[anduin.facades.monacoEditor.mod.editor.MonacoWebWorker[T]]
  
  @scala.inline
  def defineTheme(
    themeName: java.lang.String,
    themeData: anduin.facades.monacoEditor.mod.editor.IStandaloneThemeData
  ): scala.Unit = (anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("defineTheme")(themeName.asInstanceOf[js.Any], themeData.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getModel(uri: anduin.facades.monacoEditor.mod.Uri): anduin.facades.monacoEditor.mod.editor.ITextModel | scala.Null = anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("getModel")(uri.asInstanceOf[js.Any]).asInstanceOf[anduin.facades.monacoEditor.mod.editor.ITextModel | scala.Null]
  
  @scala.inline
  def getModelMarkers(filter: anduin.facades.monacoEditor.anon.Owner): js.Array[anduin.facades.monacoEditor.mod.editor.IMarker] = anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("getModelMarkers")(filter.asInstanceOf[js.Any]).asInstanceOf[js.Array[anduin.facades.monacoEditor.mod.editor.IMarker]]
  
  @scala.inline
  def getModels(): js.Array[anduin.facades.monacoEditor.mod.editor.ITextModel] = anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("getModels")().asInstanceOf[js.Array[anduin.facades.monacoEditor.mod.editor.ITextModel]]
  
  @scala.inline
  def onDidChangeMarkers(listener: js.Function1[/* e */ js.Array[anduin.facades.monacoEditor.mod.Uri], scala.Unit]): anduin.facades.monacoEditor.mod.IDisposable = anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("onDidChangeMarkers")(listener.asInstanceOf[js.Any]).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def onDidChangeModelLanguage(listener: js.Function1[/* e */ anduin.facades.monacoEditor.anon.Model, scala.Unit]): anduin.facades.monacoEditor.mod.IDisposable = anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("onDidChangeModelLanguage")(listener.asInstanceOf[js.Any]).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def onDidCreateEditor(
    listener: js.Function1[/* codeEditor */ anduin.facades.monacoEditor.mod.editor.ICodeEditor, scala.Unit]
  ): anduin.facades.monacoEditor.mod.IDisposable = anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("onDidCreateEditor")(listener.asInstanceOf[js.Any]).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def onDidCreateModel(listener: js.Function1[/* model */ anduin.facades.monacoEditor.mod.editor.ITextModel, scala.Unit]): anduin.facades.monacoEditor.mod.IDisposable = anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("onDidCreateModel")(listener.asInstanceOf[js.Any]).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def onWillDisposeModel(listener: js.Function1[/* model */ anduin.facades.monacoEditor.mod.editor.ITextModel, scala.Unit]): anduin.facades.monacoEditor.mod.IDisposable = anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("onWillDisposeModel")(listener.asInstanceOf[js.Any]).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerCommand(
    id: java.lang.String,
    handler: js.Function2[/* accessor */ js.Any, /* repeated */ js.Any, scala.Unit]
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("registerCommand")(id.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def remeasureFonts(): scala.Unit = anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("remeasureFonts")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def setModelLanguage(model: anduin.facades.monacoEditor.mod.editor.ITextModel, languageId: java.lang.String): scala.Unit = (anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("setModelLanguage")(model.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setModelMarkers(
    model: anduin.facades.monacoEditor.mod.editor.ITextModel,
    owner: java.lang.String,
    markers: js.Array[anduin.facades.monacoEditor.mod.editor.IMarkerData]
  ): scala.Unit = (anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("setModelMarkers")(model.asInstanceOf[js.Any], owner.asInstanceOf[js.Any], markers.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setTheme(themeName: java.lang.String): scala.Unit = anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("setTheme")(themeName.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def tokenize(text: java.lang.String, languageId: java.lang.String): js.Array[js.Array[anduin.facades.monacoEditor.mod.Token]] = (anduin.facades.monacoEditor.mod.editor.^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(text.asInstanceOf[js.Any], languageId.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[anduin.facades.monacoEditor.mod.Token]]]
}
