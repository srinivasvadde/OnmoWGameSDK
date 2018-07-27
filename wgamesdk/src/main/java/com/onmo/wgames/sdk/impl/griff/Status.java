package com.onmo.wgames.sdk.impl.griff;

/**
 * Created by srini on 1/29/18.
 */

public class Status {
    private String last_billing_date;

    private String packid;

    private String display_cpc;

    private String status;

    private String APP_TO_HIT_URL;

    private Credits[] credits;

    private String renewal_date;

    private String retailprice;

    private String lastchargedamount;

    private String PACK_CHARGING_FREQUENCY;

    private String allow_wifi_user_purchase;

    private String type;

    private String PACK_DISPLAY_NAME;

    private String currency;

    private String description;

    private String name;

    private String automatic_renewal;

    private String PACK_CP_CALL_BACK_URL;

    private String start_date;

    public String getLast_billing_date ()
    {
        return last_billing_date;
    }

    public void setLast_billing_date (String last_billing_date)
    {
        this.last_billing_date = last_billing_date;
    }

    public String getPackid ()
    {
        return packid;
    }

    public void setPackid (String packid)
    {
        this.packid = packid;
    }

    public String getDisplay_cpc ()
    {
        return display_cpc;
    }

    public void setDisplay_cpc (String display_cpc)
    {
        this.display_cpc = display_cpc;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getAPP_TO_HIT_URL ()
    {
        return APP_TO_HIT_URL;
    }

    public void setAPP_TO_HIT_URL (String APP_TO_HIT_URL)
    {
        this.APP_TO_HIT_URL = APP_TO_HIT_URL;
    }

    public Credits[] getCredits ()
    {
        return credits;
    }

    public void setCredits (Credits[] credits)
    {
        this.credits = credits;
    }

    public String getRenewal_date ()
    {
        return renewal_date;
    }

    public void setRenewal_date (String renewal_date)
    {
        this.renewal_date = renewal_date;
    }

    public String getRetailprice ()
    {
        return retailprice;
    }

    public void setRetailprice (String retailprice)
    {
        this.retailprice = retailprice;
    }

    public String getLastchargedamount ()
    {
        return lastchargedamount;
    }

    public void setLastchargedamount (String lastchargedamount)
    {
        this.lastchargedamount = lastchargedamount;
    }

    public String getPACK_CHARGING_FREQUENCY ()
    {
        return PACK_CHARGING_FREQUENCY;
    }

    public void setPACK_CHARGING_FREQUENCY (String PACK_CHARGING_FREQUENCY)
    {
        this.PACK_CHARGING_FREQUENCY = PACK_CHARGING_FREQUENCY;
    }

    public String getAllow_wifi_user_purchase ()
    {
        return allow_wifi_user_purchase;
    }

    public void setAllow_wifi_user_purchase (String allow_wifi_user_purchase)
    {
        this.allow_wifi_user_purchase = allow_wifi_user_purchase;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getPACK_DISPLAY_NAME ()
    {
        return PACK_DISPLAY_NAME;
    }

    public void setPACK_DISPLAY_NAME (String PACK_DISPLAY_NAME)
    {
        this.PACK_DISPLAY_NAME = PACK_DISPLAY_NAME;
    }

    public String getCurrency ()
    {
        return currency;
    }

    public void setCurrency (String currency)
    {
        this.currency = currency;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getAutomatic_renewal ()
    {
        return automatic_renewal;
    }

    public void setAutomatic_renewal (String automatic_renewal)
    {
        this.automatic_renewal = automatic_renewal;
    }

    public String getPACK_CP_CALL_BACK_URL ()
    {
        return PACK_CP_CALL_BACK_URL;
    }

    public void setPACK_CP_CALL_BACK_URL (String PACK_CP_CALL_BACK_URL)
    {
        this.PACK_CP_CALL_BACK_URL = PACK_CP_CALL_BACK_URL;
    }

    public String getStart_date ()
    {
        return start_date;
    }

    public void setStart_date (String start_date)
    {
        this.start_date = start_date;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [last_billing_date = "+last_billing_date+", packid = "+packid+", display_cpc = "+display_cpc+", status = "+status+", APP_TO_HIT_URL = "+APP_TO_HIT_URL+", credits = "+credits+", renewal_date = "+renewal_date+", retailprice = "+retailprice+", lastchargedamount = "+lastchargedamount+", PACK_CHARGING_FREQUENCY = "+PACK_CHARGING_FREQUENCY+", allow_wifi_user_purchase = "+allow_wifi_user_purchase+", type = "+type+", PACK_DISPLAY_NAME = "+PACK_DISPLAY_NAME+", currency = "+currency+", description = "+description+", name = "+name+", automatic_renewal = "+automatic_renewal+", PACK_CP_CALL_BACK_URL = "+PACK_CP_CALL_BACK_URL+", start_date = "+start_date+"]";
    }
}
