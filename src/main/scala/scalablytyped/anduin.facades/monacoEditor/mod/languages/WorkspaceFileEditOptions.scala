package anduin.facades.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceFileEditOptions extends StObject {
  
  var copy: js.UndefOr[Boolean] = js.native
  
  var folder: js.UndefOr[Boolean] = js.native
  
  var ignoreIfExists: js.UndefOr[Boolean] = js.native
  
  var ignoreIfNotExists: js.UndefOr[Boolean] = js.native
  
  var maxSize: js.UndefOr[Double] = js.native
  
  var overwrite: js.UndefOr[Boolean] = js.native
  
  var recursive: js.UndefOr[Boolean] = js.native
  
  var skipTrashBin: js.UndefOr[Boolean] = js.native
}
object WorkspaceFileEditOptions {
  
  @scala.inline
  def apply(): WorkspaceFileEditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceFileEditOptions]
  }
  
  @scala.inline
  implicit class WorkspaceFileEditOptionsMutableBuilder[Self <: WorkspaceFileEditOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
    
    @scala.inline
    def setFolder(value: Boolean): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    @scala.inline
    def setIgnoreIfExists(value: Boolean): Self = StObject.set(x, "ignoreIfExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreIfExistsUndefined: Self = StObject.set(x, "ignoreIfExists", js.undefined)
    
    @scala.inline
    def setIgnoreIfNotExists(value: Boolean): Self = StObject.set(x, "ignoreIfNotExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreIfNotExistsUndefined: Self = StObject.set(x, "ignoreIfNotExists", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    @scala.inline
    def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    
    @scala.inline
    def setSkipTrashBin(value: Boolean): Self = StObject.set(x, "skipTrashBin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipTrashBinUndefined: Self = StObject.set(x, "skipTrashBin", js.undefined)
  }
}
