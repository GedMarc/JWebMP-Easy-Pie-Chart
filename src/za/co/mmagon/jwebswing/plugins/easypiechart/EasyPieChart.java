package za.co.mmagon.jwebswing.plugins.easypiechart;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * The actual easy pie chart component
 *
 * @author Marc Magon
 * @since 12 Jun 2017
 */
@ComponentInformation(name = "Easy Pie Chart",
        description = "easy pie chart is a lightweight plugin to draw simple, animated pie charts for single values http://rendro.github.io/easy-pie-chart",
        url = "https://github.com/rendro/easy-pie-chart")
public class EasyPieChart extends Div
{

    private static final long serialVersionUID = 1L;
    /**
     * The percentage to be used
     */
    private double percentage;

    private EasyPieChartFeature feature;

    /**
     * Constructs with a default percentage (0.00)
     */
    public EasyPieChart()
    {
        this(0.0);
    }

    /*
     * Constructs a new EasyPieChart with a given percentage
     */
    public EasyPieChart(double percentage)
    {
        addClass("chart");
        this.percentage = percentage;
	    feature = new EasyPieChartFeature(this);
        addFeature(feature);
    }

    @Override
    public void preConfigure()
    {
        if (!isConfigured())
        {
            addAttribute("data-percent", Double.toString(percentage));
        }
        super.preConfigure();
    }

    /**
     * The percentage to be used
     *
     * @return
     */
    public double getPercentage()
    {
        return percentage;
    }

    /**
     * The percentage to be used
     *
     * @param percentage
     */
    public void setPercentage(double percentage)
    {
        this.percentage = percentage;
    }

    /**
     * Returns the associated feature
     *
     * @return
     */
    public EasyPieChartFeature getFeature()
    {
        if (feature == null)
        {
            feature = new EasyPieChartFeature(this);
        }
        return feature;
    }

    /**
     * Sets the associated feature
     *
     * @param feature
     *
     * @return
     */
    public EasyPieChart setFeature(EasyPieChartFeature feature)
    {
        this.feature = feature;
        return this;
    }

    @Override
    public EasyPieChartOptions getOptions()
    {
        return getFeature().getOptions();
    }

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

}
