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

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * Applies the JQuery to the easy pie chart feature
 *
 * @author Marc Magon
 * @since 12 Jun 2017
 */
public class EasyPieChartFeature
		extends Feature<GlobalFeatures, EasyPieChartOptions, EasyPieChartFeature>
{


	/*
	 * Constructs a new EasyPieChartFeature
	 */
	public EasyPieChartFeature(ComponentHierarchyBase component)
	{
		super("EasyPieChart", component);
	}

	/**
	 * Returns all the easy pie chart options
	 *
	 * @return
	 */
	@Override
	public EasyPieChartOptions getOptions()
	{
		if (super.getOptions() == null)
		{
			super.setOptions(new EasyPieChartOptions());
		}
		return super.getOptions();
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().getJQueryID() + "easyPieChart(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON);
	}

}
