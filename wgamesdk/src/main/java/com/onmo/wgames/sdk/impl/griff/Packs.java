package com.onmo.wgames.sdk.impl.griff;

/**
 * Created by srini on 1/29/18.
 */

public class Packs  implements Comparable {
    private String packid;

    private String display_cpc;

    private String APP_TO_HIT_URL;

    private String retailprice;

    private String PACK_CHARGING_FREQUENCY;

    private String allow_wifi_user_purchase;

    private String type;

    private String PACK_DISPLAY_NAME;

    private String description;

    private String name;

    private String automatic_renewal;

    private String PACK_CP_CALL_BACK_URL;

    private Billing_details billing_details;

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

    public String getAPP_TO_HIT_URL ()
    {
        return APP_TO_HIT_URL;
    }

    public void setAPP_TO_HIT_URL (String APP_TO_HIT_URL)
    {
        this.APP_TO_HIT_URL = APP_TO_HIT_URL;
    }

    public String getRetailprice ()
    {
        return retailprice;
    }

    public void setRetailprice (String retailprice)
    {
        this.retailprice = retailprice;
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

    public Billing_details getBilling_details ()
    {
        return billing_details;
    }

    public void setBilling_details (Billing_details billing_details)
    {
        this.billing_details = billing_details;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [packid = "+packid+", display_cpc = "+display_cpc+", APP_TO_HIT_URL = "+APP_TO_HIT_URL+", retailprice = "+retailprice+", PACK_CHARGING_FREQUENCY = "+PACK_CHARGING_FREQUENCY+", allow_wifi_user_purchase = "+allow_wifi_user_purchase+", type = "+type+", PACK_DISPLAY_NAME = "+PACK_DISPLAY_NAME+", description = "+description+", name = "+name+", automatic_renewal = "+automatic_renewal+", PACK_CP_CALL_BACK_URL = "+PACK_CP_CALL_BACK_URL+", billing_details = "+billing_details+"]";
    }


    @Override
    public int compareTo(Object o) {
        int noOfDays = ((Packs)o).getBilling_details().getPeriod().getLength();
        /* For Descending order*/
        return noOfDays- getBilling_details().getPeriod().getLength();
    }
}
