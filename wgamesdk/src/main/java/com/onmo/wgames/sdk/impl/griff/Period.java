package com.onmo.wgames.sdk.impl.griff;

/**
 * Created by srini on 1/29/18.
 */

public class Period {


    private String unit;

    private int length;

    public String getUnit ()
    {
        return unit;
    }

    public void setUnit (String unit)
    {
        this.unit = unit;
    }

    public int getLength ()
    {
        return length;
    }

    public void setLength (int length)
    {
        this.length = length;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [unit = "+unit+", length = "+length+"]";
    }
}
