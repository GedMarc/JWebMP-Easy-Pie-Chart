package com.jwebmp.plugins.easypiechart.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class EasyPieChartInclusionModule implements IGuiceScanModuleInclusions<EasyPieChartInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.easypiechart");
		return set;
	}
}
