package za.co.mmagon.jwebswing.plugins.easypiechart;

import org.junit.Test;
import za.co.mmagon.jwebswing.htmlbuilder.css.colours.ColourCSSImpl;
import za.co.mmagon.jwebswing.plugins.easingeffects.JQEasingEffects;

/**
 *
 * @author Marc Magon
 */
public class EasyPieChartTest
{

    public EasyPieChartTest()
    {
    }

    @Test
    public void testSomeMethod()
    {
        EasyPieChart epc = new EasyPieChart();
        System.out.println(epc.toString(true));
    }

    @Test
    public void testJs()
    {
        EasyPieChart epc = new EasyPieChart();
        System.out.println(epc.renderJavascript());
    }

    @Test
    public void testJsOptions()
    {
        EasyPieChart epc = new EasyPieChart();
        epc.getOptions().setBarColor(new ColourCSSImpl("#45ffee"));
        epc.getOptions().setLineWidth(2);
        epc.getOptions().getAnimate().setDuration(500);
        epc.getOptions().setLineCap(LineCapShap.Round);
        epc.getOptions().setEasing(JQEasingEffects.swing);
        System.out.println(epc.renderJavascript());
    }
}
