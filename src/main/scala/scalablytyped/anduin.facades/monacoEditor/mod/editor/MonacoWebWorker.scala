package anduin.facades.monacoEditor.mod.editor

import anduin.facades.monacoEditor.mod.Uri
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonacoWebWorker[T] extends StObject {
  
  /**
    * Terminate the web worker, thus invalidating the returned proxy.
    */
  def dispose(): Unit = js.native
  
  /**
    * Get a proxy to the arbitrary loaded code.
    */
  def getProxy(): js.Promise[T] = js.native
  
  /**
    * Synchronize (send) the models at `resources` to the web worker,
    * making them available in the monaco.worker.getMirrorModels().
    */
  def withSyncedResources(resources: js.Array[Uri]): js.Promise[T] = js.native
}
object MonacoWebWorker {
  
  @scala.inline
  def apply[T](
    dispose: Callback,
    getProxy: CallbackTo[js.Promise[T]],
    withSyncedResources: js.Array[Uri] => js.Promise[T]
  ): MonacoWebWorker[T] = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, getProxy = getProxy.toJsFn, withSyncedResources = js.Any.fromFunction1(withSyncedResources))
    __obj.asInstanceOf[MonacoWebWorker[T]]
  }
  
  @scala.inline
  implicit class MonacoWebWorkerMutableBuilder[Self <: MonacoWebWorker[_], T] (val x: Self with MonacoWebWorker[T]) extends AnyVal {
    
    @scala.inline
    def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    @scala.inline
    def setGetProxy(value: CallbackTo[js.Promise[T]]): Self = StObject.set(x, "getProxy", value.toJsFn)
    
    @scala.inline
    def setWithSyncedResources(value: js.Array[Uri] => js.Promise[T]): Self = StObject.set(x, "withSyncedResources", js.Any.fromFunction1(value))
  }
}
