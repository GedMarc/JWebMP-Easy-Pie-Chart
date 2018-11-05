package com.jwebmp.plugins.easypiechart.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class EasyPieChartExclusionsModule
		implements IGuiceScanModuleExclusions<EasyPieChartExclusionsModule>,
				           IGuiceScanJarExclusions<EasyPieChartExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-easy-pie-chart-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.easypiechart");
		return strings;
	}
}
