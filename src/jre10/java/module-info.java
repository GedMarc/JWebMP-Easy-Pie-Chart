import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.easypiechart.EasyPieChartPageConfigurator;

module com.jwebmp.plugins.easypiechart {
	exports com.jwebmp.plugins.easypiechart;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.plugins.easingeffects;

	provides IPageConfigurator with EasyPieChartPageConfigurator;

}
