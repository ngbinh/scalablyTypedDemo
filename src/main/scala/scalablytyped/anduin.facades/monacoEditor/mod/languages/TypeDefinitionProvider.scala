package anduin.facades.monacoEditor.mod.languages

import anduin.facades.monacoEditor.mod.CancellationToken
import anduin.facades.monacoEditor.mod.Position
import anduin.facades.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeDefinitionProvider extends StObject {
  
  /**
    * Provide the type definition of the symbol at the given position and document.
    */
  def provideTypeDefinition(model: ITextModel, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[LocationLink]] = js.native
}
object TypeDefinitionProvider {
  
  @scala.inline
  def apply(
    provideTypeDefinition: (ITextModel, Position, CancellationToken) => ProviderResult[Definition | js.Array[LocationLink]]
  ): TypeDefinitionProvider = {
    val __obj = js.Dynamic.literal(provideTypeDefinition = js.Any.fromFunction3(provideTypeDefinition))
    __obj.asInstanceOf[TypeDefinitionProvider]
  }
  
  @scala.inline
  implicit class TypeDefinitionProviderMutableBuilder[Self <: TypeDefinitionProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvideTypeDefinition(
      value: (ITextModel, Position, CancellationToken) => ProviderResult[Definition | js.Array[LocationLink]]
    ): Self = StObject.set(x, "provideTypeDefinition", js.Any.fromFunction3(value))
  }
}
