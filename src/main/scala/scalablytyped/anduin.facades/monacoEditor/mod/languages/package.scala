package anduin.facades.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object languages {
  
  type CharacterPair = js.Tuple2[java.lang.String, java.lang.String]
  
  type Definition = anduin.facades.monacoEditor.mod.languages.Location | (js.Array[
    anduin.facades.monacoEditor.mod.languages.Location | anduin.facades.monacoEditor.mod.languages.LocationLink
  ])
  
  type IMonarchLanguageAction = anduin.facades.monacoEditor.mod.languages.IShortMonarchLanguageAction | anduin.facades.monacoEditor.mod.languages.IExpandedMonarchLanguageAction | (js.Array[
    anduin.facades.monacoEditor.mod.languages.IExpandedMonarchLanguageAction | anduin.facades.monacoEditor.mod.languages.IShortMonarchLanguageAction
  ])
  
  type IMonarchLanguageRule = anduin.facades.monacoEditor.mod.languages.IShortMonarchLanguageRule1 | anduin.facades.monacoEditor.mod.languages.IShortMonarchLanguageRule2 | anduin.facades.monacoEditor.mod.languages.IExpandedMonarchLanguageRule
  
  type IShortMonarchLanguageAction = java.lang.String
  
  type IShortMonarchLanguageRule1 = js.Tuple2[
    java.lang.String | js.RegExp, 
    anduin.facades.monacoEditor.mod.languages.IMonarchLanguageAction
  ]
  
  type IShortMonarchLanguageRule2 = js.Tuple3[
    java.lang.String | js.RegExp, 
    anduin.facades.monacoEditor.mod.languages.IMonarchLanguageAction, 
    java.lang.String
  ]
  
  type ProviderResult[T] = js.UndefOr[
    T | scala.Null | (anduin.facades.monacoEditor.mod.Thenable[js.UndefOr[T | scala.Null]])
  ]
  
  @scala.inline
  def getEncodedLanguageId(languageId: java.lang.String): scala.Double = anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("getEncodedLanguageId")(languageId.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  @scala.inline
  def getLanguages(): js.Array[anduin.facades.monacoEditor.mod.languages.ILanguageExtensionPoint] = anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("getLanguages")().asInstanceOf[js.Array[anduin.facades.monacoEditor.mod.languages.ILanguageExtensionPoint]]
  
  @scala.inline
  def onLanguage(languageId: java.lang.String, callback: js.Function0[scala.Unit]): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("onLanguage")(languageId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def register(language: anduin.facades.monacoEditor.mod.languages.ILanguageExtensionPoint): scala.Unit = anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("register")(language.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def registerCodeActionProvider(
    languageId: java.lang.String,
    provider: anduin.facades.monacoEditor.mod.languages.CodeActionProvider
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerCodeActionProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerCodeLensProvider(languageId: java.lang.String, provider: anduin.facades.monacoEditor.mod.languages.CodeLensProvider): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerCodeLensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerColorProvider(
    languageId: java.lang.String,
    provider: anduin.facades.monacoEditor.mod.languages.DocumentColorProvider
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerColorProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerCompletionItemProvider(
    languageId: java.lang.String,
    provider: anduin.facades.monacoEditor.mod.languages.CompletionItemProvider
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerCompletionItemProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerDeclarationProvider(
    languageId: java.lang.String,
    provider: anduin.facades.monacoEditor.mod.languages.DeclarationProvider
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDeclarationProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerDefinitionProvider(
    languageId: java.lang.String,
    provider: anduin.facades.monacoEditor.mod.languages.DefinitionProvider
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDefinitionProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerDocumentFormattingEditProvider(
    languageId: java.lang.String,
    provider: anduin.facades.monacoEditor.mod.languages.DocumentFormattingEditProvider
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentFormattingEditProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerDocumentHighlightProvider(
    languageId: java.lang.String,
    provider: anduin.facades.monacoEditor.mod.languages.DocumentHighlightProvider
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentHighlightProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerDocumentRangeFormattingEditProvider(
    languageId: java.lang.String,
    provider: anduin.facades.monacoEditor.mod.languages.DocumentRangeFormattingEditProvider
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentRangeFormattingEditProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerDocumentRangeSemanticTokensProvider(
    languageId: java.lang.String,
    provider: anduin.facades.monacoEditor.mod.languages.DocumentRangeSemanticTokensProvider
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentRangeSemanticTokensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerDocumentSemanticTokensProvider(
    languageId: java.lang.String,
    provider: anduin.facades.monacoEditor.mod.languages.DocumentSemanticTokensProvider
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentSemanticTokensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerDocumentSymbolProvider(
    languageId: java.lang.String,
    provider: anduin.facades.monacoEditor.mod.languages.DocumentSymbolProvider
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerDocumentSymbolProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerFoldingRangeProvider(
    languageId: java.lang.String,
    provider: anduin.facades.monacoEditor.mod.languages.FoldingRangeProvider
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerFoldingRangeProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerHoverProvider(languageId: java.lang.String, provider: anduin.facades.monacoEditor.mod.languages.HoverProvider): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerHoverProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerImplementationProvider(
    languageId: java.lang.String,
    provider: anduin.facades.monacoEditor.mod.languages.ImplementationProvider
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerImplementationProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerLinkProvider(languageId: java.lang.String, provider: anduin.facades.monacoEditor.mod.languages.LinkProvider): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerLinkProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerLinkedEditingRangeProvider(
    languageId: java.lang.String,
    provider: anduin.facades.monacoEditor.mod.languages.LinkedEditingRangeProvider
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerLinkedEditingRangeProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerOnTypeFormattingEditProvider(
    languageId: java.lang.String,
    provider: anduin.facades.monacoEditor.mod.languages.OnTypeFormattingEditProvider
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerOnTypeFormattingEditProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerReferenceProvider(
    languageId: java.lang.String,
    provider: anduin.facades.monacoEditor.mod.languages.ReferenceProvider
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerReferenceProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerRenameProvider(languageId: java.lang.String, provider: anduin.facades.monacoEditor.mod.languages.RenameProvider): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerRenameProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerSelectionRangeProvider(
    languageId: java.lang.String,
    provider: anduin.facades.monacoEditor.mod.languages.SelectionRangeProvider
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerSelectionRangeProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerSignatureHelpProvider(
    languageId: java.lang.String,
    provider: anduin.facades.monacoEditor.mod.languages.SignatureHelpProvider
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerSignatureHelpProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def registerTypeDefinitionProvider(
    languageId: java.lang.String,
    provider: anduin.facades.monacoEditor.mod.languages.TypeDefinitionProvider
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("registerTypeDefinitionProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def setColorMap(): scala.Unit = anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("setColorMap")().asInstanceOf[scala.Unit]
  @scala.inline
  def setColorMap(colorMap: js.Array[java.lang.String]): scala.Unit = anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("setColorMap")(colorMap.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setLanguageConfiguration(
    languageId: java.lang.String,
    configuration: anduin.facades.monacoEditor.mod.languages.LanguageConfiguration
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("setLanguageConfiguration")(languageId.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def setMonarchTokensProvider(
    languageId: java.lang.String,
    languageDef: anduin.facades.monacoEditor.mod.Thenable[anduin.facades.monacoEditor.mod.languages.IMonarchLanguage]
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("setMonarchTokensProvider")(languageId.asInstanceOf[js.Any], languageDef.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  @scala.inline
  def setMonarchTokensProvider(
    languageId: java.lang.String,
    languageDef: anduin.facades.monacoEditor.mod.languages.IMonarchLanguage
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("setMonarchTokensProvider")(languageId.asInstanceOf[js.Any], languageDef.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  
  @scala.inline
  def setTokensProvider(
    languageId: java.lang.String,
    provider: anduin.facades.monacoEditor.mod.Thenable[
      anduin.facades.monacoEditor.mod.languages.TokensProvider | anduin.facades.monacoEditor.mod.languages.EncodedTokensProvider
    ]
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("setTokensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  @scala.inline
  def setTokensProvider(
    languageId: java.lang.String,
    provider: anduin.facades.monacoEditor.mod.languages.EncodedTokensProvider
  ): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("setTokensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
  @scala.inline
  def setTokensProvider(languageId: java.lang.String, provider: anduin.facades.monacoEditor.mod.languages.TokensProvider): anduin.facades.monacoEditor.mod.IDisposable = (anduin.facades.monacoEditor.mod.languages.^.asInstanceOf[js.Dynamic].applyDynamic("setTokensProvider")(languageId.asInstanceOf[js.Any], provider.asInstanceOf[js.Any])).asInstanceOf[anduin.facades.monacoEditor.mod.IDisposable]
}
