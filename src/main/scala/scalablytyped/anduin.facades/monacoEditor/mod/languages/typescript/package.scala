package anduin.facades.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typescript {
  
  type CompilerOptionsValue = js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | (js.Array[scala.Double | java.lang.String]) | anduin.facades.monacoEditor.mod.languages.typescript.MapLike[js.Array[java.lang.String]] | scala.Null
  ]
  
  type IExtraLibs = org.scalablytyped.runtime.StringDictionary[anduin.facades.monacoEditor.mod.languages.typescript.IExtraLib]
  
  type MapLike[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  @scala.inline
  def getJavaScriptWorker(): js.Promise[
    js.Function1[
      /* repeated */ anduin.facades.monacoEditor.mod.Uri, 
      js.Promise[anduin.facades.monacoEditor.mod.languages.typescript.TypeScriptWorker]
    ]
  ] = anduin.facades.monacoEditor.mod.languages.typescript.^.asInstanceOf[js.Dynamic].applyDynamic("getJavaScriptWorker")().asInstanceOf[js.Promise[
    js.Function1[
      /* repeated */ anduin.facades.monacoEditor.mod.Uri, 
      js.Promise[anduin.facades.monacoEditor.mod.languages.typescript.TypeScriptWorker]
    ]
  ]]
  
  @scala.inline
  def getTypeScriptWorker(): js.Promise[
    js.Function1[
      /* repeated */ anduin.facades.monacoEditor.mod.Uri, 
      js.Promise[anduin.facades.monacoEditor.mod.languages.typescript.TypeScriptWorker]
    ]
  ] = anduin.facades.monacoEditor.mod.languages.typescript.^.asInstanceOf[js.Dynamic].applyDynamic("getTypeScriptWorker")().asInstanceOf[js.Promise[
    js.Function1[
      /* repeated */ anduin.facades.monacoEditor.mod.Uri, 
      js.Promise[anduin.facades.monacoEditor.mod.languages.typescript.TypeScriptWorker]
    ]
  ]]
  
  @scala.inline
  def javascriptDefaults: anduin.facades.monacoEditor.mod.languages.typescript.LanguageServiceDefaults = anduin.facades.monacoEditor.mod.languages.typescript.^.asInstanceOf[js.Dynamic].selectDynamic("javascriptDefaults").asInstanceOf[anduin.facades.monacoEditor.mod.languages.typescript.LanguageServiceDefaults]
  
  @scala.inline
  def typescriptDefaults: anduin.facades.monacoEditor.mod.languages.typescript.LanguageServiceDefaults = anduin.facades.monacoEditor.mod.languages.typescript.^.asInstanceOf[js.Dynamic].selectDynamic("typescriptDefaults").asInstanceOf[anduin.facades.monacoEditor.mod.languages.typescript.LanguageServiceDefaults]
  
  @scala.inline
  def typescriptVersion: java.lang.String = anduin.facades.monacoEditor.mod.languages.typescript.^.asInstanceOf[js.Dynamic].selectDynamic("typescriptVersion").asInstanceOf[java.lang.String]
}
