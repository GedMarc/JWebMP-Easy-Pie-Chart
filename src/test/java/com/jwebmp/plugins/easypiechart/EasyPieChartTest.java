/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.easypiechart;

import com.jwebmp.htmlbuilder.css.colours.ColourCSSImpl;
import com.jwebmp.plugins.easingeffects.JQEasingEffects;
import org.junit.jupiter.api.Test;

/**
 * @author Marc Magon
 */
public class EasyPieChartTest
{

	public EasyPieChartTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		EasyPieChart epc = new EasyPieChart();
		System.out.println(epc.toString(true));
	}

	@Test
	public void testJs()
	{
		EasyPieChart epc = new EasyPieChart();
		System.out.println(epc.renderJavascript());
	}

	@Test
	public void testJsOptions()
	{
		EasyPieChart epc = new EasyPieChart();
		epc.getOptions()
		   .setBarColor(new ColourCSSImpl("#45ffee"));
		epc.getOptions()
		   .setLineWidth(2);
		epc.getOptions()
		   .getAnimate()
		   .setDuration(500);
		epc.getOptions()
		   .setLineCap(LineCapShap.Round);
		epc.getOptions()
		   .setEasing(JQEasingEffects.swing);
		System.out.println(epc.renderJavascript());
	}
}
