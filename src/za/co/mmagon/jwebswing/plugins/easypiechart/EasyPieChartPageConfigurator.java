package za.co.mmagon.jwebswing.plugins.easypiechart;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

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
        pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/EasyPieChart.jar/download"
)

class EasyPieChartPageConfigurator extends PageConfigurator
{

    private static final long serialVersionUID = 1L;

    /*
     * Constructs a new EasyPieChartPageConfigurator
     */
    public EasyPieChartPageConfigurator()
    {

    }

    @Override
    public Page configure(Page page)
    {
        if (!page.isConfigured())
        {
            JQueryPageConfigurator.setRequired(page.getBody(), true);
            page.getBody().addJavaScriptReference(EasyPieChartReferencePool.EasyPieChart.getJavaScriptReference());
        }
        return page;
    }
}
