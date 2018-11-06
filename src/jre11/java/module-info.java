import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.easypiechart.EasyPieChartPageConfigurator;
import com.jwebmp.plugins.easypiechart.implementations.EasyPieChartExclusionsModule;

module com.jwebmp.plugins.easypiechart {
	exports com.jwebmp.plugins.easypiechart;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.plugins.easingeffects;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with EasyPieChartPageConfigurator;

	provides IGuiceScanModuleExclusions with EasyPieChartExclusionsModule;
	provides IGuiceScanJarExclusions with EasyPieChartExclusionsModule;

	opens com.jwebmp.plugins.easypiechart to com.fasterxml.jackson.databind, com.jwebmp.core;
}
