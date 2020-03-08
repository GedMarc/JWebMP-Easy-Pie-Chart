module com.jwebmp.plugins.easypiechart {
	exports com.jwebmp.plugins.easypiechart;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.plugins.easingeffects;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.easypiechart.EasyPieChartPageConfigurator;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.easypiechart.implementations.EasyPieChartExclusionsModule;

	opens com.jwebmp.plugins.easypiechart to com.fasterxml.jackson.databind, com.jwebmp.core;
}
