package com.onmo.wgames.sdk.impl.griff;


/**
 * Created by srini on 1/29/18.
 */

public class Billing_details {
    private String amount;

    private String available_until;

    private Credits[] credits;

    private Period period;

    private String url;

    private String currency;

    public String getAmount ()
    {
        return amount;
    }

    public void setAmount (String amount)
    {
        this.amount = amount;
    }

    public String getAvailable_until ()
    {
        return available_until;
    }

    public void setAvailable_until (String available_until)
    {
        this.available_until = available_until;
    }

    public Credits[] getCredits ()
    {
        return credits;
    }

    public void setCredits (Credits[] credits)
    {
        this.credits = credits;
    }

    public Period getPeriod ()
    {
        return period;
    }

    public void setPeriod (Period period)
    {
        this.period = period;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String getCurrency ()
    {
        return currency;
    }

    public void setCurrency (String currency)
    {
        this.currency = currency;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [amount = "+amount+", available_until = "+available_until+", credits = "+credits+", period = "+period+", url = "+url+", currency = "+currency+"]";
    }
}
