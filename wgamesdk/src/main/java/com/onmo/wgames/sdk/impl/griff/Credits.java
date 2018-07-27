package com.onmo.wgames.sdk.impl.griff;

/**
 * Created by srini on 1/29/18.
 */

public class Credits {

    private String allowed;

    private String unit;

    private String type;

    public String getAllowed ()
    {
        return allowed;
    }

    public void setAllowed (String allowed)
    {
        this.allowed = allowed;
    }

    public String getUnit ()
    {
        return unit;
    }

    public void setUnit (String unit)
    {
        this.unit = unit;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [allowed = "+allowed+", unit = "+unit+", type = "+type+"]";
    }
}
