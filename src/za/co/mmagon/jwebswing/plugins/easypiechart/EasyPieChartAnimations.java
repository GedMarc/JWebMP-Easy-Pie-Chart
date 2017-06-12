package za.co.mmagon.jwebswing.plugins.easypiechart;

import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 * Allows enabling or disabling animations - they are enabled by default through non-nullables.
 *
 * @author Marc Magon
 * @since 12 Jun 2017
 */
public class EasyPieChartAnimations extends JavaScriptPart
{

    /**
     * Object with time in milliseconds and boolean
     */
    private int duration = 1000;
    /**
     * Object with time in milliseconds and boolean
     */
    private boolean enabled = true;

    private static final long serialVersionUID = 1L;

    /*
     * Constructs a new EasyPieChartAnimations
     */
    public EasyPieChartAnimations()
    {
        //Nothing needed
    }

    /**
     * Object with time in milliseconds and boolean
     *
     * @return
     */
    public int getDuration()
    {
        return duration;
    }

    /**
     * Object with time in milliseconds and boolean
     *
     * @param duration
     */
    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    /**
     * Object with time in milliseconds and boolean
     *
     * @return
     */
    public boolean isEnabled()
    {
        return enabled;
    }

    /**
     * Object with time in milliseconds and boolean
     *
     * @param enabled
     */
    public void setEnabled(boolean enabled)
    {
        this.enabled = enabled;
    }

}
