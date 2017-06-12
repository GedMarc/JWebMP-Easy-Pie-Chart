package za.co.mmagon.jwebswing.plugins.easypiechart;

/**
 *
 * @author Marc Magon
 * @since 12 Jun 2017
 */
public enum LineCapShap
{
    Butt,
    Round,
    Shape;
    /**
     * Any sub data
     */
    private String data;

    /**
     * A new LineCapShap
     */
    private LineCapShap()
    {

    }

    /**
     * A new LineCapShap with data
     */
    private LineCapShap(String data)
    {

    }

    /**
     * Returns the name or the data contained within
     *
     * @return
     */
    @Override
    public String toString()
    {
        if (data != null && !data.isEmpty())
        {
            return data;
        }
        else
        {
            return name().toLowerCase();
        }
    }
}
