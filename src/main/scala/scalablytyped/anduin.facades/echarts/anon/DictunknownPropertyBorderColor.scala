package anduin.facades.echarts.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictunknownPropertyBorderColor
  extends /**
  * Some properties like "normal" or "emphasis" are not documented.
  * Please, write description for them
  */
/* unknownProperty */ StringDictionary[js.Any] {
  
  /**
    * border color, whose format is similar to that of `color`.
    *
    *
    * @default
    * "#000"
    * @see https://echarts.apache.org/en/option.html#series-pie.itemStyle.borderColor
    */
  var borderColor: js.UndefOr[anduin.facades.echarts.echarts.EChartOption.Color] = js.native
  
  /**
    * Border type, which can be `'solid'`, `'dashed'`, or `'dotted'`.
    * `'solid'` by default.
    *
    *
    * @default
    * "solid"
    * @see https://echarts.apache.org/en/option.html#series-pie.itemStyle.borderType
    */
  var borderType: js.UndefOr[String] = js.native
  
  /**
    * border width. No border when it is set to be 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.itemStyle.borderWidth
    */
  var borderWidth: js.UndefOr[Double] = js.native
  
  /**
    * color. Color is taken from
    * [option.color Palette](https://echarts.apache.org/en/option.html#color)
    * by default.
    *
    * > Color can be represented in RGB, for example `'rgb(128,
    * 128, 128)'`.
    * RGBA can be used when you need alpha channel, for example
    * `'rgba(128, 128, 128, 0.5)'`.
    * You may also use hexadecimal format, for example `'#ccc'`.
    * Gradient color and texture are also supported besides single
    * colors.
    * >
    * > [see doc](https://echarts.apache.org/en/option.html#series-pie.pie.itemStyle)
    *
    * Supports callback functions, in the form of:
    *
    * ```
    * (params: Object) => Color
    *
    * ```
    *
    * Input parameters are `seriesIndex`, `dataIndex`, `data`,
    * `value`, and etc. of data item.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.itemStyle.color
    */
  var color: js.UndefOr[anduin.facades.echarts.echarts.EChartOption.Color | js.Function] = js.native
  
  /**
    * Opacity of the component.
    * Supports value from 0 to 1, and the component will not be
    * drawn when set to 0.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.itemStyle.opacity
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * Size of shadow blur.
    * This attribute should be used along with `shadowColor`,`shadowOffsetX`,
    * `shadowOffsetY` to set shadow to component.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-pie.pie.itemStyle)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.itemStyle.shadowBlur
    */
  var shadowBlur: js.UndefOr[Double] = js.native
  
  /**
    * Shadow color. Support same format as `color`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.itemStyle.shadowColor
    */
  var shadowColor: js.UndefOr[anduin.facades.echarts.echarts.EChartOption.Color] = js.native
  
  /**
    * Offset distance on the horizontal direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.itemStyle.shadowOffsetX
    */
  var shadowOffsetX: js.UndefOr[Double] = js.native
  
  /**
    * Offset distance on the vertical direction of shadow.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-pie.itemStyle.shadowOffsetY
    */
  var shadowOffsetY: js.UndefOr[Double] = js.native
}
object DictunknownPropertyBorderColor {
  
  @scala.inline
  def apply(): DictunknownPropertyBorderColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictunknownPropertyBorderColor]
  }
  
  @scala.inline
  implicit class DictunknownPropertyBorderColorMutableBuilder[Self <: DictunknownPropertyBorderColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: anduin.facades.echarts.echarts.EChartOption.Color): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderType(value: String): Self = StObject.set(x, "borderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTypeUndefined: Self = StObject.set(x, "borderType", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    @scala.inline
    def setColor(value: anduin.facades.echarts.echarts.EChartOption.Color | js.Function): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
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
  }
}
