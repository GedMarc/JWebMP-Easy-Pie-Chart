package com.jwebmp.plugins.easypiechart;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

/**
 * The Easy Pie Chart Configuration
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Easy Pie Chart",
		pluginDescription = "easy pie chart is a lightweight plugin to draw simple, animated pie charts for single values http://rendro.github.io/easy-pie-chart",
		pluginUniqueName = "jwebswing-easy-pie-chart",
		pluginVersion = "2.1.7",
		pluginCategories = "charting,pie,easy pie,ui,web ui, framework",
		pluginSubtitle = "ightweight plugin to render simple, animated and retina optimized pie charts",
		pluginSourceUrl = "https://github.com/rendro/easy-pie-charte",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Easy-Pie-Chart/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Easy-Pie-Chart",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://github.com/rendro/easy-pie-chart",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/EasyPieChart.jar/download")

@SuppressWarnings("unused")
public class EasyPieChartPageConfigurator
		implements IPageConfigurator
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/*
	 * Constructs a new EasyPieChartPageConfigurator
	 */
	public EasyPieChartPageConfigurator()
	{
		//Nothing Needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return EasyPieChartPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		EasyPieChartPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			page.getBody()
			    .addJavaScriptReference(EasyPieChartReferencePool.EasyPieChart.getJavaScriptReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return EasyPieChartPageConfigurator.enabled;
	}
}
