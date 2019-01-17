/*
 * Copyright (C) 2017 GedMarc
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

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Allows enabling or disabling animations - they are enabled by default through non-nullables.
 *
 * @author GedMarc
 * @since 12 Jun 2017
 */
public class EasyPieChartAnimations
		extends JavaScriptPart
{


	/**
	 * Object with time in milliseconds and boolean
	 */
	private int duration = 1000;
	/**
	 * Object with time in milliseconds and boolean
	 */
	private boolean enabled = true;

	/*
	 * Constructs a new EasyPieChartAnimations
	 */
	public EasyPieChartAnimations()
	{
		//Nothing needed
	}

	/**
	 * Object with time in milliseconds and boolean
	 *
	 * @return
	 */
	public int getDuration()
	{
		return duration;
	}

	/**
	 * Object with time in milliseconds and boolean
	 *
	 * @param duration
	 */
	public void setDuration(int duration)
	{
		this.duration = duration;
	}

	/**
	 * Object with time in milliseconds and boolean
	 *
	 * @return
	 */
	public boolean isEnabled()
	{
		return enabled;
	}

	/**
	 * Object with time in milliseconds and boolean
	 *
	 * @param enabled
	 */
	public void setEnabled(boolean enabled)
	{
		this.enabled = enabled;
	}

}
