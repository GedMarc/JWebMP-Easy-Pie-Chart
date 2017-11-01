package za.co.mmagon.jwebswing.plugins.easypiechart;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;

/**
 * Applies the JQuery to the easy pie chart feature
 *
 * @author Marc Magon
 * @since 12 Jun 2017
 */
public class EasyPieChartFeature extends Feature<EasyPieChartOptions, EasyPieChartFeature>
{

    private static final long serialVersionUID = 1L;

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
        addQuery(getComponent().getJQueryID() + "easyPieChart(" + getOptions() + ");");
    }

}
