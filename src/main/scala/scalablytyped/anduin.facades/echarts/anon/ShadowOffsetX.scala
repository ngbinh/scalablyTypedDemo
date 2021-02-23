package anduin.facades.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShadowOffsetX extends StObject {
  
  /**
    * Line color.
    *
    * > Color can be represented in RGB, for example
    * `'rgb(128, 128, 128)'`.
    * RGBA can be used when you need alpha channel,
    * for example `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example
    * `'#ccc'`.
    * Gradient color and texture are also supported
    * besides single colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markLine.data.1.lineStyle)
    *
    *
    * @default
    * "#000"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.color
    */
  var color: js.UndefOr[anduin.facades.echarts.echarts.EChartOption.Color] = js.native
  
  /**
    * Edge curvature, which supports value from 0 to
    * 1.
    * The larger the value, the greater the curvature.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.curveness
    */
  var curveness: js.UndefOr[Double] = js.native
  
  /**
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.emphasis
    */
  var emphasis: js.UndefOr[ShadowColor] = js.native
  
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component
    * will not be drawn when set to 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-scatter.scatter.markLine.data.1.lineStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.native
  
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.shadowColor
    */
  var shadowColor: js.UndefOr[anduin.facades.echarts.echarts.EChartOption.Color] = js.native
  
  /**
    * Offset distance on the horizontal direction of
    * shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  
  /**
    * Offset distance on the vertical direction of
    * shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
  
  /**
    * line type.
    *
    * Options are:
    *
    * + `'solid'`
    * + `'dashed'`
    * + `'dotted'`
    *
    *
    * @default
    * "solid"
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.type
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * line width.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-scatter.markLine.data.1.lineStyle.width
    */
  var width: js.UndefOr[Double] = js.native
}
object ShadowOffsetX {
  
  @scala.inline
  def apply(): ShadowOffsetX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowOffsetX]
  }
  
  @scala.inline
  implicit class ShadowOffsetXMutableBuilder[Self <: ShadowOffsetX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: anduin.facades.echarts.echarts.EChartOption.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCurveness(value: Double): Self = StObject.set(x, "curveness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurvenessUndefined: Self = StObject.set(x, "curveness", js.undefined)
    
    @scala.inline
    def setEmphasis(value: ShadowColor): Self = StObject.set(x, "emphasis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmphasisUndefined: Self = StObject.set(x, "emphasis", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setShadowBlur(value: Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
    
    @scala.inline
    def setShadowColor(value: anduin.facades.echarts.echarts.EChartOption.Color): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    @scala.inline
    def setShadowOffsetX(value: Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffsetXUndefined: Self = StObject.set(x, "shadowOffsetX", js.undefined)
    
    @scala.inline
    def setShadowOffsetY(value: Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowOffsetYUndefined: Self = StObject.set(x, "shadowOffsetY", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
