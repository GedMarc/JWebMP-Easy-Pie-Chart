package com.jwebmp.plugins.easypiechart;

import com.jwebmp.core.htmlbuilder.css.colours.ColourCSSImpl;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.easingeffects.JQEasingEffects;

/**
 * All the options available for the easy pie chart
 *
 * @author Marc Magon
 * @since 12 Jun 2017
 */
public class EasyPieChartOptions
		extends JavaScriptPart
{

	private static final long serialVersionUID = 1L;

	/**
	 * The color of the curcular bar. You can either pass a valid css color string, or a function that takes the current percentage as a value and returns a valid css color
	 * string.*
	 */
	private ColourCSSImpl barColor;
	/**
	 * The color of the track, or false to disable rendering.*
	 */
	private ColourCSSImpl trackColor;
	/**
	 * The color of the scale lines, false to disable rendering.*
	 */
	private ColourCSSImpl scaleColor;
	/**
	 * Length of the scale lines (reduces the radius of the chart).*
	 */
	private Number scaleLength;
	/**
	 * Defines how the ending of the bar line looks like. Possible values are: butt, round and square.*
	 */
	private LineCapShap lineCap;
	/**
	 * Width of the chart line in px.*
	 */
	private Number lineWidth;
	/**
	 * Size of the pie chart in px. It will always be a square.*
	 */
	private Number size;
	/**
	 * Rotation of the complete chart in degrees.*
	 */
	private Number rotate;
	/**
	 * Object with time in milliseconds and boolean for an animation of the bar growing ({ duration: 1000, enabled: true }), or false to deactivate animations.*
	 */
	private EasyPieChartAnimations animate;
	/**
	 * Easing function or string with the name of a jQuery easing function*
	 */
	private JQEasingEffects easing;

	/*
	 * Constructs a new EasyPieChartOptions
	 */
	public EasyPieChartOptions()
	{
		//Nothing needed
	}

	/**
	 * The color of the curcular bar. You can either pass a valid css color string, or a function that takes the current percentage as a value and returns a valid css color string.
	 *
	 * @return
	 */
	public ColourCSSImpl getBarColor()
	{
		return barColor;
	}

	/**
	 * The color of the curcular bar. You can either pass a valid css color string, or a function that takes the current percentage as a value and returns a valid css color string.
	 *
	 * @param barColor
	 *
	 * @return
	 */
	public EasyPieChartOptions setBarColor(ColourCSSImpl barColor)
	{
		this.barColor = barColor;
		return this;
	}

	/**
	 * The color of the track, or false to disable rendering.
	 *
	 * @return
	 */
	public ColourCSSImpl getTrackColor()
	{
		return trackColor;
	}

	/**
	 * The color of the track, or false to disable rendering.
	 *
	 * @param trackColor
	 *
	 * @return
	 */
	public EasyPieChartOptions setTrackColor(ColourCSSImpl trackColor)
	{
		this.trackColor = trackColor;
		return this;
	}

	/**
	 * The color of the scale lines, false to disable rendering.
	 *
	 * @return
	 */
	public ColourCSSImpl getScaleColor()
	{
		return scaleColor;
	}

	/**
	 * The color of the scale lines, false to disable rendering.
	 *
	 * @param scaleColor
	 *
	 * @return
	 */
	public EasyPieChartOptions setScaleColor(ColourCSSImpl scaleColor)
	{
		this.scaleColor = scaleColor;
		return this;
	}

	/**
	 * Length of the scale lines (reduces the radius of the chart
	 *
	 * @return
	 */
	public Number getScaleLength()
	{
		return scaleLength;
	}

	/**
	 * Length of the scale lines (reduces the radius of the chart
	 *
	 * @param scaleLength
	 *
	 * @return
	 */
	public EasyPieChartOptions setScaleLength(Number scaleLength)
	{
		this.scaleLength = scaleLength;
		return this;
	}

	/**
	 * Defines how the ending of the bar line looks like. Possible values are: butt, round and square.
	 *
	 * @return
	 */
	public LineCapShap getLineCap()
	{
		return lineCap;
	}

	/**
	 * Defines how the ending of the bar line looks like. Possible values are: butt, round and square.
	 *
	 * @param lineCap
	 *
	 * @return
	 */
	public EasyPieChartOptions setLineCap(LineCapShap lineCap)
	{
		this.lineCap = lineCap;
		return this;
	}

	/**
	 * Width of the chart line in px.
	 *
	 * @return
	 */
	public Number getLineWidth()
	{
		return lineWidth;
	}

	/**
	 * Width of the chart line in px.
	 *
	 * @param lineWidth
	 *
	 * @return
	 */
	public EasyPieChartOptions setLineWidth(Number lineWidth)
	{
		this.lineWidth = lineWidth;
		return this;
	}

	/**
	 * Size of the pie chart in px. It will always be a square
	 *
	 * @return
	 */
	public Number getSize()
	{
		return size;
	}

	/**
	 * Size of the pie chart in px. It will always be a square
	 *
	 * @param size
	 *
	 * @return
	 */
	public EasyPieChartOptions setSize(Number size)
	{
		this.size = size;
		return this;
	}

	/**
	 * Rotation of the complete chart in degrees.
	 *
	 * @return
	 */
	public Number getRotate()
	{
		return rotate;
	}

	/**
	 * Rotation of the complete chart in degrees.
	 *
	 * @param rotate
	 *
	 * @return
	 */
	public EasyPieChartOptions setRotate(Number rotate)
	{
		this.rotate = rotate;
		return this;
	}

	/**
	 * Object with time in milliseconds and boolean for an animation of the bar growing ({ duration: 1000, enabled: true }), or false to deactivate animations.
	 *
	 * @return
	 */
	public EasyPieChartAnimations getAnimate()
	{
		if (animate == null)
		{
			animate = new EasyPieChartAnimations();
		}
		return animate;
	}

	/**
	 * Object with time in milliseconds and boolean for an animation of the bar growing ({ duration: 1000, enabled: true }), or false to deactivate animations.
	 *
	 * @param animate
	 *
	 * @return
	 */
	public EasyPieChartOptions setAnimate(EasyPieChartAnimations animate)
	{
		this.animate = animate;
		return this;
	}

	/**
	 * Easing function or string with the name of a jQuery easing function
	 *
	 * @return
	 */
	public JQEasingEffects getEasing()
	{
		return easing;
	}

	/**
	 * Easing function or string with the name of a jQuery easing function
	 *
	 * @param easing
	 *
	 * @return
	 */
	public EasyPieChartOptions setEasing(JQEasingEffects easing)
	{
		this.easing = easing;
		return this;
	}

}
